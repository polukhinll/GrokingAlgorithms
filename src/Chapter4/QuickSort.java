package Chapter4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class QuickSort {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>(List.of(5, 3, 8, 4, 6, 9));
        System.out.println(quickSort(lst));
    }

    public static List<Integer> quickSort(List<Integer> lst) {
        if (lst.size() < 2) return lst; // базовый случай
        else {
            int support = lst.getFirst();
            List<Integer> less = new ArrayList<>();
            List<Integer> greater = new ArrayList<>();
            for (int item: lst.subList(1, lst.size())) {
                if (item > support) greater.add(item);
                else less.add(item);
            }
            List<Integer> result = new ArrayList<>(quickSort(less));
            result.add(support);
            result.addAll(quickSort(greater));

            return result; // рекурсивный случай
        }
    }
}
// Время выполнения - O(n * log n)