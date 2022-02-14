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

        return String.format("%.1f degree Fahrenheit is equal to %.1f in Celsius", degree, celsius);
    }

    /**
     * Write a function program that takes an integer in inches, converts in to meters.
     * Sample Input : 1000
     *
     * @param inches
     * @return "1000.0 inches is 25.4 meters"
     */
    public static String inchesToMeters(int inches) {

        double inch = 1000;
        double meters = inch * 0.0254;

        return String.format("%d inches is equal to %.1f meters", inches, meters);
    }

    /**
     * Write a function that takes an integer between 0 and 1000 and adds all the digits.
     * Sample Input : 565
     *
     * @param number
     * @return "The sum of all digits in 565 is 16"
     */
    public static String addDigits(int number) {
        // Get the sum of the digits in number
        int lessThan10 = number % 10;
        // if the digit less than 10
        number /= 10;
        // tens
        int tens = number % 10;
        number /= 10;
        // hundreds
        int hundreds = number % 10;
        number /= 10;
        int sum = hundreds + tens + lessThan10;
        String result = String.format("The sum of digits in number is %d ", number, sum);

        return result;
        }

        /**
         * Write a function that takes an integer as minutes and convert it to years and days.
         * Sample Input : 3456789
         *
         * @param mins
         * @return "3456789 minutes is approximately 6 years and 210 days"
         */
        public static String minsToYearsDays (int mins) {

            int MinutesToYear = 60 * 24 * 365;
            int days = (mins / 60 / 24) % 365;
            String result = String.format("%d number is approximately %d years and %d days", MinutesToYear, days);

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
        public static String bmi ( int kgs, double meters) {

            float bmi = (float) (kgs / (meters * meters));
            String result = String.format("Your Body Mass Index is %f ", bmi);

            return result;
        }

        /*
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
        public static String speed ( int meters, int hours, int minutes, int seconds) {
            float timeSecond;
            float mps, kph, mph;
            // function
            timeSecond = (hours * 3600) + (minutes * 60) + seconds;
            mps = meters / timeSecond;
            kph = (meters / 1000.0f) / (timeSecond / 3600.0f);
            mph = kph / 1.609f;

            String result = String.format("Your speed in miles/h is ", mps);
            String result = String.format("Your speed in km/h is ", kph);
            String result = String.format("Your speed in miles/h is ", mph);

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
        public static String powers ( int number){
            double square_num = number * number;
            double cube_num = square_num * number;
            double fourth_power = cube_num * number;

            String result = String.format("Square: %.2f\n", square_num);
            String result = String.format("Cube: %.2f\n", cube_num);
            String result = String.format("Fourth power: %.2f", fourth_power);

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
        public static String arithmetic ( int a, int b) {

            double sum = a + b;
            double difference = a - b;
            double product = a * b;
            double average = (a + b) % 2;
            double distance = Math.abs(difference);
            double maximum = Math.max(a, b);
            double minimum = Math.min(a, b);

            String result = String.format("Sum of two integers: %f\n", sum);
            String result = String.format("Difference of two integers: %f\n", difference);
            String result = String.format("Product of two integers: %f\n", product);
            String result = String.format("Average of two integers: %.2f%n\n", average);
            String result = String.format("Distance of two integers: %f\n", distance);
            String result = String.format("Max integer: %.2f\n ", maximum);
            String result = String.format("Min integer: %.2f ", minimum);

            return result;
        }
    }