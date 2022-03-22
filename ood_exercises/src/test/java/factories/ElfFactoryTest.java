package factories;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ElfFactoryTest {

    @Test
    public void testCreateElfInputNaughtyOrNiceReturnsCoalElfOrToyElf() {

        boolean actualToyElf = ElfFactory.createElf("Nice") instanceof ToyElf;
        boolean expectedToyElf = true;

        boolean actualCoalElf = ElfFactory.createElf("Naughty") instanceof CoalElf;
        boolean expectedCoalElf = true;

        Assert.assertEquals(actualToyElf, expectedToyElf);
        Assert.assertEquals(actualCoalElf, expectedCoalElf);
    }
}