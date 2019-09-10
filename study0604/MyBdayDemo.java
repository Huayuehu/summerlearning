package study0604;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * To calculate how many days have been in the world
 *  A. Enter your bday as a String
 *  B. Change the String to a Date
 *  C. Turn this Date to basic time in ms
 *  D. Get current Date in ms
 *  E. Do subtraction between current day and bday
 *  F. Turn the result to time in day
 */

public class MyBdayDemo {
    public static void main(String args[]) throws ParseException {
        //A. Enter your bday as a String
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your birthday: (yyyy-mm-dd)");
        String sbDay = in.nextLine();

        //B. Change the String to a Date
        //public Date SimpleDateFormat(String text)
        Date bDay = new SimpleDateFormat("yyyy-mm-dd").parse(sbDay);

        //C. Turn this Date to basic time in ms
        long dDayTime = bDay.getTime();

        //D. Get current Date in ms
        long currentTime = System.currentTimeMillis();

        //E. Do subtraction between current day and bday
        long currentToBDay = currentTime - dDayTime;

        //F. Turn the result to time in day
        System.out.println("Congratulations!!!! You have been to the world for " + (currentToBDay/1000/3600/24) + " days. :)");

        System.out.println("---------------------------------------------------------------------------------");
        //suppose to live in 80 years later
        Date eDay = new SimpleDateFormat("yyyy-mm-dd").parse("2069-11-24");
        long e = eDay.getTime();
        long eToC = e - currentTime;
        System.out.println("Ooooops! Suppose you live 80 years. You will have " + (eToC/1000/3600/24) + " days left. ");
    }
}
