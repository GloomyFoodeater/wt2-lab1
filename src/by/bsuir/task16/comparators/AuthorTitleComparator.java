package by.bsuir.task16.comparators;

import by.bsuir.task12.Book;

import java.util.Comparator;

public class AuthorTitleComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        int difference = o1.getAuthor().compareTo(o2.getAuthor());
        if (difference == 0){
            difference = o1.getTitle().compareTo(o2.getTitle());
        }
        return difference;
    }
}
