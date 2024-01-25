package list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        //add elements
//        list.add("element1");
//        list.add("element1");
//        list.add("element2");
//        list.add("element3");

        // list allows null
       // list.add(null);

       // System.out.println(list);

        // insertion order
        list.add("element1");
        list.add("element2");
        list.add("element3");
        list.add("element4");

        System.out.println(list);


    }
}
