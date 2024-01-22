package list.arraylist;



import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


// how to create an arraylist from another collection using thee
// ArrayList (collection c) constructor.

// how to add all the elements from an existing collection to the new
// arrayList using the addAll() method.
public class CreateArrayListFromCollectionExample {

    public static void main(String[] args) {

        //create arrayList object
        List<Integer> firstFivePrimeNumbers = new ArrayList<>();
        firstFivePrimeNumbers.add(2);
        firstFivePrimeNumbers.add(3);
        firstFivePrimeNumbers.add(5);
        firstFivePrimeNumbers.add(7);
        firstFivePrimeNumbers.add(11);


        List<Integer> firstTenPrimeNumbers = new ArrayList<>(firstFivePrimeNumbers);

        List<Integer> nextFivePrimeNumbers = new ArrayList<>();
        nextFivePrimeNumbers.add(13);
        nextFivePrimeNumbers.add(17);
        nextFivePrimeNumbers.add(19);
        nextFivePrimeNumbers.add(23);
        nextFivePrimeNumbers.add(29);

        firstTenPrimeNumbers.addAll(nextFivePrimeNumbers);


        System.out.println(firstTenPrimeNumbers);



    }

}
