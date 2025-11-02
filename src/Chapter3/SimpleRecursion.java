package Chapter3;

public class SimpleRecursion {
    public static void main(String[] args) {
        simpleRecursion(10);
    }

    public static void simpleRecursion(int i) {
        System.out.println(i);
        if (i >= 1) simpleRecursion(i - 1); // рекурсивный случай
        else return; // базовый случай
    }
}
