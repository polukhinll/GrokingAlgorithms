package Chapter4;

public class MySum {
    public static void main(String[] args) {
        int[] lst = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(mySum(lst));
    }

    public static int mySum(int[] lst) {
        int sum = 0;
        for (int item: lst) {
            sum += item;
        }
        return sum;
    }
}
