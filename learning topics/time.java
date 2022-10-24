package com.company;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class time {
    public static void main(String[] args) {
//        System.out.println("Current time: " + LocalTime.now());
//        System.out.println(System.currentTimeMillis());
//        Date d = new Date();
//        System.out.println(d);
//        System.out.println(d.getTime());
//        Calendar c = Calendar.getInstance();
//        System.out.println(c.getTimeZone());
//        GregorianCalendar gc = new GregorianCalendar();
//        System.out.println(gc.isLeapYear(2031));
//        LocalDate ld = LocalDate.now();
//        System.out.println(ld);
//        LocalTime lt = LocalTime.now();
//        System.out.println(lt);
        LocalDateTime ldt = LocalDateTime.now();
//        System.out.println(ldt);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd:MM:yyyy");
        String date = dtf.format(ldt);
        System.out.println(date);
    }
}
