package com.swiftpot.playtime.java8;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Ace Programmer Rbk
 *         <Rodney Kwabena Boachie at [rodney@swiftpot.com,rbk.unlimited@gmail.com]> on
 *         03-Dec-16 @ 4:45 PM
 */
public class ParallelArrayTests {
    public static void main( String[] args ) {
        long[] arrayOfLong = new long [ 20000 ];
        Arrays.parallelSetAll( arrayOfLong,
                index -> ThreadLocalRandom.current().nextInt( 1000000 ) );
        Arrays.stream( arrayOfLong ).limit( 10 ).forEach(
                i -> System.out.print( i + " " ) );
        System.out.println();
        Arrays.parallelSort( arrayOfLong );
        Arrays.stream(arrayOfLong).limit( 10 ).forEach(
                i -> System.out.print( i + " " ) );
        System.out.println();
    }
}
