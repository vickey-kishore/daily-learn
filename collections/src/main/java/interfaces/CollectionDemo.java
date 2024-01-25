package interfaces;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {

        Collection<String> fruitCollection = new ArrayList<>();
        fruitCollection.add("banana");
        fruitCollection.add("apple");
        fruitCollection.add("orange");

        System.out.println(fruitCollection);

        fruitCollection.remove("banana");
        System.out.println(fruitCollection);

        System.out.println(fruitCollection.contains("apple"));

        System.out.println(fruitCollection.isEmpty());

        fruitCollection.forEach(fruit -> System.out.println(fruit));

        fruitCollection.clear();

        System.out.println(fruitCollection.isEmpty());
    }
}