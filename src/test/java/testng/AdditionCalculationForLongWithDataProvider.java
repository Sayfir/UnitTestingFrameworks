package testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AdditionCalculationForLongWithDataProvider extends BaseTest {

    @Test(dataProvider = "valuesForTest", groups ={"smoke"})
    public void testGetCorrectAdditionOperationResultOnLongType(long a, long b, long expectedValue) {
        System.out.println("Thread id is: " + Thread.currentThread().getId() + " ");
        Assert.assertEquals(calculator.sum(a, b), expectedValue, "Invalid result of addition operation.");
    }

    @DataProvider(name = "valuesForTest")
    public Object[][] getDataForAdditionOperation() {
        return new Object[][]{
                {12, 23, 35},
                {-2, 5, 3},
                {0, 0, 0},
                {10, -9, 1}
        };
    }
}
