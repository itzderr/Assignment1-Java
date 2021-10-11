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
        float inches2 = (float) inches;
        float meters = (float)((inches2) * (0.0254));
        String result = String.format("%.1f inches is %.1f meters",inches2,meters);


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
        //int radomnumber=(int)(Math.random()*1000+1);
        int sum=0;
        int clux=number;

        while (clux > 0)
           {
            sum = sum + (clux % 10);
            clux = clux / 10;
           }
        String result = String.format("The sum of all digits in %d is %d",number,sum);

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
        int years=mins / (1440*365);
        int mins_days=mins % (1440*365);
        int days=mins_days / 1440;
        String result = String.format("%d minutes is approximately %d years and %d days",mins,years,days);


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
        double bmiresult=kgs/meters/meters;
        String result = String.format("Body Mass Index is %.3f",bmiresult);
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
       double dhours=(double)hours;
       double dmeters=(double)meters;
       double dminutes=(double)minutes;
       double dseconds=(double)seconds;
       double meterSecond=(double)(dmeters/(dhours*3600+dminutes*60+dseconds));
       double kmh=Math.floor(((dmeters/1000)/((dhours*3600+dminutes*60+dseconds)/3600))*10000.0)/10000.0;
       double milesh=Math.floor(((dmeters/1609)/((dhours*3600+dminutes*60+dseconds)/3600))*10000.0)/10000.0;
       String result = String.format("Your speed in meters/second is %.4f\nYour speed in km/h is %.4f\nYour speed in miles/h is %.4f",meterSecond,kmh,milesh);

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
        double square=Math.pow(number,2);
        double Cube=Math.pow(number,3);
        double Fourth=Math.pow(number,4);
        int dSquare=(int)(square);
        int dCube=(int)(Cube);
        int dFourth=(int)(Fourth);
        String result = String.format("Square: %d\nCube: %d\nFourth power: %d",dSquare,dCube,dFourth);


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
        int Sum=a+b;
        int Difference=Math.abs(a-b);
        int Product=a*b;
        double Ave;
        int Maxint;
        int Minint;
       Ave=(double)((double)a+(double)b)/2;
        int Distance=Math.abs(a-b);
        if (a>b)
        {Maxint=a;
         Minint=b;}
        else
        {Maxint=b;
         Minint=a;}
        String result = String.format("Sum of two integers: %d\nDifference of two integers: %d\nProduct of two integers: %d\nAverage of two integers: %.2f\nDistance of two integers: %d\nMax integer: %d\nMin integer: %d",Sum,Difference,Product,Ave,Distance,Maxint,Minint);

        return result;
    }
}
