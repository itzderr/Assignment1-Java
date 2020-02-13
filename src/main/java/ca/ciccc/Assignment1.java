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
    public static String inchesToMeters(int inches) {
        return inches*1.0+" inches is "+ inches * 0.0254 +" meters";
    }

    /**
     * Write a function that takes an integer between 0 and 1000 and adds all the digits.
     * Sample Input : 565
     *
     * @param number
     * @return "The sum of all digits in 565 is 16"
     */
    public static String addDigits(int number) {
        int answer = addDigitsHelper(number);
        return "The sum of all digits in "+number+" is "+Integer.toString(answer);
    }
    public static int addDigitsHelper(int number) {
        if (number <= 9){
            return number;
        }else{
            return number % 10 + addDigitsHelper((int)(number/10));
        }
    }

    /**
     * Write a function that takes an integer as minutes and convert it to years and days.
     * Sample Input : 3456789
     *
     * @param mins
     * @return "3456789 minutes is approximately 6 years and 210 days"
     */
    public static String minsToYearsDays(int mins) {
        int years = mins / 525600; // 525600 minutes in one year
        int days= (mins % 525600) / 1440; // 1440 minutes in one day
        return mins + " minutes is approximately " + years + " years and " + days + " days";
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
        return String.format("Body Mass Index is %.3f",(kgs/Math.pow((double)meters,2)));
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
        double miles = meters * 0.000621371;
        double kilometers = meters * 0.001;
        double h = hours + (double) minutes / 60 + (double) seconds / 3600;
        int totalSec = hours * 3600 + minutes * 60 + seconds;
        DecimalFormat formatNumbers = new DecimalFormat("#.####");
        formatNumbers.setRoundingMode(RoundingMode.FLOOR);
        String Kil_hours = formatNumbers.format((kilometers/h));
        return String.format("Your speed in meters/second is %.4f\nYour speed in km/h is %s\nYour speed in miles/h is %.4f", (double) meters/totalSec,Kil_hours, miles / h);
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

        return String.format("Square: %s\nCube: %s\nFourth power: %s",(int)Math.pow(number,2),(int)Math.pow(number,3),(int)Math.pow(number,4));
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
        int difference = Math.abs(a-b);
        int product = a * b;
        double average = ( a + b ) / 2;
        int distance = Math.abs(a-b);
        int max = (a>b)? a : b;
        int min = (a>b)? b : a;
        return String.format("Sum of two integers: %s\nDifference of two integers: %s\nProduct of two integers: %s\nAverage of two integers: %.2f\nDistance of two integers: %s\nMax integer: %s\nMin integer: %s",
                sum,difference,product,average,distance,max,min);
    }
}