import org.testng.annotations.Test;

public class DivisionCalculationByZero extends BaseTest {
    @Test(groups = {"expanded"}, expectedExceptions = NumberFormatException.class)
    public void testGetDevidedByNullException() {
        System.out.println("Thread id is: " + Thread.currentThread().getId() + " ");
        calculator.div(33, 0);}
}
