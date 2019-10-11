package ca.ciccc;

import java.lang.reflect.Array;
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
        double meters = inches * (25.4 / 1000);
        String result = String.format("%.1f inches is %.1f meters", (float) inches, meters);
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
        String str = Integer.toString(number);
        String[] arr = str.split("", 3);
        Integer total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += Integer.parseInt(arr[i]);
        }
        String result = String.format("The sum of all digits in %d is %d", number, total);
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
        Integer years = mins / (60 * 24 * 365);
        Integer days = (mins / (60 * 24)) % 365;
        String result = String.format("3456789 minutes is approximately %d years and %d days", years, days);
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
        Double bmi = kgs / Math.pow(meters, 2);
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
        Double allSec = (double) (hours * 60 * 60 + minutes * 60 + seconds);
        Double allHour = (double) (hours + ((double) minutes / 60) + ((double) seconds / (60 * 60)));
        Double km = (double) meters / 1000;
        Double miles = (double) meters / 1609;

        Double ms = (double) (meters / allSec);
        Double kmh = (double) (km / allHour);
        Double mih = (double) (miles / allHour);

        BigDecimal bdms = new BigDecimal(String.valueOf(ms));
        BigDecimal bdkmh = new BigDecimal(String.valueOf(kmh));
        BigDecimal bdmih = new BigDecimal(String.valueOf(mih));

        // BigDecimal bgms1 = bdms.setScale(4, BigDecimal.ROUND_DOWN);
        BigDecimal bdms1 = bdms.setScale(4, RoundingMode.DOWN);
        BigDecimal bdkmh1 = bdkmh.setScale(4, RoundingMode.DOWN);
        BigDecimal bdmih1 = bdmih.setScale(4, RoundingMode.DOWN);

        String result = String.format("Your speed in meters/second is %.4f\nYour speed in km/h is %.4f\nYour speed in miles/h is %.4f",
        bdms1, bdkmh1, bdmih1);
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
        Integer square = (int) Math.pow(number, 2);
        Integer cube = (int) Math.pow(number, 3);
        Integer forth = (int) Math.pow(number, 4);
        String result = String.format("Square: %d\nCube: %d\nFourth power: %d", square, cube, forth);
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
        if (a < b) {
            Integer temp = a;
            a = b;
            b = temp;
        }
        Integer sum = a + b;
        Integer diff = a - b;
        Integer pro = a * b;
        Double ave = (double) ((a + b) / 2);
        Integer dist = Math.abs(a - b);
        Integer max = a;
        Integer min = b;
        String result = String.format("Sum of two integers: %d\nDifference of two integers: %d\nProduct of two integers: %d\nAverage of two integers: %.2f\nDistance of two integers: %d\nMax integer: %d\nMin integer: %d", sum, diff, pro, ave, dist, max, min);
        return result;
    }
}
