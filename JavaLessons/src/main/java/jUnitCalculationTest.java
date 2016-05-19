import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.testng.Assert;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by student on 4/14/2016.
 */

//class with jUnit tests
@RunWith(value = Parameterized.class)
public class jUnitCalculationTest {

    //variables for
    int firstNumber;
    int secondNumber;
    int result;

    //public constructor for initialization variables
    public jUnitCalculationTest(int fV, int sV, int r) {
        firstNumber = fV;
        secondNumber = sV;
        result = r;
    }

    //method contains data for testing
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] {
                { 5, 5, 10 },
                { 2, 5, 7 },
                { 3, 1, 4 },
                { 4, 3, 8 }
        };
        return Arrays.asList(data);
    }

    //test which takes parameters
    @Test
    public void getSumTest() {
        Calculation c = new Calculation();
        Assert.assertEquals(c.getSum(firstNumber, secondNumber), result);
    }

    @Test
    public void getDivisionTest() {
        Calculation c = new Calculation();
        Assert.assertEquals(c.getDivision(2, 2), 1);
    }
}
