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
        int inchesToMeters = (inches * 25.4);


        return inchesToMeters();
    }

    /**
     * Write a function that takes an integer between 0 and 1000 and adds all the digits.
     * Sample Input : 565
     *
     * @param number
     * @return "The sum of all digits in 565 is 16"
     */
    public static String addDigits(int number) {
        int sum;
        for (sum = 0; n > 0; sum += n % 10, n /= 10);{
            return sum;
        }


        return sum;
    }

    /**
     * Write a function that takes an integer as minutes and convert it to years and days.
     * Sample Input : 3456789
     *
     * @param mins
     * @return "3456789 minutes is approximately 6 years and 210 days"
     */
    public static String minsToYearsDays(int mins) {
        int answer;
        // 525600 are all the minutes in 1 year (60 times 24 times 365)
        double answer = (mins / 525600);

        return answer;
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
        int bmi;
        int bmi = (kgs) / (meters * meters);

        return bmi;
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
        int speed1;
        int speed2;
        int speed3;
        int minh;
        int sech;
        int sumstime;
        // convert minutes & seconds to hours
        double minh = (minutes / 60);
        double sech = ((seconds / 60) / 60);
        // Sum the 3 time entries
        double sumstime = (hours += minh += sech);
        // calculate the 3 speed labels
        double speed1 = (meters / sumstime);
        // formula according to mathworksheets4kids.com
        double speed2 = ((speed1 * 18) / 5);
        // formula accoring to sciencing.com
        double speed3 = (speed1 * 2.2369);
        // print the speed labels
        public static printing (double speed1 double speed2 double speed3){
            System.out.print("Your speed in meters/second is: speed1");
            System.out.print("Your speed in km/h is: speed2");
            System.out.print("Your speed in miles/h is: speed3");
        }


        return printing;
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
        int cube;
        int square;
        int fourth;
        int square = (number * number);
        int cube = (number * number * number);
        int fourth = (number * number * number * number);

        public static print (int cube int square int fourth){
            System.out.print("Square: square");
            System.out.print("Cube: cube");
            System.out.print("Fourth: fourth");
        }

        return print;
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
        int sum;
        int diference;
        int product;
        double average;
        int absolute;
        int max;
        int min;
        // calculate the values
        int sum = (a += b);
        int diference = (a -= b);
        int product = (a * b);
        double average = ((a += b) / 2);
        if (diference > 0);
            int absolute = diference;
        else;
            int absolute = (diference * -1);
        if (a > b);
            int max = a;
            int min = b;
        else
            int max = b;
            int min = a;

        public static print (int sum int diference int product double average int absolute int max int min){
            System.out.print("Sum of two integers: sum");
            System.out.print("Difference of two integers: diference");
            System.out.print("Product of two integers: product");
            System.out.print("Average of two integers: average");
            System.out.print("Distance of two integers: absolute");
            System.out.print("Max integer: max");
            System.out.print("Min integer: min");

        }

        return "";
    }
}
