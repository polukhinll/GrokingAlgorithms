package Chapter2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSort {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>(Arrays.asList(5, 6, 1, 7, 4 ,2, 9));
        System.out.println(selectionSort(lst));
    }

    public static int findSmallestIndex(List<Integer> lst) {
        int smallestIndex = 0;
        int smallest = lst.getFirst();
        for (int i = 1; i < lst.size(); i++) {
            if (lst.get(i) < smallest) {
                smallest = lst.get(i);
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static List<Integer> selectionSort(List<Integer> lst) {
        List<Integer> newList = new ArrayList<>();
        List<Integer> copiedLst = new ArrayList<>(lst);
        for (int i = 0; i < lst.size(); i++) {
            int smallest = findSmallestIndex(copiedLst);
            newList.add(copiedLst.get(smallest));
            copiedLst.remove(smallest);
        }
        return newList;
    }
}
