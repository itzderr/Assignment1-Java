package ca.ciccc;

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
    public static String inchesToMeters(int inches) {
        double inches2 = inches;
        double meters = inches * 0.0254;
        String result = String.format("%s inches is %s meters", inches2, meters);

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
        char[] num = str.toCharArray();
        int sum = 0;
        for (char i : num) {
            int j = Character.getNumericValue(i);
            sum += j;
        } String result = String.format("The sum of all digits in %s is %s", number, sum);
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
        int years = mins / 525_600;
        int days = (mins / 1440) % 365;
        String result = String.format("%s minutes is approximately %s years and %s days", mins, years, days);
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
        double speed_m = (double) meters / (hours * 3600 + minutes * 60 + seconds);
        double speed_k = (double) meters / 1000 / (hours + (double) minutes / 60 + (double) seconds / 3600);
        double speed_mi = (double) meters / 1609 / (hours + (double) minutes / 60 + (double) seconds / 3600);
        String result = String.format("Your speed in meters/second is %.4f\nYour speed in km/h is %.4f\n" +
                "Your speed in miles/h is %.4f", speed_m-0.00005, speed_k-0.00005, speed_mi-0.00005);
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
        double square = Math.pow(number, 2);
        double cube = Math.pow(number, 3);
        double fourth_power = Math.pow(number, 4);
        int s = (int) Math.round(square);
        int c = (int) Math.round(cube);
        int f = (int) Math.round(fourth_power);
        String result = String.format("Square: %s\nCube: %s\nFourth power: %s", s, c, f);
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
        int min;
        int max;
        if (a < b) {
            min = a;
            max = b;
        } else {
            min = b;
            max = a;
        }
        int sum = a + b;
        int dif = max - min;
        int prod = a * b;
        double ave = (double) (a + b) / 2;
        int dis = max - min;
        String result = String.format("Sum of two integers: %s\n" +
                "Difference of two integers: %s\n" +
                "Product of two integers: %s\n" +
                "Average of two integers: %.2f\n" +
                "Distance of two integers: %s\n" +
                "Max integer: %s\nMin integer: %s", sum, dif, prod, ave, dis, max, min);
        return result;
    }
}