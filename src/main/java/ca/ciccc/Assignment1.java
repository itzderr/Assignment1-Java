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
        double meters = inches / 39.3701;
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
        String str = Integer.toString(number);
        int sum = 0;
        for (int i = 0; i <= str.length() - 1; i++) {
            int num = Integer.parseInt(String.valueOf(str.charAt(i)));
            sum += num;
        }
        String result = String.format("The sum of all digits in %s is %s", number, sum);
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
        final int DAY = (60 * 24);
        final int YEAR = 365 * DAY;

        int year = mins / YEAR;
        int days = (mins - (year * YEAR)) / DAY;
        String result = String.format("%s minutes is approximately %s years and %s days", mins, year, days);

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
        double meters_per_second = meters / (double)(hours * 60 * 60 + minutes * 60 + seconds);
        double km_per_hour = ((meters / (hours + (double)minutes / 60 + (double)seconds / 60 / 60)) * 10);
        double meters_per_miles = km_per_hour / 1.609;

        String result = String.format(
            "Your speed in meters/second is %.4f\nYour speed in km/h is %.4f\nYour speed in miles/h is %.4f",
            meters_per_second,
            (int)km_per_hour / (double)10000,
            (int)meters_per_miles / (double) 10000
        );

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
        double fourth_power = Math.pow(number, 4);

        String result = String.format(
            "Square: %s\nCube: %s\nFourth power: %s",
            (int)square,
            (int)cube,
            (int)fourth_power
        );

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
        int diff = a - b;
        int times = a * b;
        double average = (a + b) / 2;
        int distance = a > b ? a - b : b - a;
        int max = a > b ? a : b;
        int min = a < b ? a : b;

        String format = "Sum of two integers: %d\n" +
                "Difference of two integers: %d\n" +
                "Product of two integers: %d\n" +
                "Average of two integers: %.2f\n" +
                "Distance of two integers: %d\n" +
                "Max integer: %d\nMin integer: %d";
        String result = String.format(
          format,
          sum,
          diff,
          times,
          average,
          distance,
          max,
          min
        );

        return result;
    }
}
