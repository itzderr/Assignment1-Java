package ca.ciccc;


import java.math.BigDecimal;

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
        double meters = inches * 0.0254;
        String str = String.format("%.1f inches is %.1f meters", inches2, meters);

        return str;
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
        sum = 0;
        if (number >= 0 && number <= 1000) {
            String str = Integer.toString(number);    // change data type to string
            int length = str.length();    // length of the number of the inputted digits

            for (int i = 0; i < length; i++) {
                String sub = str.substring(i, i + 1);       // take out using substring(begin index, end index)
                int I = Integer.parseInt(sub);              // change data type to int
                sum = sum + I;
            }

            String digit = String.format("The sum of all digits in %d is %d", number, sum);

            return digit;
        } else{
            return "";
        }
    }


    /**
     * Write a function that takes an integer as minutes and convert it to years and days.
     * Sample Input : 3456789
     *
     * @param mins
     * @return "3456789 minutes is approximately 6 years and 210 days"
     */
    public static String minsToYearsDays(int mins) {

       double mins2 = mins;
       double tempDays = mins2 / 1440;       // convert mins to days
       double tempYears = tempDays / 365;   // convert to years
       int intPart = (int)tempYears;        // int part -> years
       double decimalPart = tempYears - intPart;    // take out decimal part
       double days = decimalPart * 365;    // -> days
       double days2 = Math.floor(days);

       String str = String.format("%d minutes is approximately %d years and %.0f days", mins, intPart, days2);

       return str;
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
        //formula is weight(kg) / [height(m)]2(squared)
        double squareMeter = meters * meters;
        double BMI = kgs / squareMeter;
        String str = String.format("Body Mass Index is %.3f", BMI );
        return str;
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

        double meters_ = meters;
        double hours_ = hours;
        double minutes_ = minutes;
        double seconds_ = seconds;

        double totalSec = seconds_ + (minutes_ * 60) + ((hours_ * 60) * 60);
        double totalHours = hours_ + (minutes_ / 60) + ((seconds_ / 60) / 60);

        double meterSecond = meters_ / totalSec;

        double km = meters_ / 1000;
        double kilometerHour = km / totalHours;
        BigDecimal x = new BigDecimal(kilometerHour);
        x = x.setScale(4,BigDecimal.ROUND_DOWN);

        double mile = meters_ / 1609;
        double mileHour = mile / totalHours;
        BigDecimal y = new BigDecimal(mileHour);
        y = y.setScale(4, BigDecimal.ROUND_DOWN);


        String str1 = String.format("Your speed in meters/second is %.4f", meterSecond);
        String str2 = String.format("Your speed in km/h is %.4f", x);
        String str3 = String.format("Your speed in miles/h is %.4f",y);
        return str1 + "\n" + str2 + "\n" + str3;


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
        int Square = number * number;
        int Cube = number * number * number;
        int fourthPower = number * number * number * number;
        String str1 = String.format("Square: %d", Square);
        String str2 = String.format("Cube: %d", Cube);
        String str3 = String.format("Fourth power: %d", fourthPower);

        return str1 + "\n" + str2 + "\n" + str3;

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
        int diff;
        int maxInt;
        int minInt;

        if (a >= b){
            diff = a - b;
            maxInt = a;
            minInt = b;
        } else{
            diff = b - a;
            maxInt = b;
            minInt = a;
        }

        int product = a * b;
        double average = (a + b) / 2;
        int distance = maxInt - minInt;

        String str1 = String.format("Sum of two integers: %d",sum);
        String str2 = String.format("Difference of two integers: %d", diff);
        String str3 = String.format("Product of two integers: %d",product);
        String str4 = String.format("Average of two integers: %.2f",average);
        String str5 = String.format("Distance of two integers: %d",distance);
        String str6 = String.format("Max integer: %d",maxInt);
        String str7 = String.format("Min integer: %d",minInt);

        return str1 + "\n" + str2 + "\n" + str3 + "\n" + str4 + "\n" + str5 + "\n" + str6 +  "\n" + str7 ;
    }

}

