import java.util.ArrayList;
import java.util.Collections;

/**
 * This class finds closest value to zero in a list, or the positive value in case of tie
 */
public class ClosestToZero {

    /**
     * gets the list of integers as parameter, if the list is empty 0 is returned
     * if the list does not contain 0, zero is added, then the list is sorted
     * and checks which positive or negative number is closest to zero
     *
     * @param list
     * @return int
     */
    public static int find(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        }
        if (!list.contains(0)) {
            list.add(0);
        }

        Collections.sort(list);
        int result = 0;

        if (list.indexOf(0) > 1 && list.indexOf(0) < list.size() - 1) {
            int negativeNeighbour = list.get(list.indexOf(0) - 1);
            int positiveNeighbour = list.get(list.indexOf(0) + 1);

            result = Math.abs(negativeNeighbour) < positiveNeighbour ? negativeNeighbour : positiveNeighbour;
        } else if (list.indexOf(0) == 0) {
            result = list.get(list.indexOf(0) + 1);
        } else {
            result = list.get(list.indexOf(0) - 1);
        }

        return result;
    }
}
