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
        double meters = inches * 0.0254;
        double i = Double.valueOf(inches);
        String result = String.format("%.1f inches is %.1f meters", i, meters);

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
        int digits = number;
        int sum = 0;
        while (number != 0) {
            sum = sum + (number % 10);
            number = number / 10;
        }
        String result = "The sum of all digits in " + digits + " is " + sum;

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
        int years = mins / 525600;
        int days = (mins % 525600) / 1440;
        String result  = mins + " minutes is approximately " + years
                + " years and " + days + " days";

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
        double weight = kgs;
        double height = meters;
        double bodyMassIndex = weight / Math.pow(height, 2);
        String result = String.format("Body Mass Index is %.3f", bodyMassIndex);

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
        double timeSeconds = (hours * 3600) + (minutes * 60) + seconds;
        double mps = meters / timeSeconds;
        double kph = ( meters / 1000.0f ) / ( timeSeconds / 3600.0f );
        double mph = kph / 1.609f;
        String result = String.format("Your speed in meters/second is %.4f\nYour speed in km/h is %.6s\nYour speed in miles/h is %.6s", mps, kph, mph);

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
        int power = (int)Math.pow(number, 4);
        String result = "Square: "+ square + "\nCube: " + cube + "\nFourth power: " + power;

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
        String result;
        result = String.format("Sum of two integers: %d\n", a + b);
        result += String.format("Difference of two integers: %d\n", a - b);
        result += String.format("Product of two integers: %d\n", a * b);
        result += String.format("Average of two integers: %.2f\n", (double) (a + b) / 2);
        result += String.format("Distance of two integers: %d\n", Math.abs(a - b));
        result += String.format("Max integer: %d\n", Math.max(a, b));
        result += String.format("Min integer: %d", Math.min(a, b));

        return result;
    }
}
