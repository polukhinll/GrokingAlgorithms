package Chapter4;

import java.util.ArrayList;
import java.util.List;

public class RecursionFindLengthOfList {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(lengthList(lst));
    }

    public static int lengthList(List<Integer> lst) {
        if (lst.isEmpty()) return 0; // базовый случай (когда список пуст - длину посчитать легко)
        else {
            lst.remove(0);
            return 1 + lengthList(lst); // рекурсивный случай
        }
    }
}
