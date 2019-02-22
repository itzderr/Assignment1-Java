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

        double meters = inches * 0.0254;
        String result = String.format("%.1f inches is %.1f meters", inches, meters);

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
        int remainingNumber = number / 10;
        int SecondDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int thirdDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int fourthDigit = remainingNumber % 10;
        int sum = firstDigit + thirdDigit + SecondDigit + fourthDigit;

        String result = ("The sum of all digits in " + number + " is " + sum);

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

        double minutesInYear = 60 * 24 * 365;
        long years = (long) (mins / minutesInYear);
        int days = (int) (mins / 60 / 24) % 365;

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
        float timeSeconds = (hours*3600) + (minutes*60) + seconds;
        float mps = meters / timeSeconds;
        float kph = (meters / 1000.0f) / (timeSeconds / 3600.0f);
        float mph = kph / 1.609f;

        DecimalFormat df = new DecimalFormat("#.####");
        df.setRoundingMode(RoundingMode.DOWN);



        String result = String.format("Your speed in meters/second is %s\nYour speed in km/h is %s\nYour speed in miles/h is %s", df.format(mps), df.format(kph), df.format(mph));
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
        double fourthPower = Math.pow(number,4);





        String result = String.format("Square: %.0f\n" +
                "Cube: %.0f\n" +
                "Fourth power: %.0f", square, cube, fourthPower);
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
        int firstInteger = a;
        int secondInteger = b;
        int sum = firstInteger + secondInteger;
        int dif = firstInteger - secondInteger;
        int mult = firstInteger * secondInteger;
        float med = ( (firstInteger + secondInteger) / 2);
        int dist = firstInteger - secondInteger;
        int max = Math.max(firstInteger, secondInteger);
        int min = Math.min(firstInteger, secondInteger);

        String result = String.format("Sum of two integers: %d" +
                "\nDifference of two integers: %d" +
                "\nProduct of two integers: %d" +
                "\nAverage of two integers: %.2f" +
                "\nDistance of two integers: %d" +
                "\nMax integer: %d" +
                "\nMin integer: %d", sum, dif, mult, med, dist, max, min);
        return result;
    }
}
