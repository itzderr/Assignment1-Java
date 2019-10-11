package ca.ciccc;
import java.text.DecimalFormat;
import java.math.*;

public class Assignment1 {
    public static void main(String[] args) {

        System.out.println(inchesToMeters(1000));
        System.out.println(addDigits(565));
        System.out.println(bmi(70, 1.75));
        System.out.println(speed(2500, 5, 56, 23));
        System.out.println(powers(5));
        System.out.println(arithmetic(25, 5));

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
        double inches_dbl = new Double(inches);
        double meters = inches * 0.0254;
        String result = String.format("%.1f inches is %.1f meters", inches_dbl, meters);

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
        int sum = 0;
        int num = number;
        while (num > 0) {
            sum = sum + num % 10;
            num /= 10;
        }
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
        int days = mins / 1440;
        int years = days / 365;
        days = days % 365;
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
        double kgs_dbl = new Double(kgs);
        double bmi = kgs_dbl / (meters * meters);

        String bmi_result = String.format("%.5g%n", bmi);
        String result = String.format("Body Mass Index is " + bmi_result);
        result = result.replace("\n", "").replace("\r", "");

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
        DecimalFormat decimalFormat = new DecimalFormat("#.####");
        decimalFormat.setRoundingMode(RoundingMode.DOWN);

        float meters_f = (float)meters;
        float hours_f = (float)hours;
        float minutes_f = (float)minutes;
        float seconds_f = (float)seconds;

        String metSec = decimalFormat.format( meters_f / (hours_f * 3600 + minutes_f * 60 + seconds_f));
        String kmHour = decimalFormat.format( (meters_f/ 1000) / (hours_f + minutes_f / 60 + seconds_f / 3600));
        String milHour = decimalFormat.format( (meters_f/ 1609) / (hours_f + minutes_f / 60 + seconds_f / 3600));

        String result = ("Your speed in meters/second is " + metSec + "\n" + "Your speed in km/h is " + kmHour + "\n" + "Your speed in miles/h is " + milHour);

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
        int square = number * number;
        int cube = number * number * number;
        int fourthPower = number * number * number * number;

        String result = String.format("Square: %d\nCube: %d\nFourth power: %d", square, cube,fourthPower);

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
        int dif = Math.max(a, b) - Math.min(a, b);
        int pro = a * b;
        double ave = new Double((a + b) / 2);
        int dis = Math.abs(a - b);
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        String result = String.format("Sum of two integers: %d\n" +
                         "Difference of two integers: %d\n" +
                         "Product of two integers: %d\n" +
                         "Average of two integers: %.2f\n" +
                         "Distance of two integers: %d\n" +
                         "Max integer: %d\n" +
                         "Min integer: %d", sum, dif, pro, ave, dis, max, min);
        return result;
    }
}
