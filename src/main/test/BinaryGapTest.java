import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinaryGapTest {

    private BinaryGap binaryGap;

    @Before
    public void setup(){
        binaryGap = new BinaryGap();
    }

    @Test
    public void binaryGapMaxSize_whenIntegerIsEqualsZero_ThenSouldReturnZero(){
        Assert.assertEquals(0, binaryGap.binaryGapMaxSize(0));
    }

    @Test
    public void binaryGapMaxSize_whenIntegerIsLessThanZero_ThenSouldReturnZero(){
        Assert.assertEquals(0, binaryGap.binaryGapMaxSize(-12));
    }

    @Test
    public void binaryGapMaxSize_whenIntegerHasTwoBinaryGaps_ThenSouldReturnBiggestOne(){
        Assert.assertEquals(4, binaryGap.binaryGapMaxSize(529));
    }

    @Test
    public void binaryGapMaxSize_whenIntegerHasOneBinaryGap_ThenSouldReturnBinaryGapSize(){
        Assert.assertEquals(2, binaryGap.binaryGapMaxSize(9));
    }

    @Test
    public void binaryGapMaxSize_whenIntegerHasNoBinaryGap_ThenSouldReturnZero(){
        Assert.assertEquals(0, binaryGap.binaryGapMaxSize(15));
    }

    @Test
    public void binaryGapMaxSize_whenIntegerHasOneGapAndOneEndlessGap_ThenSouldReturnGapSize(){
        Assert.assertEquals(1, binaryGap.binaryGapMaxSize(20));
    }

    @Test
    public void binaryGapMaxSize_whenIntegerHasNoBinaryGapDueEndlessGap_ThenSouldReturnZero(){
        Assert.assertEquals(0, binaryGap.binaryGapMaxSize(32));
    }
}
