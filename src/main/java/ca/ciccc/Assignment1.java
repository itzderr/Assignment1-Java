package ca.ciccc;
import java.math.BigDecimal;

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

        double meters = (double) inches * 0.0254;
        String result = String.format("%.1f inches is %.1f meters", (double) inches, meters);

        return result;
    }

    /**
     * Write a function that takes an integer between 0 and 1000 and adds all the digits.
     * Sample Input : 565
     *
     * @param number
     * @return "The sum of all digits in 565 is 16"
     *
     * reference: https://stackoverflow.com/questions/27096670/how-to-sum-digits-of-an-integer-in-java
     */
    public static String addDigits(int number) {

        int sum = 0;
        int n = number;

        // by using above reference
        while (0 < n) {
            sum = sum + n % 10;
            n = n / 10;
        }
        String result = String.format("The sum of all digits in %s is %s", number, sum);

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

        String result = String.format("%s minutes is approximately", mins);

        // calculate year
        if (525600 <= mins) {
            int year = mins / 525600;
            mins -= year * 525600;
            result += String.format(" %s years and", year);
        }

        // calculate day
        int day = mins / 1440;
        result += String.format(" %s days", day);

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

        int sum_second = hours * 3600 + minutes * 60 + seconds;
        double sum_hours = hours + (double) minutes / 60 + (double) seconds / 3600;
        double km = (double) meters / 1000;
        double miles = (double) meters / 1609;

        String result = String.format("Your speed in meters/second is %.4f", (double) meters / sum_second);

        // number have to be applied floor function. ex) 1.666666 -> 1.6666, not 1.6667
        BigDecimal bd_km_h = new BigDecimal(km / sum_hours);
        result += String.format("\nYour speed in km/h is %.4f", bd_km_h.setScale(4, BigDecimal.ROUND_DOWN));
        BigDecimal bd_mile_h = new BigDecimal(miles / sum_hours);
        result += String.format("\nYour speed in miles/h is %.4f", bd_mile_h.setScale(4, BigDecimal.ROUND_DOWN));

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

        return String.format("Square: %s\nCube: %s\nFourth power: %s", (int) Math.pow(number,2), (int) Math.pow(number,3), (int) Math.pow(number,4));

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
        int mlt = a * b;
        double avg = sum / 2;
        int distance = Math.abs(a - b);
        int max = Math.max(a, b);
        int min = Math.min(a, b);

        String result = String.format("Sum of two integers: %s", sum);
        result += String.format("\nDifference of two integers: %s", dif);
        result += String.format("\nProduct of two integers: %s", mlt);
        result += String.format("\nAverage of two integers: %.2f", avg);
        result += String.format("\nDistance of two integers: %s", distance);
        result += String.format("\nMax integer: %s", max);
        result += String.format("\nMin integer: %s", min);

        return result;
    }
}
