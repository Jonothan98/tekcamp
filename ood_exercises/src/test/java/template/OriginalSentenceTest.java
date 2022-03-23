package template;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class OriginalSentenceTest {

    @Test
    public void testGetLocation() {
        OriginalSentence originalSentence = new OriginalSentence();

        String actual = originalSentence.getLocation();

        Assert.assertEquals(actual, "school");
    }

    @Test
    public void testGetQuantity() {
        OriginalSentence originalSentence = new OriginalSentence();

        String actual = originalSentence.getQuantity();

        Assert.assertEquals(actual, "6");

    }
}