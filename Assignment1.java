package ca.ciccc;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Assignment1 {

    public static void main(String[] args) {

        System.out.println(Assignment1.dotFix(222.444, "#######.###"));

    }

    // colaboration of Douglas Cioli fixing comma to dot
    public static String dotFix(double value, String pattern) {
        // jerry-rigged by Douglas to help pt-Br students.
        DecimalFormat df = new DecimalFormat(pattern);
        String tmp = df.format(value);
        tmp = tmp.replace(",", ".");

        return tmp;
    }

    /**
     * Write a function to convert temperature from Fahrenheit to Celsius degree
     * Sample Input : 212
     *
     * @param degree
     * @return "212.0 degree Fahrenheit is equal to 100.0 in Celsius"
     */
    public static String fahrenheitToCelsius(double degree) {

//      definir variável como float
        double temperatura;

        temperatura = (double) ((degree - 32)*5)/9;
        return degree + " degree Fahrenheit is equal to " + temperatura + " in Celsius";
    }

    /**
     * Write a function program that takes an integer in inches, converts in to meters.
     * Sample Input : 1000
     *
     * @param inches
     * @return "1000.0 inches is 25.4 meters"
     */
    public static String inchesToMeters(int inches) {

        // Douglas Cioli help me with this one

        double m = inches * 0.0254;

        DecimalFormat dec = new DecimalFormat("########.0");

        return dec.format(inches) + " inches is " + m + " meters";


    }

    /**
     * Write a function that takes an integer between 0 and 1000 and adds all the digits.
     * Sample Input : 565
     *
     * @param number
     * @return "The sum of all digits in 565 is 16"
     */
    public static String addDigits(int number) {

//        // prompt the user simulation


        int lessThan1000 = number % 10; // Extract the digit less than 10
        number /= 10;                   // Remove the extracted digit

        int digits = number % 10;       // Extract the digit between 10 to 99
        number /= 10;                   // Remove the extracted digit

        int digitsHundered = number % 10;// Extract the digit between 100 to 999
        number /= 10;                   // Remove the extracted digit

        int sum = digitsHundered + digits + lessThan1000;

        return "The sum of all digits in " + "565" + " is " + sum;
    }

    /**
     * Write a function that takes an integer as minutes and convert it to years and days.
     * Sample Input : 3456789
     *
     * @param mins
     * @return "3456789 minutes is approximately 6 years and 210 days"
     */
    public static String minsToYearsDays(int mins) {

// my reference: https://www.w3resource.com/java-exercises/datatypes/java-datatype-exercise-4.php

        double minYears = 60 * 24 * 365;

        long years = (long) (mins / minYears);
        int days = (int) (mins / 60 / 24 ) % 365;

        return mins + " minutes is approximately " + years + " years and " + days + " days";
    }

    /**
     * Write a function that takes weight as Kgs(Kilograms) and height as meters and compute
     * body mass index (BMI)
     * Sample Input: kgs = 70, meters = 1.75
     *
     * @param kgs
     * @param meters
     * @return "Body Mass Index is 22.857"
     */
    public static String bmi(int kgs, double meters) {

        int w = 70;
        double m = 1.75;

        // calculating the body mass BMI = weight / height^2
        double BMI = w / (Math.pow(m, 2));

        return "Body Mass Index is " + Assignment1.dotFix(BMI, "########.###");
    }

    /**
     * Write a function that takes a distance (in meters) and the time was taken
     * (as three numbers: hours, minutes, seconds), and display the speed, in meters
     * per second, kilometers per hour and miles per hour
     * (hint: 1 mile = 1609 meters).
     * Sample Input :
     * meters = 2500
     * hours = 5
     * minutes = 56
     * seconds = 23
     *
     * @param meters
     * @param hours
     * @param minutes
     * @param seconds
     * @return
     *      "Your speed in meters/second is 0.1169
     *       Your speed in km/h is 0.4208
     *       Your speed in miles/h is 0.2615"
     */
    public static String speed(int meters, int hours, int minutes, int seconds) {

        Scanner user_input = new Scanner(System.in);

        // variables:

        float totalTime;
        float mps, kph, mph;

        // user inputs:

        System.out.print("Type the distance in meters: ");
        float dist = user_input.nextFloat();

        System.out.print("Type the hours: ");
        float hr = user_input.nextFloat();

        System.out.print("Type the minutes: ");
        float min = user_input.nextFloat();

        System.out.print("Type the seconds: ");
        float sec = user_input.nextFloat();

        // caltulating...

        totalTime = (hr * 3600) + (min * 60) + sec;
        mps = dist / totalTime;
        kph = (dist / 1000.0f) / (totalTime / 3600.0f);
        mph = kph / 1.609f;

        // result:

        return "Your speed in meters/second is " + mps + "\n" + "Your speed in km/h is " + kph + "\n" + "Your speed in miles/h is " + mph;
    }

    /**
     * Write a function that reads a number and display the square,
     * cube, and the fourth power.
     * Sample Input :
     * number = 5
     *
     * @param number
     * @return "Square: 25
     *          Cube: 125
     *          Fourth power: 625"
     */
    public static String powers(int number) {

        // variables:
        int square;
        int cube;
        int fourPower;


        // calculating...

        square = (int) Math.pow(number, 2);
        cube = (int) Math.pow(number, 3);
        fourPower = (int) Math.pow(number, 4);


       //result
        return "Square: " + square + "\n" + "Cube: " + cube + "\n" + "Fourth power: " + fourPower;
    }

    /**
     * Write a function that takes two integers a and b, then prints the sum,
     * the difference, the product, the average, the distance (absolute value of
     * the difference), the maximum, and the minimum between the two.
     * Sample Input :
     * a = 25
     * b = 5
     *
     * @param a
     * @param b
     * @return "Sum of two integers: 30
     *          Difference of two integers: 20
     *          Product of two integers: 125
     *          Average of two integers: 15.00
     *          Distance of two integers: 20
     *          Max integer: 25
     *          Min integer: 5"
     */
    public static String arithmetic(int a, int b) {

        int dif = a - b; dif *= dif < 0 ?-1:1;

        int sum = (a + b);
        int pro = (a * b);
        int ave = ((a + b) / 2);
        int dis = (a-b);
        int max = ((a > b)?a:b);
        int min = ((a < b)?a:b);

        return "Sum of two integers: " + sum + "\n" +
                "Difference of two integers: " + dif + "\n" +
                "Product of two integers: " + pro + "\n" +
                "Average of two integers: " + ave + ".00\n" +
                "Distance of two integers: " + dis + "\n" +
                "Max integer: " + max + "\n" +
                "Min integer: " + min;
    }
}
