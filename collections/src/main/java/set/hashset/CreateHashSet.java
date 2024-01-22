package set.hashset;

import java.util.HashSet;
import java.util.Set;

public class CreateHashSet {

    public static void main(String[] args) {
        Set<String> programLang = new HashSet<>();
        programLang.add("c");
        programLang.add("c++");
        programLang.add("java");
        programLang.add("python");
        programLang.add("scala");
        programLang.add("javascript");

        System.out.println("initial = " + programLang);
    }
}
