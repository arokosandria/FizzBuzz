package fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test

    public void testFizzBuzzZero() {
        FizzBuzz f = new FizzBuzz();
        assertEquals("", f.FizzConvert(0));
    }

    @Test

    public void testFizzBuzzThree() {
        FizzBuzz f = new FizzBuzz();
        assertEquals("Fizz", f.FizzConvert(3));

    }

    @Test
    public void testFizzBuzzFive() {
        FizzBuzz f = new FizzBuzz();
        assertEquals("Buzz", f.FizzConvert(5));

    }

    @Test
    public void testFizzBuzzFiveteen() {
        FizzBuzz f = new FizzBuzz();
        assertEquals("FizzBuzz", f.FizzConvert(15));

    }

    @Test
    public void testFizzBuzzAnything() {
        FizzBuzz f = new FizzBuzz();
        assertEquals("2", f.FizzConvert(2));

    }


}


