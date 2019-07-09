package prefixsums;

import common.ITest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PassingCarsTest implements ITest {

    private PassingCars passingCars;

    @Override
    @Before
    public void setup() {
        this.passingCars = new PassingCars();
    }

    @Test
    public void countPassingCars_WhenArrayContainsZeroAndOnes_ThenShouldCountPassingCars(){
        Assert.assertEquals(5, passingCars.countPassingCars(new int[]{0, 1, 0, 1, 1}));
    }

    @Test
    public void countPassingCars_WhenArrayContainsOnlyOnes_ThenShouldCountPassingCars(){
        Assert.assertEquals(0, passingCars.countPassingCars(new int[]{1, 1, 1, 1, 1}));
    }

    @Test
    public void countPassingCars_WhenArrayContainsOnlyZeros_ThenShouldCountPassingCars(){
        Assert.assertEquals(0, passingCars.countPassingCars(new int[]{0, 0, 0, 0, 0}));
    }

    @Test
    public void countPassingCars_WhenArrayContainsOneZeroInLeftAndManyOnes_ThenShouldCountPassingCars(){
        Assert.assertEquals(4, passingCars.countPassingCars(new int[]{0, 1, 1, 1, 1}));
    }

    @Test
    public void countPassingCars_WhenArrayContainsOneZeroInMiddleAndManyOnes_ThenShouldCountPassingCars(){
        Assert.assertEquals(2, passingCars.countPassingCars(new int[]{1, 1, 0, 1, 1}));
    }

    @Test
    public void countPassingCars_WhenArrayContainsOneZeroInRightAndManyOnes_ThenShouldCountPassingCars(){
        Assert.assertEquals(0, passingCars.countPassingCars(new int[]{1, 1, 1, 1, 0}));
    }

    @Test
    public void countPassingCars_WhenArrayContainsOneZeroBetweenOnes_ThenShouldCountPassingCars(){
        Assert.assertEquals(3, passingCars.countPassingCars(new int[]{1, 0, 1, 0, 1, 0}));
    }

}
