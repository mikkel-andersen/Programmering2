package snackssupply;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SnackBar<E>
{
    // TODO: Implement sortSnacks(E[] snackContainer)

    public <E extends Comparable<E>> E[] sortSnacks(E[] snackContainer) {
        //Array to ArrayList -> collections.sort -> ArrayList to Array
        ArrayList<E> sortering = new ArrayList<>(List.of(snackContainer));
        Collections.sort(sortering);
        return (E[]) sortering.toArray();
    }
}
