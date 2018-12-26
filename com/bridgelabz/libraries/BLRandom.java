/**
 * purpose : A library of static methods to generate pseudo-random numbers from
 *  		 different distributions (bernoulli, uniform, gaussian, discrete,and shuffle)
 * @author : Nikhil Mondhe
 * @version: 1.0
 * @since  : 30/11/2018
 */
package com.bridgelabz.libraries;

import java.util.Random;

public class BLRandom {
	
	 private static Random random;    // pseudo-random number generator
	 private static long seed;
	 
	 static 
	 {
	        // this is how the seed was set in Java 1.4
	        seed = System.currentTimeMillis();
	        random = new Random(seed);
	 }
	 /**
	  * Function is used enables you to produce the same sequence of "random" 
	  * 
	  * number for each execution of the program.
      *  
	  * @param s the seed
	  */
	public static void setSeed(long s) 
	 {
	        seed   = s;
	        random = new Random(seed);
	 }
	 /**
     * Function the seed of the pseudo-random number generator.
     *
     * @return the seed
     */
    public static long getSeed() {
    		return seed;
    }
    /**
     * Returns a random integer uniformly in [0, n).
     * 
     * @param n number of possible integers
     * @return a random integer uniformly between 0 (inclusive) and {@code n} (exclusive)
     * @throws IllegalArgumentException if {@code n <= 0}
     */
    public static int uniform(int n) {
        if (n <= 0) throw new IllegalArgumentException("argument must be positive: " + n);
        return random.nextInt(n);
    }
     /**
     * Returns a random real number uniformly in [0, 1).
     *
     * @return a random real number uniformly in [0, 1)
     */
    public static double uniform() {
       return random.nextDouble();
    }
    /**
     * Returns a random real number uniformly in lo, hi.
     * 
     * @param  lo the left endpoint
     * @param  hi the right endpoint
     * @return lo random real number uniformly in lo, hi
     * @throws IllegalArgumentException unless a < b
     */
    public static double uniform(double lo, double hi) {
        if (!(lo < hi)) {
            throw new IllegalArgumentException("invalid range: [" + lo + ", " + hi + ")");
        }
        return lo + uniform() * (hi-lo);
    }
     /**
     * Returns a random boolean from a Bernoulli distribution with success
     * probability <em>p</em>.
     *
     * @param  p the probability of returning true
     * @return true with probability  p and
     *         false with probability  1 - p
     * @throws IllegalArgumentException unless  0 &le;  p &le
     */
    public static boolean bernoulli(double p) {
        if (!(p >= 0.0 && p <= 1.0))
            throw new IllegalArgumentException("probability p must be between 0.0 and 1.0: " + p);
        return uniform() < p;
    }
    /**
     * Returns a random boolean from a Bernoulli distribution with success
     * probability 1/2.
     * 
     * @return true with probability 1/2 and
     *         false with probability 1/2
     */
    public static boolean bernoulli() {
        return bernoulli(0.5);
    }
    /**
     * Returns a random real number from a standard Gaussian distribution.
     * 
     * @return a random real number from a standard Gaussian distribution
     *         (mean 0 and standard deviation 1).
     */
    public static double gaussian() {
        // use the polar form of the Box-Muller transform
        double r, x, y;
        do {
            x = uniform(-1.0, 1.0);
            y = uniform(-1.0, 1.0);
            r = x*x + y*y;
        } while (r >= 1 || r == 0);
        return x * Math.sqrt(-2 * Math.log(r) / r);
    }
    /**
     * Returns a random real number from a Gaussian distribution with mean &mu;
     * and standard deviation &sigma.
     * 
     * @param  mu the mean
     * @param  sigma the standard deviation
     * @return a real number distributed according to the Gaussian distribution
     *         with mean and standard deviation sigma.
     */
    public static double gaussian(double mu, double sigma) {
        return mu + sigma * gaussian();
    }
    /**
     * Returns a random integer from the specified discrete distribution.
     *
     * @param  probabilities the probability of occurrence of each integer
     * @return a random integer from a discrete distribution:
     *         i with probability  probabilities[i]
     * @throws IllegalArgumentException if {@code probabilities} is {@code null}
     * @throws IllegalArgumentException if sum of array entries is not (very nearly) equal to {@code 1.0}
     * @throws IllegalArgumentException unless {@code probabilities[i] >= 0.0} for each index {@code i}
     */
    public static int discrete(double[] probabilities) {
        if (probabilities == null) throw new IllegalArgumentException("argument array is null");
        double EPSILON = 1E-14;
        double sum = 0.0;
        for (int i = 0; i < probabilities.length; i++) {
            if (!(probabilities[i] >= 0.0))
                throw new IllegalArgumentException("array entry " + i + " must be nonnegative: " + probabilities[i]);
            sum += probabilities[i];
        }
        if (sum > 1.0 + EPSILON || sum < 1.0 - EPSILON)
            throw new IllegalArgumentException("sum of array entries does not approximately equal 1.0: " + sum);

        // the for loop may not return a value when both r is (nearly) 1.0 and when the
        // cumulative sum is less than 1.0 (as a result of floating-point roundoff error)
        while (true) {
            double r = uniform();
            sum = 0.0;
            for (int i = 0; i < probabilities.length; i++) {
                sum = sum + probabilities[i];
                if (sum > r) return i;
            }
        }
    }
    /**
     * Rearranges the elements of the specified array in uniformly random order.
     *
     * @param  a the array to shuffle
     * @throws IllegalArgumentException if {@code a} is {@code null}
     */
    public static void shuffle(double[] a) {
        validateNotNull(a);
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int r = i + uniform(n-i);     // between i and n-1
            double temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }
    /**
     * throw an IllegalArgumentException if x is null (x can be of type Object[], double[], int[], ...)
     * @param x
     */
    private static void validateNotNull(Object x) {
        if (x == null) {
            throw new IllegalArgumentException("argument is null");
        }
    }
}
