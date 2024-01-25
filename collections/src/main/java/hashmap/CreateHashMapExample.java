package hashmap;

import java.util.*;

public class CreateHashMapExample {

    public static void main(String[] args) {

        //example to map numbers to string
        Map<String, Integer> numberMapping = new HashMap<>();

        // add key-value pair to map
        numberMapping.put("one",1);
        numberMapping.put("two",2);
        numberMapping.put("three",3);
        numberMapping.put("four",4);

        numberMapping.put(null, 6);
        System.out.println(numberMapping);



        // check if empty or not
        System.out.println(numberMapping.isEmpty());

        // find size
        System.out.println(numberMapping.size());

        //key exists or not
        if(numberMapping.containsKey("four")){
            System.out.println("key exists");
        }
        else {
            System.out.println("key not");
        }

        //value exists or not
        if(numberMapping.containsValue(3)){
            System.out.println("value exists");
        }
        else {
            System.out.println("value not exists");
        }

        //get value by key
        Integer v1 = numberMapping.get("one");
        System.out.println(v1);

        // remove key-value pair
        numberMapping.remove("one");
        System.out.println(numberMapping);

        // retrieve only key
        Set<String> keys = numberMapping.keySet();
        System.out.println(keys);

        // retrieve only values
        Collection<Integer> values = numberMapping.values();
        System.out.println(values);


        //iterate hashmap

        // for each method
        for(Map.Entry<String, Integer> entry : numberMapping.entrySet()){
            System.out.println("key -> " + entry.getKey() + " value -> " + entry.getValue());
        }

        //iterator
        Set<Map.Entry<String, Integer>> entries = numberMapping.entrySet();

        Iterator<Map.Entry<String,Integer>> iterator = entries.iterator();
        while(iterator.hasNext()){
            Map.Entry<String,Integer> entry = iterator.next();
            System.out.println(" iterator key -> " + entry.getKey() + " value -> " + entry.getValue());
        }

        // java 8 foreach
        numberMapping.forEach((k,v) -> {
            System.out.println(" foreach key -> " + k + " value -> " + v);
        });

    }
}
