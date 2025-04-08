import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap_exmaple {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(3, "Kiara");
        map.put(1, "Ruhi");
        map.put(2, "Abhira");
        map.put(1, "Updated Ruhi"); // Overwrites value for key 1

        System.out.println(map);
    }
}
