package ca.ciccc;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Assignment1 {

    public static void main(String[] args) {

        System.out.println(Assignment1.speed(2500, 5, 56, 23));

    }

    // colaboration of Douglas Cioli to change comma to dot
    public static String dotFix(double value, String pattern) {
        // jerry-rigged by Douglas to help pt-Br students.
        DecimalFormat df = new DecimalFormat(pattern);
        df.setRoundingMode(RoundingMode.DOWN);
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

        double celsius = (degree - 32) * ((double) 5 / 9);
        String result = String.format(degree + " degree Fahrenheit is equal to " + celsius + " in Celsius");

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
        String result = String.format(inches + " inches is " + meters + " meters");

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

        int firstDigit = number % 10;
        int rem = number / 10;
        int secondDigit = rem % 10;
        rem = rem / 10;
        int thirdDigit = rem % 10;
        rem = rem / 10;
        int fourthDigit = rem % 10;
        int sum = thirdDigit + secondDigit + firstDigit + fourthDigit;

        String result = String.format("The sum of all digits in " + number + " is " + sum);

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

        int years = mins / 525600;
        int rem = mins % 525600;
        int days = rem / 1440;

        String result = String.format( mins + " minutes is approximately " + years + " years and " + days + " days");

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

        double bmi = kgs / (meters * meters);

        DecimalFormat df = new DecimalFormat("#######.###");

        String result = "Body Mass Index is " + Assignment1.dotFix(bmi, "#######.###");

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

        double sec = (hours * 3600) + (minutes * 60) + seconds;
        double speed = (double) meters / sec;
        double kmh = (meters / 1000.0f) / (sec / 3600.0f);
        double mph = kmh / 1.609f;

        String result = "Your speed in meters/second is " + Assignment1.dotFix(speed, "########.####") +
                "\nYour speed in km/h is " + Assignment1.dotFix(kmh, "########.####") +
                "\nYour speed in miles/h is " + Assignment1.dotFix(mph, "########.####");

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
     * Cube: 125
     * Fourth power: 625"
     */
    public static String powers(int number) {

        int square = number * number;
        int cube = number * number * number;
        int fourthPower = number * number * number * number;

        String result = String.format("Square: " + square + "\nCube: " + cube + "\nFourth power: " + fourthPower);

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

        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        double average = (a + b) / (double) 2.0;
        int distance = -(b - a);
        int max = 0;
        int min = 0;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        if (a < b) {
            min = a;
        } else {
            min = b;
        }

        String result = "Sum of two integers: " + sum + "\nDifference of two integers: " + difference +
                "\nProduct of two integers: " + product + "\nAverage of two integers: " +
                Assignment1.dotFix(average, "########.##") + ".00" +
                "\nDistance of two integers: " + distance + "\nMax integer: " + max +
                "\nMin integer: " + min;
        return result;
    }
}