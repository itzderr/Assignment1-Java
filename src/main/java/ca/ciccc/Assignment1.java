package ca.ciccc;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.lang.Math;

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

        float metersValue = (float) 0.0254;
        float conversion = (float) (inches * metersValue);

        String result = String.format("%.1f inches is %.1f meters", inches, conversion);

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

        int aux = number;

        int lessThan10 = aux % 10;
        aux /= 10;
        int tens = aux % 10;
        aux /= 10;
        int hundreds = aux % 10;
        aux /= 10;
        int sum = hundreds + tens + lessThan10;

        String result = String.format("The sum of all digits in %d is %d", number, sum);

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

        int dayMins = 1440;
        int yearDays = 365;

        int totalDays = mins / dayMins;
        int years = totalDays / yearDays;
        int remainingDays = totalDays % 365;

        String result = String.format("%d minutes is approximately %d years and %d days", mins, years, remainingDays);

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

        double bmi = (double) kgs / (Math.pow(meters, 2.0));
        String result = String.format("Body Mass Index is %.3f", bmi);

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
     * @return
     *      "Your speed in meters/second is 0.1169
     *       Your speed in km/h is 0.4208
     *       Your speed in miles/h is 0.2615"
     */
    public static String speed(int meters, int hours, int minutes, int seconds) {

        int kilometer = 1000;
        int mile = 1609;
        int secondsInMinute = 60;
        int secondsInHour = 3600;
        int totalSeconds = (hours*secondsInHour) + (minutes*secondsInMinute) + seconds;

        float meterSecond = (float) meters/totalSeconds;
        float kmHour = ((float)meters/kilometer)/((float)totalSeconds/secondsInHour);
        float mileHour = ((float)meters/mile)/((float)totalSeconds/secondsInHour);

        DecimalFormat df = new DecimalFormat("#.####");
        df.setRoundingMode(RoundingMode.FLOOR);
        String num1 = df.format(meterSecond);
        String num2 = df.format(kmHour);
        String num3 = df.format(mileHour);

        String result = String.format("Your speed in meters/second is %s\nYour speed in km/h is %s\nYour speed in miles/h is %s", num1, num2, num3);System.out.println(result);
        return result;
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
        int fourth = (int) Math.pow(number, 4);

        String result = String.format("Square: %d\nCube: %d\nFourth power: %d", square, cube, fourth);

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
     *          Difference of two integers: 20
     *          Product of two integers: 125
     *          Average of two integers: 15.00
     *          Distance of two integers: 20
     *          Max integer: 25
     *          Min integer: 5"
     */
    public static String arithmetic(int a, int b) {

        int maxInteger;
        int minInteger;
        int difference;

        int sum = a + b;
        int product = b * a;
        float average = (float) (a + b) / 2;

        if (a > b) {
            difference = a - b;
            maxInteger = a;
            minInteger = b;
        } else {
            difference = b - a;
            maxInteger = b;
            minInteger = a;
        }

        String result = String.format("Sum of two integers: %d\n" +
                "Difference of two integers: %d\n" +
                "Product of two integers: %d\n" +
                "Average of two integers: %.2f\n" +
                "Distance of two integers: %d\n" +
                "Max integer: %d\nMin integer: %d",
                sum, difference, product, average, difference, maxInteger, minInteger);

        return result;
    }
}
