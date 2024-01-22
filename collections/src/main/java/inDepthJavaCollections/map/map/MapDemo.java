package inDepthJavaCollections.map.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

    private static void hashMapDemo() {
        System.out.println("\n\nInside hashMapDemo ...");
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("John", 25);
        map1.put("Raj", 29);
        map1.put("Anita", null);

        System.out.println("newly inserted value " + map1);

        map1.put("Anita", 23);
        System.out.println("edited value " +  map1);

        System.out.println("Contains John? " + map1.containsKey("John"));
        System.out.println("John's age: " + map1.get("John"));

        System.out.println("-------- Iterating using keySet ...");
        Set<String> names = map1.keySet();
        for (String name : names) {
            System.out.println("Name: " + name + ", Age: " + map1.get(name));
        }

        System.out.println("---------- Iterating using entrySet ...");
        Set<Map.Entry<String, Integer>> mappings = map1.entrySet();
        for (Map.Entry<String, Integer> mapping : mappings) {
            System.out.println("Name: " + mapping.getKey() + ", Age: " + mapping.getValue());
        }

        names.remove("Anita"); // when anitha is removed it will also affect the original set which is map1
        System.out.println("Anitha got deletede and remaining is displayed ==> " + map1);

        System.out.println(" ------------- complex map ---------------");

    // creating a complex map --> Map<Key, Map<Key,Value>>
        Map<String, Map<String, Object>> userProfile = new HashMap<>();

        Map<String, Object> profile = new HashMap<>();
        profile.put("age", 25);
        profile.put("dept", "CS");
        profile.put("city", "New York");

        userProfile.put("John", profile);

        profile = new HashMap<>();
        profile.put("age", 29);
        profile.put("dept", "CS");
        profile.put("city", "New York");

        userProfile.put("Raj", profile);

        System.out.println("userProfile: " + userProfile); //prints nested map

        Map<String, Object> profile1 = userProfile.get("John");
        int age = (Integer) profile1.get("age"); // profile1.get("age") --> will return an object, so we are down-casting it to integer
        System.out.println("Age: " + age);
        // Exercise: Try using second constructor, putAll, clear, values, and other methods
    }

    public static void main(String[] args) {
        hashMapDemo();
    }
}
