package com.swiftpot.playtime.java8;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * @author Ace Programmer Rbk
 *         <Rodney Kwabena Boachie at [rodney@swiftpot.com,rbk.unlimited@gmail.com]> on
 *         03-Dec-16 @ 4:42 PM
 */
public class Base64Tests {
    public static void main(String[] args) {
        final String text = "myPassWord";
        final String encoded = Base64
                .getEncoder()
                .encodeToString( text.getBytes( StandardCharsets.UTF_8 ) );
        System.out.println( encoded );
        final String decoded = new String(
                Base64.getDecoder().decode( encoded ),
                StandardCharsets.UTF_8 );
        System.out.println( decoded );
    }
}
