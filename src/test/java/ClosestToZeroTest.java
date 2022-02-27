import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClosestToZeroTest {
    @Test
    void findClosestToZeroInList() {
        var closestToZero = new ClosestToZero();
        assertEquals(-2, closestToZero.find(new ArrayList<>(List.of(11, 3, -3, -6, -2))));
    }

    @Test
    void findClosestToZeroInListNoPositive() {
        var closestToZero = new ClosestToZero();
        assertEquals(-2, closestToZero.find(new ArrayList<>(List.of(-3, -6, -2))));
    }

    @Test
    void findClosestToZeroInListNoNegative() {
        var closestToZero = new ClosestToZero();
        assertEquals(2, closestToZero.find(new ArrayList<>(List.of(11, 3, 2))));
    }

    @Test
    void findClosestToZeroInEmptyList() {
        var closestToZero = new ClosestToZero();
        assertEquals(0, closestToZero.find(new ArrayList<>()));
    }
}