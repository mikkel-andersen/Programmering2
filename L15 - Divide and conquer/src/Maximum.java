import java.util.ArrayList;

public class Maximum {

    private int maximum(ArrayList<Integer> list, int l, int h) {
        if (l == h) {
            return list.get(1);
        } else {
            int m = (l + h) / 2;
            int max1 = maximum(list, l, m);
            int max2 = maximum(list, m + 1, h);
            if (max1 > max2) {
                return max1;
            } else {
                return max2;
            }
        }
    }
}
