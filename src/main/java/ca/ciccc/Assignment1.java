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
        double dinches = inches;
        double meter;
        meter = 0.0254 * inches;
        String result = String.format(dinches + " inches is " + meter + " meters");

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
        int sum = 0;
        int digits = number;
        while (digits > 0){
            sum = sum + digits % 10;
            digits  = digits / 10;
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
    public static String minsToYearsDays(int mins) {

       int years = (mins / (60 * 24 * 365));
       int days  = mins / (60 * 24) - (years * 365) ;

       String result = String.format("3456789 minutes is approximately " + years + " years and " + days + " days");

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
        double bmi = (kgs / (meters * meters));
        double dbmi = (Math.floor(bmi * 1000.0)/1000.0);
        String result = String.format("Body Mass Index is " + dbmi);

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
        double totalSec = (hours * 3600) + (minutes * 60) + seconds;
        double kPh = meters / (totalSec/3.6);
        double mPs = meters / totalSec;
        double mPh = kPh / 1.609;
        double dkPh = (Math.floor(kPh * 10000.0)/10000.0);
        double dmPs = (Math.floor(mPs * 10000.0)/10000.0);
        double dmPh = (Math.floor(mPh * 10000.0)/10000.0);

        String result = (String.format("Your speed in meters/second is " + dmPs +"\n" + "Your speed in km/h is " + dkPh + "\n" + "Your speed in miles/h is " + dmPh));


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
        int square = number * number ;
        int cube = number * number * number;
        int fourth_power = number * number * number * number;
        String result = String.format("Square: " +square+ "\n" + "Cube: " + cube +"\n" +"Fourth power: " +fourth_power);

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
        int difference = a - b;
        int product = a * b;
        double average = (a + b) / 2;

        int distance = Math.abs(a - b);
        int max = Math.max(a,b);
        int min = Math.min(a,b);
        String result = (String.format("Sum of two integers: "+ sum + "\n" +
                        "Difference of two integers: "+ difference + "\n" +
                        "Product of two integers: "+ product + "\n" +
                        "Average of two integers: " + average + 0 + "\n" +          // "%.f2", value
                        "Distance of two integers: "+ distance + "\n" +
                        "Max integer: " +max+ "\n" +
                        "Min integer: " + min));

        return result;
    }
}
