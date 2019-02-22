package ca.ciccc;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Assignment1 {

    /**
     * Write a function to convert temperature from Fahrenheit to Celsius degree
     * Sample Input : 212
     *
     * @param degree
     * @return "212.0 degree Fahrenheit is equal to 100.0 in Celsius"
     */
    public static String fahrenheitToCelsius(double degree) {

        double celsius = (degree - 32) * ((double) 5 / 9);
        String result = String.format("%.1f degree Fahrenheit is equal to %.1f in Celsius", degree, celsius);

        return result;
    }

    /**
     * Write a function program that takes an integer in inches, converts in to meters.
     * Sample Input : 1000
     *
     * @param inches
     * @return "1000.0 inches is 25.4 meters"
     */
    public static String inchesToMeters(double inches) {

        double meters = inches * 0.0254;

        return inches + " inches is " + meters + " meters";
    }

    /**
     * Write a function that takes an integer between 0 and 1000 and adds all the digits.
     * Sample Input : 565
     *
     * @param number
     * @return "The sum of all digits in 565 is 16"
     */
    public static String addDigits(int number) {
        String sum = String.format("%d",number);  // "565"
        int firstdigit = Integer.parseInt(sum.substring(0,1));// 5
        int seconddigit = Integer.parseInt(sum.substring(1,2));
        int thirddigit = Integer.parseInt(sum.substring(2,3));
        int Sum = firstdigit + seconddigit + thirddigit;


        return "The sum of all digits in " + number + " is " + Sum;
    }

    /**
     * Write a function that takes an integer as minutes and convert it to years and days.
     * Sample Input : 3456789
     *
     * @param mins
     * @return "3456789 minutes is approximately 6 years and 210 days"
     */
    public static String minsToYearsDays(int mins) {
        int days = mins / 1440;
        int years = days / 365;
        int DAYS = years * 365;
        int DAY = days - DAYS;

        return mins + " minutes is approximately " + years + " years and " + DAY +" days";
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
    public static String bmi(double kgs, double meters) {
        double Meters = meters * meters;
        double bmi = kgs / Meters;
        String BMI = String.format("%.3f",bmi);

        return "Body Mass Index is " + BMI;
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
        int totalSeconds = hours * 60 * 60 + minutes * 60 + seconds;
        double mps = (double) meters / totalSeconds;
        double km = meters / 1000.0;
        double h = totalSeconds / 3600.0;
        double kph = km/h;
        double miles = meters / 1609.0;
        double mph = miles / h;

        DecimalFormat df = new DecimalFormat();
        df.setMinimumFractionDigits(4);
        df.setRoundingMode(RoundingMode.DOWN);

        return "Your speed in meters/second is " + df.format(mps) +"\nYour speed in km/h is " + df.format(kph) +"\nYour speed in miles/h is " + df.format(mph);
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
        int square = number * number;
        int cube = number * number * number;
        int fourthpower = number * number * number * number;

        return "Square: " + square + "\nCube: " + cube + "\nFourth power: " + fourthpower ;
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
        int sum = a + b;
        int diff = a - b;
        int pro = a * b;
        double ave = (a + b)/2;
        String Ave = String.format("%.2f",ave);
        int dis = a - b;
        int max = a;
        int min = b;

        return "Sum of two integers: " + sum + "\nDifference of two integers: " + diff + "\nProduct of two integers: "
                + pro + "\nAverage of two integers: " + Ave + "\nDistance of two integers: " + dis + "\nMax integer: "
                + max + "\nMin integer: " + min;
    }
}