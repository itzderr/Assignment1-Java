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

        float meters = (0.0254f * inches);
        String result = String.format("%.1f inches is %.1f meters",(float) inches, meters);

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
        String x = String.valueOf(number);
        int sum = 0;
        for (int i = 0; i < x.length(); i++) {
            sum += Character.digit(x.charAt(i),10);
        }
        String result = String.format("The sum of all digits in %d is %d", number, sum);
            return result;
    }
    // try to divide by 10, .. and use reminder

    /**
     * Write a function that takes an integer as minutes and convert it to years and days.
     * Sample Input : 3456789
     *
     * @param mins
     * @return "3456789 minutes is approximately 6 years and 210 days"
     */
    public static String minsToYearsDays(int mins) {
        int years = mins / (60 * 24 * 365);
        int days = (mins % (60 * 24 * 365)) / (60 * 24);
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
        double BMI = kgs / (meters * meters);
        String result = String.format("Body Mass Index is %.3f", BMI);
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
        double m_per_s = (double) meters / (((double) hours * 3600) + ((double) minutes * 60) + (double) seconds);
        double total_h = ((double) hours + ((double) minutes / 60) + ((double)seconds / 3600));
        double km_per_h = ((double) meters / 1000) / total_h;
        km_per_h = Math.floor(km_per_h * 10000) / 10000;
        double miles_per_h = ((double) meters / 1609) / total_h;
        miles_per_h = Math.floor(miles_per_h * 10000) / 10000;
        String result = String.format("Your speed in meters/second is %.4f\nYour speed in km/h is %.4f\nYour speed in miles/h is %.4f",
                m_per_s, km_per_h, miles_per_h);
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
        int fourth_power = (int) Math.pow(number, 4);
        String result = String.format("Square: %d\nCube: %d\nFourth power: %d", square, cube, fourth_power);
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
        int sum = a + b;
        int dif = a - b;
        int prod = a * b;
        double aver = (a + b) / 2;
        int dis = Math.abs(a - b);
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        String result = String.format("Sum of two integers: %d\nDifference of two integers: %d\nProduct of two integers: %d\n" +
                "Average of two integers: %.2f\nDistance of two integers: %d\nMax integer: %d\nMin integer: %d",
                sum, dif, prod, aver, dis, max, min);
        return result;
    }
}
