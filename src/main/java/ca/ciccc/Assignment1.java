package ca.ciccc;

import java.math.BigDecimal;
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
        double meters = (inches * 0.0254);
        String result = (inches + " inches is " + meters + " meters");
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
        int answer = 0;
        int rest = number;

        while(rest > 10){
        int n = rest % 10;
        answer = answer + n;
        rest = rest / 10;

        if(rest <= 10){
            answer = answer + rest;
            break;
            }
        }


        return "The sum of all digits in " + number + " is " + answer;
    }

    /**
     * Write a function that takes an integer as minutes and convert it to years and days.
     * Sample Input : 3456789
     *
     * @param mins
     * @return "3456789 minutes is approximately 6 years and 210 days"
     */
    public static String minsToYearsDays(int mins) {
    int hour = mins / 60;
    int days = hour / 24;
    int year = days / 365;

        if(year >= 1){
            year = days / 365;
            days = days % 365;
        }

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
    public static String bmi(int kgs, double meters) {
        double BMI = kgs / (meters * meters);

        DecimalFormat df = new DecimalFormat();
        df.setMinimumFractionDigits(3);
        df.setRoundingMode(RoundingMode.DOWN);

        String bmi = df.format(BMI);

        return "Body Mass Index is " + bmi;
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
        double s = seconds + (minutes * 60) + (hours * 3600);
        double ms = meters / s;
        double kmh = 3600 * ms / 1000 ;
        double mih = 3600 * ms / 1609 ;

        DecimalFormat df = new DecimalFormat();
        df.setMinimumFractionDigits(4);
        df.setRoundingMode(RoundingMode.DOWN);

        String msf = df.format(ms);
        String kmhf = df.format(kmh);
        String mihf = df.format(mih);

        return "Your speed in meters/second is " + msf + "\n" + "Your speed in km/h is "+ kmhf +"\n" + "Your speed in miles/h is " + mihf;
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
        int cu = number * number * number;
        int fourth = number * number * number * number;

        return "Square: "+ sq + "\n" + "Cube: " + cu + "\n" + "Fourth power: " + fourth;
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

        DecimalFormat df = new DecimalFormat();
        df.setMinimumFractionDigits(2);
        df.setRoundingMode(RoundingMode.DOWN);

        String aves = df.format(ave);



        if(a > b){
            int dis = a - b;
            int max = a;
            int min = b;

            return "Sum of two integers: " + sum + "\n" +
                    "Difference of two integers: " + dif + "\n" +
                    "Product of two integers: " + pro + "\n" +
                    "Average of two integers: " + aves+  "\n" +
                    "Distance of two integers: " + dis + "\n" +
                    "Max integer: " + max + "\n" +
                    "Min integer: " + min ;
        }else{
            int dis = b - a;
            int max = b;
            int min = a;

            return "Sum of two integers: " + sum + "\n" +
                    "Difference of two integers: " + dif + "\n" +
                    "Product of two integers: " + pro + "\n" +
                    "Average of two integers: " + aves+  "\n" +
                    "Distance of two integers: " + dis + "\n" +
                    "Max integer: " + max + "\n" +
                    "Min integer: " + min ;
        }
    }
}
