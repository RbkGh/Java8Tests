package com.swiftpot.playtime.java8;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * @author Ace Programmer Rbk
 *         <Rodney Kwabena Boachie at [rodney@swiftpot.com,rbk.unlimited@gmail.com]> on
 *         03-Dec-16 @ 3:06 PM
 */
public class ParameterNamesTests {
    public static void main(String[] arguments) throws Exception {
        Method method = ParameterNamesTests.class.getMethod( "main", String[].class );
        for( final Parameter parameter: method.getParameters() ) {
            //pass in -parameters as compiler argument to find direct argument name
            System.out.println( "Parameter: " + parameter.getName() );
        }
    }
}
