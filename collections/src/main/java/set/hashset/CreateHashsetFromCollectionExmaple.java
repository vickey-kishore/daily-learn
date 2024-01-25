package set.hashset;

import java.util.HashSet;
import java.util.Set;

public class CreateHashsetFromCollectionExmaple {

    public static void main(String[] args) {

        // first 5 even numbers
        Set<Integer> first5EvnNumbers = new HashSet<>();
        first5EvnNumbers.add(2);
        first5EvnNumbers.add(4);
        first5EvnNumbers.add(6);
        first5EvnNumbers.add(8);
        first5EvnNumbers.add(10);

        Set<Integer> tenEvenNumbers = new HashSet<>(first5EvnNumbers);

        Set<Integer> next5EvnNum = new HashSet<>();
        next5EvnNum.add(12);
        next5EvnNum.add(14);
        next5EvnNum.add(16);
        next5EvnNum.add(18);
        next5EvnNum.add(20);

        tenEvenNumbers.addAll(next5EvnNum);

        System.out.println(tenEvenNumbers);
    }
}
