package ca.ciccc;

import java.math.BigDecimal;
import java.text.DecimalFormat;

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
        double meters = (inches2 * 0.0254);
        String meters_string = String.format("%.1f", meters);
        String inches_string = String.format("%.1f", inches2);
        String result = (inches_string + " inches is " + meters_string + " meters");
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

        String numberToSave = String.valueOf(number);
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }

        String result = "The sum of all digits in " + numberToSave + " is " + sum;

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

        int year=0;
        int days= mins/ 1440;
        while (days > 365)
        {
            days= days - 365;
            year= year+1;
        }
        String result= mins+" minutes is approximately 6 years and "+days+" days";

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
        double bmi=0.0;
        bmi= kgs/(meters*meters);
        String bmi_formated = String.format("%.3f",bmi);
        String result= "Body Mass Index is "+bmi_formated;
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
     * @return "Your speed in meters/second is 0.1169
     * Your speed in km/h is 0.4208
     * Your speed in miles/h is 0.2615"
     */
    public static String speed(int meters, int hours, int minutes, int seconds) {


        DecimalFormat df = new DecimalFormat("0.0000");

        double minutes_in_seconds= Double.parseDouble(df.format(minutes*60)); ;
        double hours_in_seconds= Double.parseDouble(df.format(hours*3600));  ;
        double time_in_seconds= Double.parseDouble(df.format(minutes_in_seconds+hours_in_seconds+seconds));
        double speed_meters_per_second= Double.parseDouble(df.format(meters/(time_in_seconds)));
        double speed_kilometers_per_hour= Double.parseDouble(df.format(speed_meters_per_second*3.6));
        double speed_miles_per_hour= Double.parseDouble(df.format(speed_meters_per_second*2.23693629));

       // df.format(minutes_in_seconds);
        String meters_seconds_string= String.format("%.4f",speed_meters_per_second);
        String kilometers_hour_string= String.format("%.4f",speed_kilometers_per_hour);
        String miles_hour_string= String.format("%.4f",speed_miles_per_hour);
        String result = "Your speed in meters/second is "+ meters_seconds_string+ "\n"+"Your speed in km/h is "+kilometers_hour_string+ "\n"+"Your speed in miles/h is "+miles_hour_string;
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
     * Cube: 125
     * Fourth power: 625"
     */
    public static String powers(int number) {
        int square=number*number;
        int cube= number*number*number;
        int fourth_power= number*number*number*number;
        return "Square: "+square+"\n"+"Cube: "+cube+"\n"+"Fourth power: "+fourth_power;
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
     * Difference of two integers: 20
     * Product of two integers: 125
     * Average of two integers: 15.00
     * Distance of two integers: 20
     * Max integer: 25
     * Min integer: 5"
     */
    public static String arithmetic(int a, int b) {

        DecimalFormat df = new DecimalFormat("#.##");
        int sum=a+b;
        int dif= a-b;
        int product= a*b;
        double number= (a+b)/2;
        double average= Double.parseDouble(df.format(number));
        int distance= Math.max(a,b)- Math.min(a,b);
        int max= Math.max(a,b);
        int min = Math.min(a,b);
        return "Sum of two integers: "+sum+"\n"+"Difference of two integers: "+dif+
                "\n"+"Product of two integers: "+product+"\n"+"Average of two integers: "+String.format( "%.2f", average)+"\n"+
                "Distance of two integers: "+distance+"\n"+"Max integer: "+max+"\n"+
                "Min integer: "+min;
    }
}
