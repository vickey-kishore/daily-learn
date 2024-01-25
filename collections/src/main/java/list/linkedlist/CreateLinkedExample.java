package list.linkedlist;

import java.util.LinkedList;

public class CreateLinkedExample {

    public static void main(String[] args) {

        LinkedList<String> fruits =  new LinkedList<>();

        fruits.add("banana");
        fruits.add("apple");
        fruits.add("mango");

        System.out.println("inital " + fruits);

        fruits.add(2, "watermelon");

        System.out.println("after watermelon " + fruits);

        // add element to first
        fruits.addFirst("strawberry");
        System.out.println("after strawberry " + fruits);

        // add element to last
        fruits.addLast("orange");
        System.out.println("after orange " + fruits);
    }
}
