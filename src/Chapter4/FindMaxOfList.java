package Chapter4;

import java.util.ArrayList;
import java.util.List;

public class FindMaxOfList {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>(List.of(1, 2, 35, 4, 5, 6, 7, 8));
        System.out.println(maxOfList(lst));
    }

    public static int maxOfList(List<Integer> lst) {
        if (lst.size() == 1) return lst.getFirst();
        else {
            if (lst.getFirst() > lst.getLast()) lst.remove(lst.getLast());
            else lst.remove(lst.getFirst());
            return maxOfList(lst);
        }
    }
}
