package test;

import code.FizzBuzz;
import org.junit.*;

import static org.junit.Assert.assertEquals;

/**
 * Created by Bipin on 4/20/2016.
 */
public class FizzBuzzTest {

    private FizzBuzz fb;

    public FizzBuzzTest() {}

    @Before
    public void setUp() {
        fb = new FizzBuzz();
    }

    @Test
    public void oneReturnsOne(){
        assertEquals("1", fb.evaluate(1));
    }

    @Test
    public void twoReturnsTwo(){
        assertEquals("2", fb.evaluate(2));
    }

    @Test
    public void threeReturnsFizz(){
        assertEquals("Fizz", fb.evaluate(3));
    }

    @Test
    public void fiveReturnsBuzz(){
        assertEquals("Buzz", fb.evaluate(5));
    }

    @Test
    public void fifteenReturnsFizzBuzz(){
        assertEquals("FizzBuzz", fb.evaluate(15));
    }
}
