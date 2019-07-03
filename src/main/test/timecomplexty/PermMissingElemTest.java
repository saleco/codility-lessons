package timecomplexty;

import common.ITest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class PermMissingElemTest implements ITest {

    private PermMissingElem permMissingElem;

    @Override
    @Before
    public void setup() {
        this.permMissingElem = new PermMissingElem();
    }

    @Test
    public void missingValue_WhenArrayIsEmpty_ThenShouldReturnZero(){
        Assert.assertEquals(1, permMissingElem.missingValue(new int[]{}));
    }

    @Test
    public void missingValue_WhenArrayHasOneAsSingleElement_ThenShouldReturnTwo(){
        Assert.assertEquals(2, permMissingElem.missingValue(new int[]{1}));
    }

    @Test
    public void missingValue_WhenArrayHasTwoAsSingleElement_ThenShouldReturnOne(){
        Assert.assertEquals(1, permMissingElem.missingValue(new int[]{2}));
    }

    @Test
    public void missingValue_WhenArrayIsNotEmptyAndMissingElementAtMiddle_ThenShouldReturnMissingValue(){
        Assert.assertEquals(4, permMissingElem.missingValue(new int[]{2, 3, 1, 5}));
    }

    @Test
    public void missingValue_WhenArrayIsNotEmptyAndMissingElementAtStart_ThenShouldReturnMissingValue(){
        Assert.assertEquals(1, permMissingElem.missingValue(new int[]{4, 3, 2, 5}));
    }

    @Test
    public void missingValue_WhenArrayIsNotEmptyAndMissingElementAtEnd_ThenShouldReturnMissingValue(){
        Assert.assertEquals(5, permMissingElem.missingValue(new int[]{4, 3, 2, 1}));
    }

}
