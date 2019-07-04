package countingelements;

import common.ITest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FrogRiverOneTest implements ITest {

    private FrogRiverOne frogRiverOne;

    @Override
    @Before
    public void setup() {
        this.frogRiverOne = new FrogRiverOne();
    }

    @Test
    public void earliestTimeCross_WhenXEqualsFive_ThenShouldReturnSix(){
        Assert.assertEquals(6, frogRiverOne.earliestTimeCross(5, new int[]{1, 3, 1, 4, 2, 3, 5, 4}));
    }

    @Test
    public void earliestTimeCross_WhenXEqualsSeven_ThenShouldReturnTen(){
        Assert.assertEquals(8, frogRiverOne.earliestTimeCross(7, new int[]{2, 7, 1, 5, 5, 5, 4, 3, 6}));
    }

    @Test
    public void earliestTimeCross_WhenXEquals9_ThenShouldReturnMinusOne(){
        Assert.assertEquals(-1, frogRiverOne.earliestTimeCross(9, new int[]{8, 2, 7, 1, 5, 5, 5, 4, 3, 6}));
    }

    @Test
    public void earliestTimeCross_WhenXEqualsSevenWithoutAllSequence_ThenShouldReturnMinusOne(){
        Assert.assertEquals(-1, frogRiverOne.earliestTimeCross(9, new int[]{8, 2, 7, 1, 5, 5, 5, 4, 3}));
    }

    @Test
    public void earliestTimeCross_WhenLargePermutation_ThenShouldReturn90999(){
        int[] a = new int[90999];

        for (int i = 0; i < a.length; i++) {
            a[i] = i+1;
        }

        Assert.assertEquals(90998, frogRiverOne.earliestTimeCross(90999, a));
    }
}
