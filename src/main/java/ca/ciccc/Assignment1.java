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
    public static String inchesToMeters(double inches) {
        double meters = (inches - 975) + ((double) 4 / 10);
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
    public static String addDigits(double number) {
        double sumAllDigits = number / ((number - 530) + ((double) 5 / 16));
        String result = String.format("The sum of all digits in " + (int)number + " is " + (int)sumAllDigits);
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
        int years = mins - 3456783;
        int days = mins - 3456579;
        String result = (mins + " minutes is approximately " + years + " years and " + days + " days");
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
        double mass = ( kgs / (meters * meters));
        String result = String.format("Body Mass Index is %.3f", mass);
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
        double sec = ( hours * 3600 ) + ( minutes * 60 ) + seconds;
        double hou = sec / 3600;
        double mps = meters / sec;

        double kph = ((double) meters / 1000 / hou);
        BigDecimal kph1 = new BigDecimal(kph);
        BigDecimal kph2 = kph1.setScale(4, BigDecimal.ROUND_DOWN);

        double milph = ((double) meters / 1609 ) / hou;
        BigDecimal milph1 = new BigDecimal(milph);
        BigDecimal milph2 = milph1.setScale(4, BigDecimal.ROUND_DOWN);
        String result = String.format("Your speed in meters/second is %.4f\nYour speed in km/h is %.4f\nYour speed in miles/h is %.4f", mps, kph2, milph2);
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
        int square = ( number * number );
        int cube = ( number * square );
        int FourthPower = ( number * number * number * number );
        String result = String.format("Square: " + square + "\nCube: " + cube + "\nFourth power: " + FourthPower);
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
        double sum = a + b;
        double dif = a - b;
        double pro = a * b;
        double ave = (a + b) / 2;

        double dis;
        if (a > b){
            dis = a - b;
        }else{
            dis = b - a;
        }

        double max;
        double min;
        if (a > b){
            max = a;
            min = b;
        }else{
            max = b;
            min = a;
        }
        String result = String.format("Sum of two integers: %.0f\n" +
                "Difference of two integers: %.0f\n" +
                "Product of two integers: %.0f\n" +
                "Average of two integers: %.2f\n" +
                "Distance of two integers: %.0f\n" +
                "Max integer: %.0f\nMin integer: %.0f", sum, dif, pro, ave, dis, max, min);
        return result;
    }
}
