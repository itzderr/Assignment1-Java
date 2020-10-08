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
        // 1 inch = 0.0254 meter
        double meters = inches * 0.0254;
        double inc = (double)inches;
        String result = String.format("%.1f inches is %.1f meters", inc, meters);
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
        int target = number;
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        String result = String.format("The sum of all digits in %d is %d", target, sum);
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
        int days = mins / (60 * 24);
        int years = days / 365;
        days -= years * 365;
        String result = String.format("%d minutes is approximately %d years and %d days", mins, years, days);
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
        int totalSec = hours * 60 * 60 + minutes * 60 + seconds;
        double totalHour = (double) totalSec / (60 * 60);
        double mPerSec = (double) meters / totalSec;

        double kmPerHour = roundDown((double) meters / 1000 / totalHour, 4);

        double miles = (double) meters / 1609;
        double milePerHour = roundDown(miles / totalHour, 4);

        String result = "";
        result += String.format("Your speed in meters/second is %.4f\n", mPerSec);
        result += String.format("Your speed in km/h is %.4f\n", kmPerHour);
        result += String.format("Your speed in miles/h is %.4f", milePerHour);
        return result;
    }
    /**
     * Round down to desired decimal places.
     * @param value
     * @param places
     * @return rounded down double
     */
    private static double roundDown(double value, int places) {
        BigDecimal bd = new BigDecimal(String.valueOf(value));
        BigDecimal bd1 = bd.setScale(places, RoundingMode.DOWN);
        return bd1.doubleValue();
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
        String result = "";
        result += String.format("Square: %d\n", (int) Math.pow(number, 2));
        result += String.format("Cube: %d\n", (int) Math.pow(number, 3));
        result += String.format("Fourth: %d", (int) Math.pow(number, 4));
        return result;
    }
    public static String powersLoop(int number) {
        int[] arr = new int[3];
        int num = number;
        for (int i = 0; i < 3; i ++) {
            num *= number;
            arr[i] = num;
        }

        String result = "";
        result += String.format("Square: %d\n", arr[0]);
        result += String.format("Cube: %d\n", arr[1]);
        result += String.format("Fourth: %d", arr[2]);
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
        String result = "";
        result += String.format("Sum of two integers: %d\n", Math.addExact(a, b));
        result += String.format("Difference of two integers: %d\n", Math.subtractExact(a, b));
        result += String.format("Product of two integers: %d\n", Math.multiplyExact(a, b));
        result += String.format("Average of two integers: %.2f\n", (double) Math.addExact(a, b) / 2);
        result += String.format("Distance of two integers: %d\n", Math.abs(a - b));
        result += String.format("Max integer: %d\n", Math.max(a, b));
        result += String.format("Min integer: %d\n", Math.min(a, b));
        return result;
    }
}
