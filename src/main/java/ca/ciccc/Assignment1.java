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

        double meters = 0.0254 * inches;
        String result = String.format("%.1f inches is %.1f meters" ,(double)inches, meters);
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
        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int ones = number % 10;
        int sum = hundreds + tens + ones;
        String result = String.format("The sum of all digits in %d is %d", number, sum);
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
        int hours = mins / 60;
        int days = hours / 24;
        int years = days / 365;
        int leftDays = days - years * 365;
        String result = String.format("%d minutes is approximately %d years and %d days", mins ,years, leftDays);
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
        double sumAsSecond = (double) hours * 60 * 60 + (double) minutes * 60 + (double) seconds;
        double sumAsHours = sumAsSecond / 60 / 60;
        double metersAsDouble = (double) meters;
        double miles = metersAsDouble / 1609.34;
        double meterToKm = metersAsDouble / 1000;
        double mps = metersAsDouble / sumAsSecond;
        double mlph = miles / sumAsHours;
        double kph = meterToKm / sumAsHours;

        String result = String.format("Your speed in meters/second is %.4f\nYour speed in km/h is %.4f\nYour speed in miles/h is %.4f", mps, kph, mlph);
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
        double fp = Math.pow(number, 4);
        String result = String.format("Square: %d\nCube: %d\nFourth power: %d",  (int)square, (int)cube, (int)fp);
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
        int sum = a + b;
        int dif;
            if(a > b) {
                dif = a - b;
            } else if( a == b) {
                dif = 0;
            } else {
                dif = b - a;
            }
        int prod = a * b;
        int ave = (a + b) / 2;
        int max;
            if(a > b) {
                max = a;
            } else if( a == b) {
                max = a;
            } else {
                max = b;
            }
        int min;
            if(a < b) {
                min = a;
            } else if( a == b) {
                min = a;
            } else {
                min = b;
            }

        String result = String.format("Sum of two integers: %d\nDifference of two integers: %d\nProduct of two integers: %d\nAverage of two integers: %.2f\nDistance of two integers: %d\nMax integer: %d\nMin integer: %d", sum, dif, prod, (double)ave, dif, max, min);

            return result;
    }
}
