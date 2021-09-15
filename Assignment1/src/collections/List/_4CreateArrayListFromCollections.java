package collections.List;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _4CreateArrayListFromCollections {
    public static void main(String[] args) {
        List<Integer> firstFivePrimeNumbers = new ArrayList<>();
        firstFivePrimeNumbers.add(2);
        firstFivePrimeNumbers.add(3);
        firstFivePrimeNumbers.add(5);
        firstFivePrimeNumbers.add(7);
        firstFivePrimeNumbers.add(11);

        // Creating new ArrayList from existing ArrayList //

        List<Integer> listOfPrimeNumbers = new ArrayList<>(firstFivePrimeNumbers);

        List<Integer> nextFivePrimeNumbers = new ArrayList<>();
        nextFivePrimeNumbers.add(13);
        nextFivePrimeNumbers.add(17);
        nextFivePrimeNumbers.add(19);
        nextFivePrimeNumbers.add(23);
        nextFivePrimeNumbers.add(29);

        listOfPrimeNumbers.addAll(nextFivePrimeNumbers);
        listOfPrimeNumbers.add(29);
        listOfPrimeNumbers.add(29);

        System.out.println("List of Prime Numbers: " +listOfPrimeNumbers);

        Set<Integer> setOfPrimeNumbers = new HashSet<>(listOfPrimeNumbers);
        System.out.println("Set of Prime Numbers: " +setOfPrimeNumbers);

    }
}
