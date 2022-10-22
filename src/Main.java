import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>(Map.of("1.0", 123, "1.2", 589, "1.3", 984));
        add("1.", 124, map);
        System.out.println(map.toString());
    }

    private static void add(String s, Integer i, Map<String, Integer> map) {
        if (map.containsKey(s) && map.get(s) == i) {
            throw new RuntimeException("Такое значение уже имеется в списке!");
        }
        if (map.containsKey(s) && map.get(s) != i) {
            map.put(s, i);
        }
        if (!map.containsKey(s)) {
            map.put(s, i);
        }
    }
}