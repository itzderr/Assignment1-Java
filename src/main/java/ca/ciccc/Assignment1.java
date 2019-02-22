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
        double meters = inches/39.37;
        String result = String.format("%.1f inches is %.1f meters", (double)inches, meters);

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
        int sumNumberResult = 0;
        int numberResult;
        for (int i = number; i>0; i = i/10) {
            numberResult = i%10;
            sumNumberResult = sumNumberResult + numberResult;
        }

        String result = String.format("The sum of all digits in %d is %d", number, sumNumberResult);


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
        //1 day = 1440 minutes
        //1 year = 365 days

        int day = mins/1440;
        int year = day/365;
        int restDays = day % 365;

        String result = String.format("%d minutes is approximately %d years and %d days", mins, year, restDays);

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
        //BMI = kg/mt

        double bmi = kgs/(meters*meters);

        String result =  new DecimalFormat("###.###").format(bmi);


        return "Body Mass Index is "+result;
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

        int hourToMinutes = hours * 60; // 300
        double seconds2 = seconds + (minutes * 60) + (hourToMinutes *60); //3360+18000+23 = 21383
        double hours2 = seconds2/60/60; // 5.939722222222222

        double meters2 = (double) meters;
        double metersPerSecond = meters2/seconds2;
        double kilometers = meters2/1000;
        double kilometersPerHour = kilometers/hours2;
        double miles = meters2 / 1609.34;
        double milesPerHour = miles / hours2;
        double kilometersPerHourTrunc = Math.floor(kilometersPerHour*10000)/10000;
        double milesPerHourTrunc = Math.floor(milesPerHour*10000)/10000;

        return String.format("Your speed in meters/second is %.4f%nYour speed in km/h is %.4f%nYour speed in miles/h is %.4f", metersPerSecond, kilometersPerHourTrunc, milesPerHourTrunc);
        //return String.format("Your speed in meters/second is "+new DecimalFormat("#.####").format(metersPerSecond)+"%nYour speed in km/h is "+new DecimalFormat("#.####").format(kilometersPerHour)+"%nYour speed in miles/h is "+new DecimalFormat("#.####").format(milesPerHour));
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

        return String.format("Square: %d%nCube: %d%nFourth power: %d", square, cube, fourth);
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
        int sum = a+b;
        int diff = a-b;
        int prod = a*b;
        double average = (a+b)/2;
        int dist;
        if ((a<0 && b>0) || (a>0 && b<0)){
            dist = -(a-b);
        } else if (a - b < 0){
            dist = a+b;
        } else {
            dist = a-b;
        }
        int max = a;
        int min = b;
        if(b>a){
            max = b;
            min = a;
        }
        return String.format("Sum of two integers: %d\nDifference of two integers: %d\nProduct of two integers: %d\nAverage of two integers: %.2f\nDistance of two integers: %d\nMax integer: %d\nMin integer: %d", sum, diff, prod, average, dist, max, min);
    }
}
