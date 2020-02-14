package ca.ciccc;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;

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
        String result = String.format(Locale.CANADA,"%.1f degree Fahrenheit is equal to %.1f in Celsius", degree, celsius);

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

        double meters = inches * 0.0254;
        double new_inches = Double.valueOf(inches);
        String result = String.format(Locale.CANADA, "%.1f inches is %.1f meters",new_inches,meters );
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

        char[] list = String.valueOf(number).toCharArray();
        Integer sum = 0;
        for( char c : list ){
             sum = sum + Integer.valueOf(""+c);
        }
        return String.format("The sum of all digits in %d is %d", number,sum);
    }

    /**
     * Write a function that takes an integer as minutes and convert it to years and days.
     * Sample Input : 3456789
     *
     * @param mins
     * @return "3456789 minutes is approximately 6 years and 210 days"
     */
    public static String minsToYearsDays(int mins) {

        Integer amountDays = (int) (mins / 1440);
        Integer days = amountDays % 365;

        Integer years = (int)(amountDays / 365);


        return  String.format("%d minutes is approximately %d years and %d days", mins,years,days);
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
        double weightCalc = meters * meters;
        double bmi = (double) kgs / weightCalc;
        return String.format(Locale.CANADA,"Body Mass Index is %.3f", bmi);
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

        int totalSeconds = (hours * 3600) + (minutes * 60) + seconds;
        double meterSecond =  (double) meters / totalSeconds;
        double kmHour = meterSecond * 3.6;
        double mileHour =  meterSecond * 2.23694;
        BigDecimal bdMeterSecond = new BigDecimal(meterSecond).setScale(4, RoundingMode.FLOOR);
        BigDecimal bdKmHour = new BigDecimal(kmHour).setScale(4, RoundingMode.FLOOR);
        BigDecimal bdMileHour = new BigDecimal(mileHour).setScale(4, RoundingMode.FLOOR);

        String result = String.format(Locale.CANADA, "Your speed in meters/second is %.4f\n"
                + "Your speed in km/h is %.4f\n"
                + "Your speed in miles/h is %.4f", bdMeterSecond, bdKmHour,bdMileHour );

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

        double square = Math.pow(number,2);
        double cube = Math.pow(number,3);
        double fourth = Math.pow(number,4);


        return String.format("Square: %.0f\n"
                + "Cube: %.0f\n"
                + "Fourth power: %.0f", square,cube,fourth);
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

        if (b > a){
            a = a + b;
            b = a - b;
            a = a - b;
        }
        int sum =  a + b;
        int difference = a - b;
        int product  = a * b;
        double avarege = sum / 2;
        String result = String.format(Locale.CANADA,"Sum of two integers: %d\n"
                + "Difference of two integers: %d\n"
                + "Product of two integers: %d\n"
                + "Average of two integers: %.2f\n"
                + "Distance of two integers: %d\n"
                + "Max integer: %d\n"
                + "Min integer: %d",sum,difference,product,avarege,difference,a,b);

        return result;
    }
}
