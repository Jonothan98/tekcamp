package facade;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ProcessingPaymentTest {

    @Test
    public void testProcessingPayment() {
        ProcessingPayment processingPayment = new ProcessingPayment();

        int actual = processingPayment.processingPayment(10);

        Assert.assertEquals(actual, 10);
    }
}