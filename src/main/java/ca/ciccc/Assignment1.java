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
        double metersPerInch = 0.0254;
        double convertToMeters = (double)inches * metersPerInch;
        return "1000.0 inches is " + convertToMeters + " meters";
    }

    public static void main(String[] args) {
        System.out.println(inchesToMeters(1000));
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
        while(num > 0){
            int remainder = num % 10;
            sum = sum + remainder;
            num = num / 10;
        }
        return "The sum of all digits in " + number + " is " + sum;
    }


    /**
     * Write a function that takes an integer as minutes and convert it to years and days.
     * Sample Input : 3456789
     *
     * @param mins
     * @return "3456789 minutes is approximately 6 years and 210 days"
     */
    public static String minsToYearsDays(int mins) {
        int dayNum = mins / (60 * 24);
        int year = dayNum / 365;
        int days = (dayNum % 365);
        return mins + " minutes is approximately " + year + " years and " + days + " days";
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
    // String.format() was referred to following URL.
    // https://stackoverflow.com/questions/7278128/formatting-string-in-java-using-return-string-format
    public static String bmi(int kgs, double meters) {
        double bmiVal = kgs / (meters * meters);
        String answer = String.format("Body Mass Index is %.3f", bmiVal);
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

    // I referred to following URL regarding how to cut under decimal place 5.
    // https://qiita.com/ota-meshi/items/967304d406d668febe1d
    public static String speed(int meters, int hours, int minutes, int seconds) {
        double metersSeconds = (double)meters / ((((hours * 60) + minutes) * 60) + seconds);
        BigDecimal msSrc = BigDecimal.valueOf(metersSeconds);
        BigDecimal msVal = msSrc.setScale(4, RoundingMode.DOWN);
        double kilometersHours = (double)meters / 1_000 / (hours + ((double)minutes / 60) + ((double)seconds / (60 * 60)));
        BigDecimal khSrc = BigDecimal.valueOf(kilometersHours);
        BigDecimal khVal = khSrc.setScale(4, RoundingMode.DOWN);
        double milesHours = (double)meters / 1_609 / (hours + ((double)minutes / 60) + ((double)seconds / (60 * 60)));
        BigDecimal mhSrc = BigDecimal.valueOf(milesHours);
        BigDecimal mhVal = mhSrc.setScale(4, RoundingMode.DOWN);

        return "Your speed in meters/second is " + msVal +
                "\nYour speed in km/h is " + khVal +
                "\nYour speed in miles/h is " + mhVal;
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
        int fourth = cube * number;
        return "Square: " + square + "\nCube: "+ cube + "\nFourth power: " + fourth;
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
        int difference = a - b;
        int product = a * b;
        double average = ((double)(a + b) / 2);
        int distance = Math.abs(a - b);
        int maxVal = Math.max(a, b);
        int minVal = Math.min(a, b);

        return "Sum of two integers: " + sum + "\n" +
                "Difference of two integers: " + difference + "\n" +
                "Product of two integers: " + product + "\n" +
                "Average of two integers: " + String.format("%.2f", average) + "\n" +
                "Distance of two integers: " + distance + "\n" +
                "Max integer: " + maxVal + "\nMin integer: " + minVal;
    }
}
