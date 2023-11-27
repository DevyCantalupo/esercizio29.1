import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
public class esercizio29di1 {
    public static void main(String[] args) {
        HashMap<String, String> hashMap1 = new HashMap<>();
        hashMap1.put("Maracay", "MY");
        hashMap1.put("Caracas", "CA");
        hashMap1.put("Valencia", "VA");
        System.out.println(hashMap1);

        HashMap<String, String> hashMap2 = new HashMap<>(Map.of("Maracay", "MY", "Caracas", "CA", "Valencia", "VA"));
        System.out.println(hashMap2);

        HashMap<String, String> hashMap3 = new HashMap<>(Map.ofEntries(
                new AbstractMap.SimpleEntry<>("Maracay", "MY"),
                new AbstractMap.SimpleEntry<>("Caracas", "CA"),
                new AbstractMap.SimpleEntry<>("Valencia", "VA")
        ));
        System.out.println(hashMap3);
    }
}