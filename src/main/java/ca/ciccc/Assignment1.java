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
        double m = inches * 0.0254;
        String result2 = String.format("%.1f inches is %.1f meters", inches, m);
        return result2;
    }

    /**
     * Write a function that takes an integer between 0 and 1000 and adds all the digits.
     * Sample Input : 565
     *
     * @param number
     * @return "The sum of all digits in 565 is 16"
     */
    public static String addDigits(int number) {
        int a = number % 10;
        int b = number / 10;
        int c = b % 10;
        int d = number /100;
        int e = d % 10;
        int sum = a + c + e;
        String result3 = String.format("The sum of all digits in %d is %d", number, sum);
        return result3;
    }

    /**
     * Write a function that takes an integer as minutes and convert it to years and days.
     * Sample Input : 3456789
     *
     * @param mins
     * @return "3456789 minutes is approximately 6 years and 210 days"
     */
    public static String minsToYearsDays(int mins) {
        int y = mins / 525600;
        int a = mins % 525600;
        int d = a / 1440;
        String result4 = String.format("3456789 minutes is approximately %d years and %d days", y, d);
        return result4;
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
        double ms = meters * meters;
        double b = kgs / ms;
        String result5 = String.format("Body Mass Index is %.3f", b);
        return result5;
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
        double mile = meters / 1609.0;
        double km = meters / 1000.0;
        double th = hours + (minutes / 60.0) + (seconds / 60.0 / 60.0);
        double ts = seconds + (minutes * 60.0) + (hours * 60.0 * 60.0);
        double ms = meters / ts;
        double kh = km / th;
        double mh = mile / th;
        DecimalFormat df = new DecimalFormat();
        df.setMinimumFractionDigits(4);
        df.setRoundingMode(RoundingMode.DOWN);

        String result6 = String.format("Your speed in meters/second is %.4f\nYour speed in km/h is %s\nYour " +
                "speed in miles/h is %s", ms, df.format(kh), df.format(mh));
        return result6;
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
        int sq = number * number;
        int cu = sq * number;
        int fp = cu * number;
        String result7 = String.format("Square: %d\nCube: %d\nFourth power: %d", sq, cu, fp);
        return result7;
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
        int pro = a * b;
        double ave = sum / 2.00;
        int max;
        int min;
        int dis = Math.abs(a - b);
        if (a > b){
            max = a;
            min = b;
        }else {
            max = b;
            min = a;
        }
        String result8 = String.format("Sum of two integers: %d\nDifference of two integers: %d\nProduct of two " +
                "integers: %d\nAverage of two integers: %.2f\nDistance of two integers: %d\nMax integer: %d\nMin " +
                "integer: %d", sum, dif, pro, ave, dis, max, min);
        return result8;
    }
}
