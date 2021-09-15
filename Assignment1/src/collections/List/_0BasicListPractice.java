package collections.List;

import java.util.ArrayList;
import java.util.List;

public class _0BasicListPractice {
    public static void main(String[] args) {

        List<String> animals = new ArrayList<String>();
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Dog");
        animals.add("Cat");

        printAnimalsList(animals);
    }

    private static void printAnimalsList(List<String> animals) {
        System.out.println("Animals List is here: " + animals);
    }
}