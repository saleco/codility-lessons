package countingelements;

import common.ITest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PermCheckTest implements ITest {

    private PermCheck permCheck;

    @Override
    @Before
    public void setup() {
        this.permCheck = new PermCheck();
    }

    @Test
    public void isPermutation_WhenArrayHasOneAsSingleElement_ThenShouldReturnOne(){
        Assert.assertEquals(1, permCheck.isPermutation(new int[]{1}));
    }

    @Test
    public void isPermutation_WhenArrayHasTwoAsSingleElement_ThenShouldReturnZero(){
        Assert.assertEquals(0, permCheck.isPermutation(new int[]{2}));
    }

    @Test
    public void isPermutation_WhenArrayHasTwoElementsWithouteroPermutation_ThenShouldReturnOne(){
        Assert.assertEquals(0, permCheck.isPermutation(new int[]{2, 3}));
    }

    @Test
    public void isPermutation_WhenArrayHasTwoElementsWithPermutation_ThenShouldReturnOne(){
        Assert.assertEquals(1, permCheck.isPermutation(new int[]{2, 1}));
    }

    @Test
    public void isPermutation_WhenArrayHasFourElementsWithPermutation_ThenShouldReturnOne(){
        Assert.assertEquals(1, permCheck.isPermutation(new int[]{4, 1, 3, 2}));
    }

    @Test
    public void isPermutation_WhenArrayHasTreeElementsWithoutPermutation_ThenShouldReturnZero(){
        Assert.assertEquals(0, permCheck.isPermutation(new int[]{4, 1,3}));
    }

    @Test
    public void isPermutation_WhenArrayHasManyElementsWithPermutation_ThenShouldReturnOne(){
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i+1;
        }
        Assert.assertEquals(1, permCheck.isPermutation(array));
    }

    @Test
    public void isPermutation_WhenArrayHasManyElementsWithoutPermutation_ThenShouldReturnOne(){
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            if (i == 99999) continue;
            array[i] = i+1;
        }

        Assert.assertEquals(0, permCheck.isPermutation(array));
    }

}
