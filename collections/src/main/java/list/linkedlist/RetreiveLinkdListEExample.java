package list.linkedlist;

import java.util.LinkedList;

public class RetreiveLinkdListEExample {

    public static void main(String[] args) {
        LinkedList<String> fruits =  new LinkedList<>();

        fruits.add("banana");
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("pineapple");


        //getting first element
        String firstElement = fruits.getFirst();
        System.out.println("firstElement = " + firstElement);

        //getting last element
        String lastElement = fruits.getLast();
        System.out.println("lastElement = " + lastElement);

        //getting element at a given position
        String element = fruits.get(2);
        System.out.println("elemet at 2 = " + element);

        // get all elements
        for (String string: fruits ) {
            System.out.println(string);
        }
    }
}
