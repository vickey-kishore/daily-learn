package list.linkedlist;

import java.util.LinkedList;

public class RemovelmentsFromLinkdList {

    public static void main(String[] args) {
        LinkedList<String> fruits =  new LinkedList<>();

        fruits.add("banana");
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("pineapple");

        System.out.println("initial " + fruits);

        // remove 1st
        String element = fruits.removeFirst();
        System.out.println(" after removing 1st = " + fruits);
    }
}
