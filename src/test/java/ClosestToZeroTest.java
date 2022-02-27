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
}