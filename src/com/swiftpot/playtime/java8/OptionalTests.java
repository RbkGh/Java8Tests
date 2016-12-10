package com.swiftpot.playtime.java8;

import java.util.Optional;

/**
 * @author Ace Programmer Rbk
 *         <Rodney Kwabena Boachie at [rodney@swiftpot.com,rbk.unlimited@gmail.com]> on
 *         03-Dec-16 @ 3:17 PM
 */
public class OptionalTests {
    public static void main(String[] args) {
        Optional< String > firstName = Optional.ofNullable(null);
        System.out.println( "First Name is set? " + firstName.isPresent() );
        System.out.println( "First Name: " + firstName.orElseGet( () -> {
            System.out.println(firstName);
            return "[none]";
        } ) );
        System.out.println( firstName.map( s -> "Hey " + s + "!" ).orElse( "Hey Stranger!" ) );
        System.out.println();
    }
}
