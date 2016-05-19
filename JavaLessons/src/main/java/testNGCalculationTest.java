import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by student on 4/14/2016.
 */
public class testNGCalculationTest {

    //test which takes parameters from method dataSumMethod()
    @Test(dataProvider = "dataSumMethod")
    public void getSumTest(int firstValue, int secondValue, int result) {
        Calculation c = new Calculation();
        Assert.assertEquals(c.getSum(firstValue, secondValue), result);
    }

    //declare method which data
    @DataProvider
    public Object[][] dataSumMethod() {
        return new Object[][] {
                { 5, 5, 10 },
                { 2, 5, 7 },
                { 3, 1, 4 },
                { 4, 3, 7 }
        };
    }
}
