import ca.ciccc.Assignment1;
import org.junit.Assert;
import org.junit.Test;

public class Grader {
    @Test
    public void testFahrenheitToCelsiusPositive() {
        String result = Assignment1.fahrenheitToCelsius(212);
        String expect = "212.0 degree Fahrenheit is equal to 100.0 in Celsius";
        Assert.assertEquals(expect, result);
    }

    @Test
    public void testInchesToMeters() {
        String result = Assignment1.inchesToMeters(1000);
        Assert.assertEquals("1000.0 inches is 25.4 meters", result);
    }

    @Test
    public void testAddDigits() {
        String result = Assignment1.addDigits(565);
        Assert.assertEquals("The sum of all digits in 565 is 16", result);
    }

    @Test
    public void testMinsToYearsDays() {
        String result = Assignment1.minsToYearsDays(3456789);
        Assert.assertEquals("3456789 minutes is approximately 6 years and 210 days", result);
    }

    @Test
    public void testBmi() {
        String result = Assignment1.bmi(70, 1.75);
        Assert.assertEquals("Body Mass Index is 22.857", result);
    }

    @Test
    public void testSpeed() {
        String result = Assignment1.speed(2500, 5, 56, 23);
        Assert.assertEquals("Your speed in meters/second is 0.1169\nYour speed in km/h is 0.4208\nYour speed in miles/h is 0.2615", result);
    }

    @Test
    public void testPowers() {
        String result = Assignment1.powers(5);
        Assert.assertEquals("Square: 25\nCube: 125\nFourth power: 625", result);
    }

    @Test
    public void testArithmetic() {
        String result = Assignment1.arithmetic(25, 5);
        String expected = "Sum of two integers: 30\n" +
                "Difference of two integers: 20\n" +
                "Product of two integers: 125\n" +
                "Average of two integers: 15.00\n" +
                "Distance of two integers: 20\n" +
                "Max integer: 25\nMin integer: 5";
        Assert.assertEquals(expected, result);
    }
}
