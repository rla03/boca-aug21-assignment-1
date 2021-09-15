package collections.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class _2IteratorsOverArrayList {
    public static void main(String[] args) {
        List<String> tvShows = new ArrayList<>();
        tvShows.add("Prison Break");
        tvShows.add("FRIENDS");
        tvShows.add("How I Met Your Mother");
        tvShows.add("Breaking Bread");

        // Printing TV Shows using for loop //
        System.out.println("For Loop Tv Shows: ");
        for (int i=0; i<tvShows.size();i++){
            System.out.println("Printing in for loop: " +tvShows.get(i));
        }
        System.out.println("For-Each Loop Tv Shows: ");
        // Printing in for-each loop //
        for (String tvs: tvShows) {
            System.out.println("Printing in For-Each loop: "+tvs);
        }
        System.out.println("Iterator Tv Shows: ");
        //Printing using Iterator //
        Iterator<String> tvShowIterator = tvShows.iterator();
        while (tvShowIterator.hasNext()){
            String tvs = tvShowIterator.next();
            System.out.println("Printing in Iterator: "+tvs);
        }

        System.out.println("LIST_ITERATOR Tv Shows (IN REVERSE): ");
        ListIterator<String> tvShowListIterator = tvShows.listIterator(tvShows.size());
        while (tvShowListIterator.hasPrevious()){
            String tvs = tvShowListIterator.previous();
            System.out.println("Printing in List Iterator: " +tvs );
        }


    }
}
