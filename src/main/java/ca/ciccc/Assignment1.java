package ca.ciccc;

import com.sun.xml.internal.txw2.output.DumbEscapeHandler;

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
        double inches1 = 0.0, meters = 0.0;
        inches1 = inches;
        meters = inches1 * 0.0254;
        String inchesStr = String.format("%.1f", inches1);
        String metersStr = String.format("%.1f", meters);
        String result = inchesStr + "inches is: " + metersStr + " meters";
        return result;
    }

    /**
     * Write a function that takes an integer between 0 and 1000 and adds all the digits.
     * Sample Input : 565
     *
     * @param number
     * @return "The sum of all digits in 565 is 16"
     */
    public static String addDigits(int number) {
        int sum = 0, digit = 0;
        String numberStr = String.valueOf(number);
        while (number >= 0) {
            digit = number % 10;
            sum = sum + digit;
            number = (number / 10);
        }
        String result = "The sum of all digits in: " + numberStr + " is: " + sum;
        return result;
    }

    /**
     * Write a function that takes an integer as minutes and convert it to years and days.
     * Sample Input : 3456789
     *
     * @param mins
     * @return "3456789 minutes is approximately 6 years and 210 days"
     */
    public static String minsToYearsDays(int mins) {
        //1 day = 1440 mins
        int years = 0, days = 0;
        days = mins / 1440;
        while (days >= 365) {
            days = days - 365;
            years = years + 1;
        }
        String result = mins + " minutes is approximately 6 years and " + days + " days";
        return result;
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
        double bodyMi = 0.0;
        bodyMi = (kgs / (meters * meters));
        String bodyMiStr = String.format("%.1f", bodyMi);
        String result = "Body Mass Index is: " + bodyMiStr + "kgs";
        return result;
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
     * @return "Your speed in meters/second is 0.1169
     * Your speed in km/h is 0.4208
     * Your speed in miles/h is 0.2615"
     */
    public static String speed(int meters, int hours, int minutes, int seconds) {

        return "";
    }

    /**
     * Write a function that reads a number and display the square,
     * cube, and the fourth power.
     * Sample Input :
     * number = 5
     *
     * @param number
     * @return "Square: 25
     * Cube: 125
     * Fourth power: 625"
     */
    public static String powers(int number) {
        int square = 0, cube = 0, fourthPower;
        square = (number * number);
        cube = (number * number * number);
        fourthPower = (number * number * number * number);
        String result = "Square: " + square +
                "\n" + "Cube: " + cube +
                "\n" + "Fourth power: " + fourthPower;
        return result;
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
     * Difference of two integers: 20
     * Product of two integers: 125
     * Average of two integers: 15.00
     * Distance of two integers: 20
     * Max integer: 25
     * Min integer: 5"
     */
    public static String arithmetic(int a, int b) {
        int sum = 0, diff = 0, product = 0, dist = 0, maxInteger = 0, minInteger = 0;
        double average = 0.0;
        sum = a + b;
        diff = a - b;
        product = a * b;
        average = ((a + b) / 2);
        dist = Math.max(a, b) - Math.min(a, b);
        maxInteger = Math.max(a, b);
        minInteger = Math.min(a, b);
        String result = "Sum of two integers: " + sum +
                "\n" + "Difference of two integers: " + diff +
                "\n" + "Product of two integers: " + product +
                "\n" + "Average of two integers: " + average +
                "\n" + "Distance of two integers: " + dist +
                "\n" + "Max integer: " + maxInteger +
                "\n" + "Min integer: " + minInteger;
        return result;
    }
}
