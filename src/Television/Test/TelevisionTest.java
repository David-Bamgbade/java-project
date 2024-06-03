package Television.Test;

import Television.Television;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelevisionTest {

    @Test
    void turnOnTvTest() {
        Television television1 = new Television();

        assertTrue(television1.onTv());
    }

    @Test
    void turnOffTvTest() {
        Television television2 = new Television();
        assertFalse(television2.offTv());
    }

    @Test
    void increaseVolumeTest() {
        Television television3 = new Television();
        television3.volumeIncrease(10);
        assertEquals(15, 15);
    }

    @Test
    void decreaseVolumeTest() {
        Television television4 = new Television();
        television4.voulumeDecrease(5);
        assertEquals(5, 5);
    }



}