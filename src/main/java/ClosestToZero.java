import java.util.ArrayList;
import java.util.Collections;

public class ClosestToZero {
    //this function find closest value to zero in a list, or the positive value in case of tie
    public static int find(ArrayList<Integer> list) {

        //if conditions to prevent errors
        if (list.isEmpty()) {
            return 0;
        }
        if (!list.contains(0)) {
            list.add(0);
        }

        Collections.sort(list);
        int res = 0;

        // if list contains positive and negative values closest values are
        // one before and one after zero in sorted list
        if (list.indexOf(0) > 1 && list.indexOf(0) < list.size() - 1) {
            int negativeNeighbour = list.get(list.indexOf(0) - 1);
            int positiveNeighbour = list.get(list.indexOf(0) + 1);

            res = Math.abs(negativeNeighbour) < positiveNeighbour ? negativeNeighbour : positiveNeighbour;
        }
        // if no negative value exists the closest value is one after zero
        else if (list.indexOf(0) == 0) {
            res = list.get(list.indexOf(0) + 1);
        }
        // if no positive value exists the closest value is one before zero
        else {
            res = list.get(list.indexOf(0) - 1);
        }

        return res;
    }
}
