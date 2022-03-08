import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClosestToZeroTest {
    ClosestToZero closestToZero = new ClosestToZero();

    @Test
    void findClosestToZeroInList() {
        assertEquals(-2, closestToZero.find(new ArrayList<>(List.of(11, 3, -3, -6, -2))));
    }

    @Test
    void findClosestToZeroInListNoPositive() {
        assertEquals(-2, closestToZero.find(new ArrayList<>(List.of(-3, -6, -2))));
    }

    @Test
    void findClosestToZeroInListNoNegative() {
        assertEquals(2, closestToZero.find(new ArrayList<>(List.of(11, 3, 2))));
    }

    @Test
    void findClosestToZeroInEmptyList() {
        assertEquals(0, closestToZero.find(new ArrayList<>()));
    }

    @Test
    void findClosestToZeroTie() {
        assertEquals(3, closestToZero.find(new ArrayList<>(List.of(11, 3, -3, -6))));
    }
}