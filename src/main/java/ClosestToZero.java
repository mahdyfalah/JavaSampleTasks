import java.util.ArrayList;
import java.util.Collections;

public class ClosestToZero {
    public static int find(ArrayList<Integer> list) {

        if (list.isEmpty()) {
            return 0;
        }

        if (!list.contains(0)) {
            list.add(0);
        }

        Collections.sort(list);
        int res = 0;

        if (list.indexOf(0) > 1 && list.indexOf(0) < list.size() - 1) {
            int negativeNeighbour = list.get(list.indexOf(0) - 1);
            int positiveNeighbour = list.get(list.indexOf(0) + 1);

            res = Math.abs(negativeNeighbour) < positiveNeighbour ? negativeNeighbour : positiveNeighbour;
        } else if (list.indexOf(0) == 0) {
            res = list.get(list.indexOf(0) + 1);
        } else {
            res = list.get(list.indexOf(0) - 1);
        }

        return res;
    }
}
