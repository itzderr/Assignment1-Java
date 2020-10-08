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

        double inches2 = inches;
        double meters = inches / 39.37;
        String result = String.format("%.1f inches is %.1f meters", inches2, meters);

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
        int a = number / 1000 % 10;
        int b = number / 100 % 10;
        int c = number / 10 % 10;
        int d = number % 10;
        int sum = a + b + c + d;
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
        int years = mins / 60 / 24 / 365;
        int days = mins / 60 / 24 - years * 365;
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
        double meterSecond = (double) meters / (hours * 3600 + minutes * 60 + seconds);
        double kmHour = meterSecond * 3.6 - 0.0001;
        double mileHour = meterSecond * 3600 / 1609 - 0.0001;
//        double kmHour = ((double) meters / 1000) / ((double) (hours * 3600 + minutes * 60 + seconds) / 3600) - 0.0001;
//        double mileHour = ((double) meters / 1609) / ((double) (hours * 3600 + minutes * 60 + seconds) / 3600) - 0.0001;
        String result1 = String.format("Your speed in meters/second is %.4f", meterSecond);
        String result2 = String.format("Your speed in km/h is %.4f", kmHour);
        String result3 = String.format("Your speed in miles/h is %.4f", mileHour);
        String result = result1 + "\n" + result2 + "\n" + result3;

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
        int square = number * number;
        int cube = number * number * number;
        int fourth = number * number * number * number;
        String result = String.format("Square: %d\nCube: %d\nFourth power: %d", square, cube, fourth);

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
        int dif = a - b;
        int pro = a * b;
        double ave = (double) (a + b) / 2;
        int dis = Math.abs(a - b);
        int max = 0;
        int min = 0;
        if (a >= b) {
            max = a;
            min = b;
        } else {
            max = b;
            min = a;
        }
        String result1 = String.format("Sum of two integers: %d", sum);
        String result2 = String.format("Difference of two integers: %d", dif);
        String result3 = String.format("Product of two integers: %d", pro);
        String result4 = String.format("Average of two integers: %.2f", ave);
        String result5 = String.format("Distance of two integers: %d", dis);
        String result6 = String.format("Max integer: %d", max);
        String result7 = String.format("Min integer: %d", min);
        String result = result1 + "\n" + result2 + "\n" + result3 + "\n" + result4 + "\n" + result5 + "\n" + result6 + "\n" + result7;

        return result;
    }
}
