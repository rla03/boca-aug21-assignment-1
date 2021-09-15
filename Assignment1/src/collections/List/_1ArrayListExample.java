package collections.List;

import java.util.ArrayList;
import java.util.List;

public class _1ArrayListExample {

    public static void main(String[] args) {

        List myAnimals = new ArrayList();
        myAnimals.add("Animal 1");
        myAnimals.add("Animal 2");
        myAnimals.add("Animal 3");
        myAnimals.add("Animal 4");

        printAnimalsList(myAnimals);
    }

    // Printing Animals List in for loop
    private static void printAnimalsList(List myAnimals) {
        for (int i=0; i<myAnimals.size();i++){
            System.out.println("Printing Animal List: " +myAnimals.get(i) );
        }
    }
}
