package ca.ciccc;

import java.math.BigDecimal;
import java.math.RoundingMode;

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

        double meter = inches / 1000.0 * 25.4;

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
        int tempNumber = number;

        if (number < 0 || number > 1000) {
            throw new IllegalArgumentException("The number should be between 0 and 1000.");
        }

        while (tempNumber > 0) {
            sum += tempNumber % 10;
            tempNumber /= 10;
        }

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

        int years = mins / (60 * 24 * 365);
        int days = mins % (60 * 24 * 365) / (60 * 24);

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

        double BMI = kgs / (meters * meters);

        BigDecimal formattedBMI = new BigDecimal(BMI).setScale(3, RoundingMode.HALF_UP);

        return "Body Mass Index is " + formattedBMI;
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

        int totalTimeInSecond = (hours * 3600) + (minutes * 60) + seconds;
        double totalTimeInHour = (double) totalTimeInSecond / 3600;

        double km = (double) meters / 1000;
        double miles = (double) meters / 1609;

        double metersPerSecond = (double) meters / totalTimeInSecond;
        double kmPerHour = (double) km / totalTimeInHour;
        double milesPerHour = miles / totalTimeInHour;

        BigDecimal formattedMetersPerSecond = new BigDecimal(metersPerSecond).setScale(4, RoundingMode.FLOOR);
        BigDecimal formattedKmPerHour = new BigDecimal(kmPerHour).setScale(4, RoundingMode.FLOOR);
        BigDecimal formattedMilesPerHour = new BigDecimal(milesPerHour).setScale(4, RoundingMode.FLOOR);

        return "Your speed in meters/second is " + formattedMetersPerSecond +
                "\nYour speed in km/h is " + formattedKmPerHour +
                "\nYour speed in miles/h is " + formattedMilesPerHour;
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

        int square = (int) Math.pow(number, 2);
        int cube = (int) Math.pow(number, 3);
        int fourthPower = (int) Math.pow(number, 4);

        return "Square: " + square +
                "\nCube: " + cube +
                "\nFourth power: " + fourthPower;
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
        int difference = a - b;
        int product = a * b;
        double avg = (double) sum / 2;
        int distance = Math.abs(a - b);
        int max = Math.max(a, b);
        int min = Math.min(a, b);

        BigDecimal formattedAvg = new BigDecimal(avg).setScale(2, RoundingMode.HALF_UP);

        return "Sum of two integers: " + sum +
                "\nDifference of two integers: " + difference +
                "\nProduct of two integers: " + product +
                "\nAverage of two integers: " + formattedAvg +
                "\nDistance of two integers: " + distance +
                "\nMax integer: " + max +
                "\nMin integer: " + min;
    }
}
