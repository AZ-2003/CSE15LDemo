import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import java.io.IOException;

public class Ceng15LTester
{
    Ceng15L test;
    @Before
    public void setup()
    {
        test = new Ceng15L();
    }
    @Test
    public void Test() 
    {
        boolean exception = false;
        try 
        {
            test.Divide(5,0);
        }
        catch(ArithmeticException e)
        {
            exception = true;
        }
        assertFalse("exception thrown", exception);
        assertEquals(0, test.Divide(5,0));
    }
    
    
}
