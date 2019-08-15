package junit;


import com.epam.tat.module4.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class AdditionCalculationForLongWithDataProvider extends BaseTest {

    @Test
    public void testGetCorrectAdditionOperationResultOnLongType() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(80, (calculator.sum(23, 57)));
    }
}

