package timecomplexty;

import common.ITest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TapeEquilibriumTest implements ITest {

    TapeEquilibrium tapeEquilibrium;

    @Override
    @Before
    public void setup() {
        this.tapeEquilibrium = new TapeEquilibrium();
    }

    @Test
    public void minDifferenceInArray_WhenNEqualsFive_ThenShouldReturnMinDifferenceInArray(){
        Assert.assertEquals(1, tapeEquilibrium.minDifferenceInArrayPerformatic(new int[]{3, 1, 2, 4, 3}));
    }

    @Test
    public void minDifferenceInArray_WhenNEqualsTwo_ThenSouldReturnMinDifferenceInArray(){
        Assert.assertEquals(2, tapeEquilibrium.minDifferenceInArrayPerformatic(new int[]{3, 1}));
    }
}
