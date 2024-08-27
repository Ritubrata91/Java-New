package com.ritubrata.java.eleven;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Java11TimeRelatedChanges {

    public static void main(String[] args) {
        long day = TimeUnit.DAYS.convert(Duration.ofHours(24));
        System.out.println(day == 1);

        System.out.println(TimeUnit.DAYS.convert(Duration.ofHours(46)));

        System.out.println(TimeUnit.MINUTES.convert(Duration.ofSeconds(119)));
    }

}
