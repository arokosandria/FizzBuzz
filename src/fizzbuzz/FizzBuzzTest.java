package fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {


    FizzBuzz f=new FizzBuzz();
@Test

public void testFizzBuzzZero() {
    assertEquals("", f.FizzConvert(0));
}
    @Test

    public void testFizzBuzzThree(){
        assertEquals("Fizz",f.FizzConvert(3));

    }
    @Test
    public void testFizzBuzzFive(){
        assertEquals("Buzz",f.FizzConvert(5));

    }
    @Test
    public void testFizzBuzzFiveteen(){
        assertEquals("FizzBuzz",f.FizzConvert(15));

    }
    @Test
    public void testFizzBuzzAnything(){
        assertEquals("2",f.FizzConvert(2));

    }


    }


