import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // 1. Create a HashMap (Key: String, Value: Integer)
        Map<String, Integer> poolCounts = new HashMap<>();

        // 2. Add or update entries with put()
        poolCounts.put("active", 3);
        poolCounts.put("idle", 7);
        poolCounts.put("active", 4); // Replaces previous value for "active"

        // 3. Read values safely with get() or getOrDefault()
        System.out.println("Active: " + poolCounts.get("active")); // 4
        System.out.println("Errors: " + poolCounts.getOrDefault("errors", 0)); // 0

        // 4. Check existence and remove entries
        if (poolCounts.containsKey("idle")) {
            System.out.println("Idle count exists");
        }
        poolCounts.remove("idle");

        // 5. Loop through entries
        for (Map.Entry<String, Integer> entry : poolCounts.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
