import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_exmaple {
    public static void main(String[] args) {
        long start1 =System.nanoTime();
        Set<String> data = new HashSet<>();
        data.add("Orange");
        data.add("Banana");
        data.add("Apple");
        System.out.println(data);
        long end1 = System.nanoTime();
        System.out.println("HashSet: " + (end1 - start1) + "ns");

        long start2 = System.nanoTime();
        Set<String> dataSet = new TreeSet<>();
        dataSet.add("Orange");
        dataSet.add("Banana");
        dataSet.add("Apple");
        System.out.println(dataSet);
        long end2 = System.nanoTime();
        System.out.println("TreeSet: " + (end2 - start2) + "ns");

        long start3 = System.nanoTime();
        Set<String> dataSet1 = new LinkedHashSet<>();
        dataSet1.add("Orange");
        dataSet1.add("Banana");
        dataSet1.add("Apple");
        System.out.println(dataSet1);
        long end3 = System.nanoTime();
        System.out.println("LinkedHashSet: " + (end3 - start3) + "ns");
    }
}
