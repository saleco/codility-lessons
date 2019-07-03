package timecomplexty;

import common.ITest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FrogJmpTest implements ITest {

    private FrogJmp frogJmp;

    @Override
    @Before
    public void setup() {
        this.frogJmp = new FrogJmp();
    }

    @Test
    public void minJumpsToDestinationWhenPositionIs10DestinationIs85AndJumpDistanceIs30_ThenShouldReturnTreeJumps(){
        Assert.assertEquals(3, frogJmp.minJumpsToDestination(10, 85, 30));
    }

    @Test
    public void minJumpsToDestinationWhenPositionIs80DestinationIs85AndJumpDistanceIs30_ThenShouldReturnOneJump(){
        Assert.assertEquals(1, frogJmp.minJumpsToDestination(80, 85, 30));
    }

    @Test
    public void minJumpsToDestinationWhenPositionIsEqualToDestination_ThenShouldReturnNoJumps(){
        Assert.assertEquals(0, frogJmp.minJumpsToDestination(85, 85, 30));
    }

}
