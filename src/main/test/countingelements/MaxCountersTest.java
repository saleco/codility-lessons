package countingelements;

import common.ITest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaxCountersTest implements ITest {

    private MaxCounters maxCounters;
    @Override
    @Before
    public void setup() {
        this.maxCounters = new MaxCounters();
    }

    @Test
    public void counters_WhenNEqualsFive_ThenShouldReturnResultArray(){
        Assert.assertArrayEquals(new int[]{3, 2, 2, 4, 2}, maxCounters.counters(5, new int[]{3, 4, 4, 6, 1, 4, 4}));
    }

    @Test
    public void counters_WhenNEqualsFour_ThenShouldReturnResultArray(){
        Assert.assertArrayEquals(new int[]{3, 2, 2, 4}, maxCounters.counters(4, new int[]{3, 4, 4, 5, 1, 4, 4}));
    }
}
