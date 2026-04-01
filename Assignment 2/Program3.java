import java.util.*;

public class Main {

    public static void main(String[] args) {

        // ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        System.out.println("ArrayList: " + list);

        list.set(1, "Orange");
        System.out.println("Updated ArrayList: " + list);

        list.remove("Mango");
        System.out.println("After Delete: " + list);


        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "John");
        map.put(2, "Alice");
        map.put(3, "Bob");

        System.out.println("\nHashMap: " + map);

        map.put(2, "David");
        System.out.println("Updated HashMap: " + map);

        map.remove(3);
        System.out.println("After Delete: " + map);


        TreeMap<Integer, String> tmap = new TreeMap<>();
        tmap.put(101, "Math");
        tmap.put(102, "Science");
        tmap.put(103, "English");

        System.out.println("\nTreeMap: " + tmap);

        tmap.put(102, "Physics");
        System.out.println("Updated TreeMap: " + tmap);

        tmap.remove(103);
        System.out.println("After Delete: " + tmap);
    }
}
