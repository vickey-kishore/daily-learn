package inDepthJavaCollections.arrays.parallel;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


// arrays from util package ---. core methods (seque ntial operation)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;

// arrays - parallel
public class ArraysDemo {

    // Java 8 ~ Parallelized Operations
    private static void parallel() {
        // For large arrays on multi-core. Min size atleast 1 >> 13 = 8192
        int[] iArray = {23, 4, 59};
        Arrays.parallelSort(iArray);
        System.out.println("iArray parallel sort: " + Arrays.toString(iArray));

        IntBinaryOperatorImpl IntBinaryOperatorImpl = new IntBinaryOperatorImpl();
        Arrays.parallelPrefix(iArray, IntBinaryOperatorImpl); // cumulative of the elements in array
        System.out.println("Parallel Prefix: " + Arrays.toString(iArray));

        IntUnaryOperatorImpl intUnaryOperatorImpl = new IntUnaryOperatorImpl();
        intUnaryOperatorImpl.setArray(iArray);
        Arrays.parallelSetAll(iArray, intUnaryOperatorImpl);
        System.out.println("Parallel Set All: " + Arrays.toString(iArray));
    }

    public static void main(String[] args) {
        //sequential();
        parallel();
    }

}

class IntBinaryOperatorImpl implements IntBinaryOperator {
    @Override
    public int applyAsInt(int left, int right) {
        return left + right;
    }
}

class IntUnaryOperatorImpl implements IntUnaryOperator {
    int[] iArray;

    public void setArray(int[] iArray) {
        this.iArray = iArray;
    }

    @Override
    public int applyAsInt(int i) {
        if (iArray != null) {
            return iArray[i] + 5;
        } else {
            return i;
        }
    }

}


