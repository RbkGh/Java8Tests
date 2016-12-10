package com.swiftpot.playtime.java8.streams;

import java.time.*;
import java.util.Arrays;
import java.util.Collection;

/**
 * @author Ace Programmer Rbk
 *         <Rodney Kwabena Boachie at [rodney@swiftpot.com,rbk.unlimited@gmail.com]> on
 *         03-Dec-16 @ 3:41 PM
 */
public class StreamsTests {
    public static void main(String[] args) {
        final Collection<Task> tasks = Arrays.asList(
                new Task(Task.Status.OPEN, 5),
                new Task(Task.Status.OPEN, 13),
                new Task(Task.Status.CLOSED, 8)
        );


        System.out.println(getTotalNumberOfAllOpenTasksPoints(tasks));

        System.out.println(getTotalNumberOfAllOpenTasksPointsUsingStreams(tasks));
    }

    private static int getTotalNumberOfAllOpenTasksPoints(Collection<Task> tasks) {
        final Instant clockTimeAtStart = Clock.systemUTC().instant();
        LocalDateTime startTime = LocalDateTime.ofInstant(clockTimeAtStart, ZoneId.systemDefault());

        int totalNumOfOPENtasksPoints = 0;
        for (Task task : tasks) {
            if (task.getStatus().equals(Task.Status.OPEN)) {
                totalNumOfOPENtasksPoints = totalNumOfOPENtasksPoints + task.getPoints();
            }
        }
        final Instant clockTimeAtEnd = Clock.systemUTC().instant();
        LocalDateTime endTime = LocalDateTime.ofInstant(clockTimeAtEnd, ZoneId.systemDefault());
        System.out.println("Finished in "+Duration.between(startTime,endTime).toMillis()+" milliseconds");

        return totalNumOfOPENtasksPoints;
    }

    /**
     * <p color="#f3e7r4">Same operation but using Streams</p>
     *
     * @param tasks
     * @return Integer
     */
    private static int getTotalNumberOfAllOpenTasksPointsUsingStreams(Collection<Task> tasks) {
        final Instant clockTimeAtStart = Clock.systemUTC().instant();
        LocalDateTime startTime = LocalDateTime.ofInstant(clockTimeAtStart, ZoneId.systemDefault());
        int val =  tasks
                .stream()
                .filter(task -> task.getStatus() == Task.Status.OPEN)
                .mapToInt(Task::getPoints)
                .sum();
        final Instant clockTimeAtEnd = Clock.systemUTC().instant();
        LocalDateTime endTime = LocalDateTime.ofInstant(clockTimeAtEnd, ZoneId.systemDefault());
        System.out.println("Finished using streams in "+Duration.between(startTime,endTime).toMillis()+" milliseconds");
        return val;
    }
}
