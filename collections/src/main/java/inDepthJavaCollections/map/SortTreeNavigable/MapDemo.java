package inDepthJavaCollections.map.SortTreeNavigable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// sorted map, tree map, navigable map

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

    /*
     * Demo:
     * 	1. See output with and without commenting get() calls
     *    2. See output when accessOrder=false with get() calls. get calls do not have any influence
     *    3. Finally, change object type from LRUCache to LinkedHashMap and see output.
     *       All 5 mappings will be printed as removeEldestEntry would return false by default
     */
    private static void lruCacheTest() {
        System.out.println("\n\nInside lruCacheTest ...");
        Map<String, String> lruCache = new LRUCache<>(16, 0.75f, true);
        lruCache.put("a", "A");
        lruCache.put("b", "B");
        lruCache.put("c", "C");
        System.out.println(lruCache);

        lruCache.get("a"); // multiple gets to "a" will not make a difference
        lruCache.get("a");
        lruCache.get("a");
        System.out.println(lruCache);
        lruCache.get("b");
        System.out.println(lruCache);

        lruCache.put("d", "D");
        System.out.println(lruCache);
        lruCache.put("e", "E");
        System.out.println(lruCache);
    }

    private static void treeMapDemo() {
        System.out.println("\n\nInside treeMapDemo ...");
        TreeMap<String, Integer> map1 = new TreeMap<>();
        map1.put("John", 25);
        map1.put("Raj", 29);
        map1.put("Anita", 23);

        System.out.println("initial entry values  ==> " + map1);

        System.out.println("------------ Iterating using entrySet ...");
        Set<Map.Entry<String, Integer>> mappings = map1.entrySet();
        for (Map.Entry<String, Integer> mapping : mappings) {
            System.out.println("Name: " + mapping.getKey() + ", Age: " + mapping.getValue());
            if (mapping.getKey().equals("John"))
                mapping.setValue(26);
        }
        System.out.println("edited values ==> " + map1);
       // map1.floorEntry("Raj").setValue(22); // cannot invoke setvalue() on floorEntry kind of methods
    }

    public static void main(String[] args) {
        // lruCacheTest();
        treeMapDemo();
    }
}

class LRUCache<K, V> extends LinkedHashMap<K, V> {
    //private static final long serialVersionUID = 6464155743798737431L;
    private static final int MAX_ENTRIES = 3;

    public LRUCache(int initialCapacity,
                    float loadFactor,
                    boolean accessOrder) {
        super(initialCapacity, loadFactor, accessOrder);
    }

    // Invoked by put and putAll after inserting a new entry into the map
    public boolean removeEldestEntry(Map.Entry eldest) {
        return size() > MAX_ENTRIES;
        // return false; // same as normal linked hash map
    }
}
