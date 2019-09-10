package study0604;

import java.util.Calendar;

/**
 * Calendar class
 * syso current year+month+date+hour+minite+second
 */

public class CalendarDemo {
    public static void main(String args[]) {
        Calendar curr = Calendar.getInstance();//多态

        int year = curr.get(Calendar.YEAR);
        System.out.print(year + ".");

        int month = curr.get(Calendar.MONTH);
        System.out.print(month + 1 + ".");

        int date = curr.get(Calendar.DATE);
        System.out.print(date + " ");

        int hour = curr.get(Calendar.HOUR);
        System.out.print(hour + ":");

        int minute = curr.get(Calendar.MINUTE);
        System.out.print(minute + ":");

        int second = curr.get(Calendar.SECOND);
        System.out.println(second);

        System.out.println("-----------------");
        curr.set(2011, 11, 10);
        System.out.println(curr.get(Calendar.YEAR) + "." + curr.get(Calendar.MONTH) + "." + curr.get(Calendar.DATE));

    }
}

