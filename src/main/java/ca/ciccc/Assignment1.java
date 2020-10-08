package ca.ciccc;

import java.sql.Time;
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
    public static String inchesToMeters(int inches) {
        double meter = inches * 0.0254;
        return (double) inches + " inches is " + meter + " meters";
    }

    /**
     * Write a function that takes an integer between 0 and 1000 and adds all the digits.
     * Sample Input : 565
     *
     * @param number
     * @return "The sum of all digits in 565 is 16"
     */
    public static String addDigits(int number) {
        int sum = 0;

        for(char num: String.valueOf(number).toCharArray())
            sum += Integer.parseInt(String.valueOf(num));

        return "The sum of all digits in " + number + " is " + sum;
    }

    /**
     * Write a function that takes an integer as minutes and convert it to years and days.
     * Sample Input : 3456789
     *
     * @param mins
     * @return "3456789 minutes is approximately 6 years and 210 days"
     */
    public static String minsToYearsDays(int mins) {
        int days = (mins / 1440) % 365;
        int years = (mins / 1440) / 365;

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
        DecimalFormat df = new DecimalFormat("#.###");
        double bmi = kgs / Math.pow(meters, 2);
        return "Body Mass Index is " + df.format(bmi);
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
        double allSeconds = ((hours * 60) + minutes) * 60 + seconds;
        DecimalFormat df = new DecimalFormat("#.####");
        double mps = meters / allSeconds;
        double kph = Double.valueOf(df.format(mps)) * 3.6;
        double mph = Double.valueOf(df.format(kph)) * 0.621371;

        return "Your speed in meters/second is " + df.format(mps) +
                "\nYour speed in km/h is " + df.format(kph) +
                "\nYour speed in miles/h is " + df.format(mph);

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

        return "Square: " + (int) Math.pow(number,2) +
                "\nCube: " + (int) Math.pow(number,3) +
                "\nFourth power: " + (int) Math.pow(number,4) ;
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
        int max = 0;
        int min = 0;
        if (a > b) {
            max = a; min = b;
        } else {
            max = b; min = a;
        }
        DecimalFormat df = new DecimalFormat("#.00");
        return "Sum of two integers: " + (max + min) +
                "\nDifference of two integers: " + (max - min) +
                "\nProduct of two integers: " + max * min +
                "\nAverage of two integers: " + df.format((double) (max + min) / 2) +
                "\nDistance of two integers: " + (max - min) +
                "\nMax integer: " + max +
                "\nMin integer: " + min;
    }
}
