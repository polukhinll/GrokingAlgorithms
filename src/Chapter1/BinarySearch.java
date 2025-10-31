package Chapter1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println("test");
        List<Integer> list = List.of(1, 3, 5, 7, 9);
        int needItem = 3;
        System.out.println(binarySearch(list, needItem));
    }

    public static Integer binarySearch(List<Integer> list, int needItem) {
        int low = 0;                    // указываем границы
        int high = list.size() - 1;     // нашего списка

        while (low <= high) { // пока не дойдем до последнего элемента
            int mid = (low + high) / 2; // находим центр
            int guess = list.get(mid); // берем центральное число по индексу
            if (guess == needItem) return mid; // попали в нужно число
            else if (guess > needItem) high = mid - 1; // взяли много
            else low = mid + 1; // взяли мало
        }
        return null; // если значение не найдено
    }
}
// скорость работы алгоритмы - O(log n)