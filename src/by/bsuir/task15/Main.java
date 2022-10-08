package by.bsuir.task15;

import java.util.ArrayList;
import java.util.Random;

import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<ComparableBook> books = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            books.add(new ComparableBook("Title" + i,
                    "Author" + i,
                    abs(random.nextInt()) % 900 + 100,
                    abs(random.nextInt()) % 900 + 100));
        }

        for (ComparableBook book: books){
            System.out.println(book);
        }

        books.sort(ComparableBook::compareTo);
        System.out.println();

        for (ComparableBook book: books){
            System.out.println(book);
        }
    }
}
