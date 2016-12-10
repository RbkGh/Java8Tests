package com.swiftpot.playtime.java8;

import java.util.Arrays;

public class LambdaTests {

    public static void main(String[] args) {
        Arrays.asList(4,5).sort((el1,el2) ->{
            int resultOfComparison = el1.compareTo(el2);
            //compareTo result -1=less than,0=equal objects,1=greater than
            System.out.println("Element1 = "+el1+" Element2 ="+el2);
            System.out.println("Result = "+resultOfComparison);
            return resultOfComparison;
        });
    }
}
