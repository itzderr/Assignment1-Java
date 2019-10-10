package ca.ciccc;

import java.math.BigDecimal;
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
        BigDecimal bigInches = BigDecimal.valueOf( inches );
        BigDecimal bigMeter = BigDecimal.valueOf( inches / 39.37 );
        return String.format("%1.1f inches is %2.1f meters",bigInches, bigMeter);
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
        for (String str : Integer.toString(number).split("")) {
            sum += Integer.parseInt(str);
        }
        return String.format("The sum of all digits in %s is %s", Integer.toString(number), Integer.toString(sum));
    }

    /**
     * Write a function that takes an integer as minutes and convert it to years and days.
     * Sample Input : 3456789
     *
     * @param mins
     * @return "3456789 minutes is approximately 6 years and 210 days"
     */
    public static String minsToYearsDays(int mins) {
        int days = mins / 60 / 24;
        int years = days / 365;
        int restDays = days - (years * 365);

        return String.format("%s minutes is approximately 6 years and 210 days",
                Integer.toString(mins),
                Integer.toString(years),
                Integer.toString(restDays));
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
        return String.format("Body Mass Index is %1.3f", kgs / (meters * meters));
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
        System.out.println(meters/seconds);
        double totalSec = (hours*3600) + (minutes*60) + seconds;
        double totalHrs = totalSec/3600f;
        double miles = meters/1609.34f;
        float km = meters/1000f;
        return String.format("Your speed in meters/second is %1.4f\n" +
                "Your speed in km/h is %2.4f\n" +
                "Your speed in miles/h is %3.4f",
                meters/totalSec,
                BigDecimal.valueOf(km/totalHrs).setScale(4,BigDecimal.ROUND_DOWN),
                miles/totalHrs);
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
        int cube = square * number;
        int power = 0;
        for (int i = 1;i < number;i++) {
            if (i == 1) {
                power += number;
            } else {
                power *= number;
            }
        }

        return String.format("Square: %d\n" +
                "Cube: %d\n" +
                "Fourth power: %d", square, cube, power);
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
        int diff = a - b;
        int product = a * b;
        float ave = (a + b) / 2;
        int distance =Math.abs(a) - Math.abs(b);
        int max = Math.max(a,b);
        int min = Math.min(a,b);
        return String.format("Sum of two integers: %d\n" +
                        "Difference of two integers: %d\n" +
                        "Product of two integers: %d\n" +
                        "Average of two integers: %1.2f\n" +
                        "Distance of two integers: %d\n" +
                        "Max integer: %d\n" +
                        "Min integer: 5",
                sum,diff,product,ave,distance,max,min);
    }
}
