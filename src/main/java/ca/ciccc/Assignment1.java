
package ca.ciccc;
import java.math.*;

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
     * @return "1000.0 inches is 25.4 meters  0.0254"
     */
    public static String inchesToMeters(int inches) {

        double in = inches;
        double meters = in * 0.0254;
         String result = String.format("%.1f inches is %.1f meters", in, meters);

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
        int num = number;
        int sum = 0;

        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
            }
        String sum0 = String.format("The sum of all digits in %d is %d", number, sum);
        return sum0;
    }

    /**
     * Write a function that takes an integer as minutes and convert it to years and days.
     * Sample Input : 3456789
     *
     * @param mins
     * @return "3456789 minutes is approximately 6 years and 210 days"
     */
    public static String minsToYearsDays(int mins) {
        int days = mins / 1440;
        int years = days / 365;
        int days1 = days - 365 * years;

        String app = String.format("%d minutes is approximately %d years and %d days", mins, years, days1);

        return app;
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
        double bmi = kgs / Math.pow(meters, 2);

        String bmi1 = String.format("Body Mass Index is %.3f", bmi); // 3-digit

        return bmi1;
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
        double seconds1 = seconds + minutes * 60 + hours * 60 * 60;
        double hours1 = hours + (double)minutes / 60 + (double)seconds / 60 /60;
        double km = (double)meters / 1000;
        double miles = (double)meters / 1609;
        double mps = ((double)meters / seconds1);
        double kph = km / hours1;
        double mph = miles / hours1;

        DecimalFormat df = new DecimalFormat("#.####");
        df.setRoundingMode(RoundingMode.FLOOR);
        String  result  = String.format("Your speed in meters/second is %.4f\nYour speed in km/h is %s\nYour speed in miles/h is %s",
                mps, df.format(kph), df.format(mph));


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
        double sqr = Math.pow(number, 2);
        double cb = Math.pow(number,3);
        double fp = Math.pow(number, 4);

        String result = String.format("Square: %.0f\nCube: %.0f\nFourth power: %.0f", sqr, cb, fp);

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
     * @return ""Sum of two integers: 30"
     *          Difference of two integers: 20
     *          Product of two integers: 125
     *          Average of two integers: 15.00
     *          Distance of two integers: 20
     *          Max integer: 25
     *          Min integer: 5"
     */
    public static String arithmetic(int a, int b) {
        int sum = a + b;
        int pro = a * b;
        int dif = 0;
        int dis = 0;
        int max = 0;
        int min = 0;
        double ave = (double)(a + b) / 2;


        if (a > b ){
            dif = a - b;
            dis = a - b;
            max = a;
            min = b;
        }
        else {
            dif = b - a;
            dis = b - a;
            max = b;
            min = a;
        }

        String result = String.format("Sum of two integers: %d\nDifference of two integers: %d\n" +
                "Product of two integers: %d\nAverage of two integers: %.2f\nDistance of two integers: %d\n" +
                "Max integer: %d\nMin integer: %d", sum, dif, pro, ave, dis, max, min);
        return result;
    }
}
