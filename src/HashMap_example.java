import java.security.KeyStore;
import java.util.*;

public class HashMap_example {
    public static void main(String[] args) {

       Map<Integer,String> data = new TreeMap<>();
        data.put(2,"Abhira");
        data.put(1,"Ruhi");
        data.put(3,"Kiara");
        data.put(3,"Kiara");
        System.out.println(data);

//        Set<Integer> keys = data.keySet();
//        for (Integer c:keys){
//            System.out.println(c);
//        }
//        Set<Map.Entry<Integer,String>> values = data.entrySet();
//        for (Map.Entry<Integer, String> c: values){
//            System.out.println(c.getKey() + " " + c.getValue());
//        }



        data.keySet().forEach(System.out::println);//key
        data.entrySet().forEach(System.out::println);//key value
        data.forEach((k, v) -> System.out.println("Key "+k+ " Value "+v)); //key value
    }
}
