package collections.List;

import java.util.ArrayList;
import java.util.List;

public class _3RemoveElementsFromArrayList {
    public static void main(String[] args) {
        List<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");
        programmingLanguages.add("JavaScript");
        programmingLanguages.add("Python");
        programmingLanguages.add("Php");
        programmingLanguages.add("Ruby");

        System.out.println("Main List: " + programmingLanguages);

        // Remove the element at index `6`
        programmingLanguages.remove(6);
        System.out.println("After remove(6): " + programmingLanguages);

        // Remove the first occurrence of the given element from the ArrayList
        // (The remove() method returns false if the element does not exist in the ArrayList)
        boolean isRemoved = programmingLanguages.remove("JavaScript");
        System.out.println("After remove(\"JavaScript\"): " + programmingLanguages);

        // Remove all the elements that exist in a given collection
        List<String> scriptingLanguages = new ArrayList<>();
        scriptingLanguages.add("Python");
        scriptingLanguages.add("Ruby");
        scriptingLanguages.add("Php");

        programmingLanguages.removeAll(scriptingLanguages);
        System.out.println("After removeAll(scriptingLanguages): " + programmingLanguages);
    }
}
