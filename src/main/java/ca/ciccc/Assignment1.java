package ca.ciccc;

import javax.swing.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.stream.IntStream;

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
        double meters = ((double) inches) * 0.0254;
        double dInches = (double) inches;

        //String result = meter;
        String result = String.format("%.1f inches is %.1f meters", dInches, meters);


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
        //int sum = String.valueOf(number).chars().map(Character::getNumericValue).sum();
        int num = number;
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;

        }
        String answer = String.format("The sum of all digits in %d is %d", number, sum);

        return answer;
    }

    /**
     * Write a function that takes an integer as minutes and convert it to years and days.
     * Sample Input : 3456789
     *
     * @param mins
     * @return "3456789 minutes is approximately 6 years and 210 days"
     */
    public static String minsToYearsDays(int mins) {
        int year = 0;
        int day = 0;
        //1 day = 1440 minutes
        //1 year = 365 days = 525_600 minutes
        int tempMin = mins;
        while (tempMin != 0) {
            if (tempMin >= 525600){
                year = year + 1;
                tempMin = tempMin - 525600;
            }else {
                day = tempMin / 1440;
                tempMin = 0;
            }
        }
        String answer = String.format("%d minutes is approximately %d years and %d days", mins, year, day);

        return answer;
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
        //weight (kg) / [height (m)]2
        double BMI = kgs / (meters * meters);
        String answer = String.format("Body Mass Index is %.3f", BMI);


        return answer;
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
        double timeSeconds = (hours * 3600) + (minutes * 60) + seconds;
        double timeHours = timeSeconds / 3600;
        double miles = (meters / 1609.00);
        double km = (meters / 1000.00);
        double speedMS = meters / timeSeconds;
        double speedKH =  km / timeHours;
        double speedMH = miles / timeHours;
        DecimalFormat df = new DecimalFormat("#.####");
        df.setRoundingMode(RoundingMode.FLOOR);
        String answer = String.format("Your speed in meters/second is %.4f\nYour speed in km/h is %s\nYour speed in miles/h is %s", speedMS, df.format(speedKH), df.format(speedMH));

        return answer;
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
        int fourthPower = number * number * number * number;
        String answer = String.format("Square: %d\nCube: %d\nFourth power: %d", square, cube, fourthPower);

        return answer;
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
        int sum;
        int difference;
        int product;
        double average;
        int distance;
        int max;
        int min;
        sum = a + b;
        if (a < b) {
            difference = b - a;
            min = a;
            max = b;
        } else if (a > b){
            difference = a - b;
            min = b;
            max = a;
        } else {
            difference = 0;
            max = a;
            min = b;
        }
        product = a * b;
        average = sum / 2;
        distance = difference;
        String answer = String.format("Sum of two integers: %d\nDifference of two integers: %d\nProduct of two integers: %d\nAverage of two integers: %.2f\nDistance of two integers: %d\nMax integer: %d\nMin integer: %d", sum, difference, product, average, distance, max, min);

        return answer;
    }
}
