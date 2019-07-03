package arrays;

import common.ITest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CyclicRotationTest implements ITest {

    private CyclicRotation cyclicRotation;
    private int[] a;

    @Override
    @Before
    public void setup() {
        this.cyclicRotation = new CyclicRotation();
        this.a = new int[]{1,2,3};
    }

    @Test
    public void arrayRotation_WhenRotationsEqualsZero_ThenShouldKeepSamePositions(){
        Assert.assertArrayEquals(a, cyclicRotation.arrayRotation(a, 0));
    }

    @Test
    public void arrayRotation_WhenRotationsEqualsOne_ThenShouldShiftOnePosition(){
        Assert.assertArrayEquals(new int[] {3, 1, 2}, cyclicRotation.arrayRotation(a, 1));
    }


    @Test
    public void arrayRotation_WhenRotationsEqualsTen_ThenShouldRotate(){
        Assert.assertArrayEquals(new int[] {3, 1, 2}, cyclicRotation.arrayRotation(a, 10));
    }


}
