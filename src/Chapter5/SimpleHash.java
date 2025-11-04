package Chapter5;

import java.util.HashMap;

public class SimpleHash {
    public static void main(String[] args) {
        HashMap<String, Integer> numbers = new HashMap<>();
        numbers.put("Sanya", 9510997);
        numbers.put("Me", 9625884);
        System.out.println(numbers.get("Me"));
    }
}
