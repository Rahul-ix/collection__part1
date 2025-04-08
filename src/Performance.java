import java.util.HashMap;
import java.util.TreeMap;

public class Performance {
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.nanoTime();
        HashMap<Integer,String > hashMap = new HashMap<>();
        hashMap.put(2,"Abhira");
        hashMap.put(3,"Raj");
        hashMap.put(1,"Ruhi");
        Thread.sleep(100);
        long endTime = System.nanoTime();
        System.out.println("Time taken: " + (endTime - startTime));

        //treemap

        long startTime1 = System.nanoTime();
        TreeMap<Integer,String > treemap = new TreeMap<>();
        hashMap.put(2,"Abhira");
        hashMap.put(3,"Raj");
        hashMap.put(1,"Ruhi");
        long endTime1 = System.nanoTime();
        System.out.println("Time taken: " + (endTime1 - startTime1));
    }
}
