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

        String result = String.format(inches2 + " inches is " + meters +" meters");

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

        String str = String.valueOf(number);
        int sum = 0;

        char[] array = str.toCharArray();

        for (int i = 0; i < str.length() ; i++) {
            sum = sum + (array[i] -'0');  // change from char position in ascii table to decimal
        }

        String result = String.format("The sum of all digits in " + number + " is " + sum);

        return result;

    }

    /**
     * Write a function that takes an integer as minutes and convert it to years and days.
     * Sample Input : 3456789
     *
     * @param mins
     * @return "3456789 minutes is approximately 6 years and 210 days"
     */

    // 1 hr = 60 min
    // 1 dia = 1440 min
    // 1 año = 365 dias (525,600 min)
    public static String minsToYearsDays(int mins) {

        int years = 0;
        int days = 0;

        days = mins / 1440;

        while (days > 365) {
                years++;
                days = days - 365;
        }

        String result = String.format(mins + " minutes is approximately " + years + " years and " + days + " days");

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

        double BMI =  kgs / (meters*meters);

        DecimalFormat format = new DecimalFormat("0.000");
        String result = String.format("Body Mass Index is " + format.format(BMI));

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

        double tot_seg = (hours*3600) + (minutes*60) + seconds;
        double tot_hours = tot_seg/3600;
        double miles = meters*0.0006213671;

        double ms = meters / tot_seg;
        double mh = miles / tot_hours;
        double kh= mh * 1.609;



        DecimalFormat format = new DecimalFormat("0.0000");


        String result = String.format(
                "Your speed in meters/second is " + format.format(ms) +
                        "\nYour speed in km/h is " + format.format(kh) +
                        "\nYour speed in miles/h is " + format.format(mh));

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

        int square = number*number;
        int cube = number*number*number;
        int fourth = number*number*number*number;


        String result = String.format(
                "Square: " + square +
                "\nCube: " + cube +
                "\nFourth power: " + fourth);

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


        if (a<b) {
            min = a;
            max = b;
        }
        else{
            min = b;
            max = a;
        }


        int sum = a + b;
        int difference = max - min;
        int product = a * b;
        double average = (a+b)/2;
        int distance = max - min;

        DecimalFormat format = new DecimalFormat("#.00");


        String result = String.format("Sum of two integers: " + sum +
                "\nDifference of two integers: " + difference +
                "\nProduct of two integers: " + product +
                "\nAverage of two integers: " + format.format(average) +
                "\nDistance of two integers: " + distance +
                "\nMax integer: " + max +
                "\nMin integer: " + min);

        return result;

    }
}
