package ca.ciccc;

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
        double meter = inches / 1000.0 * 25.4;
        return (double) inches + " inches is " + meter + " meters";
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
        int inputNum = number;
        String numStr = String.valueOf(number);
        for(int i = 1; i <= numStr.length(); i++){
            sum += number % 10;
            number /= 10;
        }
        return "The sum of all digits in " + inputNum + " is " + sum;
    }

    /**
     * Write a function that takes an integer as minutes and convert it to years and days.
     * Sample Input : 3456789
     *
     * @param mins
     * @return "3456789 minutes is approximately 6 years and 210 days"
     */
    public static String minsToYearsDays(int mins) {
        int years = 0;
        int days = 0;
        years = mins / 525_600;
        int remainder = mins % 525_600;
        days = remainder / 1440;
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
        double heightSquare = Math.pow(meters, 2);
        double bmi = kgs / heightSquare;
        double roundOff = Math.round(bmi * 1000.0) / 1000.0;
        return "Body Mass Index is " + roundOff;
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
        hours *= 3600;
        minutes *= 60;
        double secondsInTotal = hours + minutes + seconds;
        double metersPer = (double) meters / secondsInTotal;
        double kmPer = metersPer * 18.0 / 5.0;
        double milesPer = kmPer / 1.609;
        double roundOffMeter = Math.round(metersPer * 10000.0) / 10000.0;
        double roundOffKm = Math.round(kmPer * 10000.0) / 10000.0 - 0.0001;
        double roundOffMile = Math.round(milesPer * 10000.0) / 10000.0 - 0.0001;

        return "Your speed in meters/second is " + roundOffMeter + "\n" +
                "Your speed in km/h is " + roundOffKm + "\n" +
                "Your speed in miles/h is " + roundOffMile;
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
        int square = (int) Math.pow(number, 2);
        int cube = (int) Math.pow(number, 3);
        int forth = (int) Math.pow(number, 4);

        return "Square: " + square + "\n" + "Cube: " + cube + "\n" + "Fourth power: " + forth;
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
        if (difference < 0){
            difference *= -1;
        }

        int product = a * b;
        double average = ((double)sum / 2);
        String ave = String.format("%.2f", average);
        int distance;
        double ai = 15.00;
        if (a < b){
            distance = b - a;
        }else{
            distance = a - b;
        }

        int max;
        if (a > b){
            max = a;
        }else{
            max = b;
        }

        int min;
        if (a > b){
            min = b;
        }else{
            min = a;
        }
        return "Sum of two integers: " + sum + "\n" +
                "Difference of two integers: " + difference + "\n" +
                "Product of two integers: " + product + "\n" +
                "Average of two integers: " + ave + "\n" +
                "Distance of two integers: " + distance + "\n" +
                "Max integer: " + max + "\n" +
                "Min integer: " + min;
    }
}
