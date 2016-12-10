package com.swiftpot.playtime.java8;

import java.time.*;

/**
 * @author Ace Programmer Rbk
 *         <Rodney Kwabena Boachie at [rodney@swiftpot.com,rbk.unlimited@gmail.com]> on
 *         03-Dec-16 @ 4:35 PM
 */
public class DateTimeApiTests {
    public static void main(String[] args) throws InterruptedException {
        final Instant clockTimeAtStart = Clock.systemUTC().instant();
        LocalDateTime startTime = LocalDateTime.ofInstant(clockTimeAtStart, ZoneId.systemDefault());

        Thread.sleep(2500);

        final Instant clockTimeAtEnd = Clock.systemUTC().instant();
        LocalDateTime endTime = LocalDateTime.ofInstant(clockTimeAtEnd, ZoneId.systemDefault());
        long differenceInMillis = Duration.between(startTime, endTime).toMillis();
        System.out.println("Finished in "+ differenceInMillis+" milliseconds");
    }
}
