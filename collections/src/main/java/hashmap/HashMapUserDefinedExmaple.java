package hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapUserDefinedExmaple {
    public static void main(String[] args) {


        //create hashmap
        Map<Integer, Student> studentMap = new HashMap<>();

        studentMap.put(1, new Student("ramesh", "fadatarre"));
        studentMap.put(2, new Student("tony", "stark"));
        studentMap.put(3, new Student("umaesh", "fadatarre"));

        System.out.println(studentMap.values());
    }
}
