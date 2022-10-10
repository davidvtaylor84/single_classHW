import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle WaterBottle;

    @Before
    public void before(){
        WaterBottle = new WaterBottle(100);
    }

    @Test
    public void canGetVolume(){
        assertEquals(100, WaterBottle.getVolume());
    }

    @Test
    public void canSubtractVolumeBy10(){
        WaterBottle.subtractVolumeBy10();
        assertEquals(90, WaterBottle.getVolume());
    }

    @Test
    public void canSubtractDownTo0(){
        WaterBottle.subtractVolumeBy10();
        WaterBottle.subtractVolumeBy10();
        WaterBottle.subtractVolumeBy10();
        WaterBottle.subtractVolumeBy10();
        WaterBottle.subtractVolumeBy10();
        WaterBottle.subtractVolumeBy10();
        WaterBottle.subtractVolumeBy10();
        WaterBottle.subtractVolumeBy10();
        WaterBottle.subtractVolumeBy10();
        WaterBottle.subtractVolumeBy10();
        assertEquals(0, WaterBottle.getVolume());
    }

    @Test
    public void canRefillBottle(){
        WaterBottle.subtractVolumeBy10();
        WaterBottle.subtractVolumeBy10();
        WaterBottle.subtractVolumeBy10();
        WaterBottle.subtractVolumeBy10();
        WaterBottle.subtractVolumeBy10();
        WaterBottle.subtractVolumeBy10();
        WaterBottle.subtractVolumeBy10();
        WaterBottle.subtractVolumeBy10();
        WaterBottle.subtractVolumeBy10();
        WaterBottle.subtractVolumeBy10();
        WaterBottle.refillBottle();
        assertEquals(100, WaterBottle.getVolume());
    }
}
