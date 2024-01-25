package inDepthJavaCollections.map.immutableKey;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    private static void immutableKeysDemo() {
        System.out.println("\n\nInside immutableKeysDemo ...");
        List<Integer> list = new ArrayList<>(); //[1] =vickey /1 = vickey, [1,2] =
        list.add(1);

        Map<List<Integer>, Integer> map = new HashMap<>();
        map.put(list, 1);

        list.add(2);
        System.out.println(map.get(list)); //return null, because hashcode has been changed so will throw null

        Student s = new Student(1, null);
        Map<Student, Integer> map2 = new HashMap<>();
        map2.put(s, 11);

        s.setName("John");
        System.out.println(map2.get(s)); //did not override the hashcode or equals, so it will return the value
    }

    public static void main(String[] args) {
        immutableKeysDemo();
    }
}

class Student {
    private int id;
    private String name;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Student(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }
}


/**
 *  list.add(1) ===> [1]
 *
 *  map<list, int> ==> map.put("list", vickey)
 *                      map.put(key, value)
 *
 *  list.add(2) ==> [1,2]
 *
 *
 *
 *
 *
 */