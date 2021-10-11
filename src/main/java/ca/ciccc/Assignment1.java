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

        inches = inches;
        double float_inches = inches;
        double meters = inches * 0.0254;
        String result = String.format(float_inches + " inches is " + meters + " meters");

        return result;  // return result
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

        while(number > 0) {
            sum += number % 10;
            number /= 10;
        }

        String result = String.format("The sum of all digits in 565 is " + sum);
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

        int minutes = mins;

        int years = minutes / (60 * 24 * 365);
        int remainMinutes = minutes % (60 * 24 * 365);
        int days = remainMinutes / (60 * 24);

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

        double weight = kgs;
        double height = meters;
        double Body_Mass = weight / (height * height);
        String BM_Triple = String.format("%.3f", Body_Mass);

        String result = String.format("Body Mass Index is " + BM_Triple);
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

        double timeSeconds;
        double mps, kph, mph;

        double distance = meters;
        double hr = hours;
        double min = minutes;
        double sec = seconds;

        timeSeconds = (hr*3600) + (min*60) + sec;
        mps = distance / timeSeconds;
        kph = ( distance/1000.2f ) / ( timeSeconds/3600.0f );
        mph = kph/1.609f;

        String mps_4dec = String.format("%.4f", mps);
        String kph_4dec = String.format("%.4f", kph);
        String mph_4dec = String.format("%.4f", mph);

        String result = String.format(
            "Your speed in meters/second is " + mps_4dec + "\n" +
            "Your speed in km/h is " + kph_4dec + "\n" +
            "Your speed in miles/h is " + mph_4dec
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

        double value = number;
        double square = value * value;
        double cube = value * value * value;
        double fourth_p = value * value * value * value;

        // remove decimals
        String sq = String.format("%.0f", square);
        String cu = String.format("%.0f", cube);
        String fo = String.format("%.0f", fourth_p);

        String result = String.format(
            "Square: " + sq + "\n" +
            "Cube: " + cu + "\n" +
            "Fourth power: " + fo
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

        int number_a = a;
        int number_b = b;

        int sum = number_a + number_b;
        int difference = number_a - number_b;
        int product = number_a * number_b;
        double i = sum / 2;
        double average = i;
        String average_float = String.format("%.2f", average);
        int distance = Math.abs(difference);
        int max =  Math.max(number_a, number_b);
        int min =  Math.min(number_a, number_b);



        String result = String.format(
            "Sum of two integers: " + sum + "\n" +
            "Difference of two integers: " + difference + "\n" +
            "Product of two integers: " + product + "\n" +
            "Average of two integers: " + average_float + "\n" +
            "Distance of two integers: " + distance + "\n" +
            "Max integer: " + max + "\n" +
            "Min integer: " + min
        );

        return result;
    }
}
