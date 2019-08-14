package junit;


import org.junit.Assert;
import org.junit.Test;

public class AdditionalCalculationForDouble extends BaseTest {
    @Test
    public void testGetCorrectAdditionOperationResultOnDoubleType() {
        Assert.assertEquals(924.55, (calculator.sum(345.56, 578.99)) );
    }
}
