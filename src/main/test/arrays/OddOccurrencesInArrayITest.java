package arrays;

import arrays.OddOccurrencesInArray;
import common.ITest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OddOccurrencesInArrayITest implements ITest {

    private OddOccurrencesInArray oddOccurrencesInArray;

    @Before
    public void setup() {
        this.oddOccurrencesInArray = new OddOccurrencesInArray();
    }

    @Test
    public void unpairedOccurrence_whenArrayHasOneElement_ThenShouldReturnThisElement(){
        Assert.assertEquals(9, oddOccurrencesInArray.unpairedOccurrence(new int[]{9}));
    }

    @Test
    public void unpairedOccurrence_whenArrayIsUnpaired_ThenShouldReturnUnpairedNumber(){
        Assert.assertEquals(7, oddOccurrencesInArray.unpairedOccurrence(new int[]{9,3,9,3,9,7,9}));
    }

}
