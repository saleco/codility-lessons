package countingelements;

import common.ITest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MissingIntegerTest implements ITest {

    private MissingInteger missingInteger;

    @Override
    @Before
    public void setup() {
        this.missingInteger = new MissingInteger();
    }

    @Test
    public void smallestMissingInteger_WhenHasDuplicatedValueInArray_ThenSouldReturnMissingValue(){
        Assert.assertEquals(5, missingInteger.smallestMissingInteger(new int[]{1, 3, 6, 4, 1, 2}));
    }

    @Test
    public void smallestMissingInteger_WhenMissingValueIsInTheEnd_ThenSouldReturnMissingValue(){
        Assert.assertEquals(4, missingInteger.smallestMissingInteger(new int[]{1, 2, 3}));
    }

    @Test
    public void smallestMissingInteger_WhenHasOnlyNegativeValuesInArray_ThenSouldReturnSmallestPositiveNumber(){
        Assert.assertEquals(1, missingInteger.smallestMissingInteger(new int[]{-1, -3}));
    }

    @Test
    public void smallestMissingInteger_WhenMissingValueIsInTheStart_ThenSouldReturnMissingValue(){
        Assert.assertEquals(1, missingInteger.smallestMissingInteger(new int[]{3, 2}));
    }

    @Test
    public void smallestMissingInteger_WhenArraysHasSingleElement_ThenSouldReturnMissingValue(){
        Assert.assertEquals(1, missingInteger.smallestMissingInteger(new int[]{2}));
    }

    @Test
    public void smallestMissingInteger_WhenArraysHasSingleElement_ThenSouldReturnMissingValue2(){
        Assert.assertEquals(2, missingInteger.smallestMissingInteger(new int[]{1}));
    }

    @Test
    public void smallestMissingInteger_WhenMissingElementIsInTheMiddle_ThenSouldReturnMissingValue(){
        Assert.assertEquals(2, missingInteger.smallestMissingInteger(new int[]{1, 3}));
    }

    @Test
    public void smallestMissingInteger_WhenArrayHasSomeNegativeNumbers_ThenSouldReturnMissingValue(){
        Assert.assertEquals(2, missingInteger.smallestMissingInteger(new int[]{-1, -3, 1}));
    }

    @Test
    public void smallestMissingInteger_WhenArrayHasSomeNegativeNumbers_ThenSouldReturnMissingValue2(){
        Assert.assertEquals(1, missingInteger.smallestMissingInteger(new int[]{-1, -3, 2}));
    }


}
