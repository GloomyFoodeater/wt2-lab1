package by.bsuir.task16;

import by.bsuir.task12.Book;
import by.bsuir.task16.comparators.AuthorTitleComparator;
import by.bsuir.task16.comparators.AuthorTitlePriceComparator;
import by.bsuir.task16.comparators.TitleAuthorComparator;
import by.bsuir.task16.comparators.TitleComparator;

public class Main {
    public static void main(String[] args) {
        TitleComparator titleComparator = new TitleComparator();
        TitleAuthorComparator titleAuthorComparator = new TitleAuthorComparator();
        AuthorTitleComparator authorTitleComparator = new AuthorTitleComparator();
        AuthorTitlePriceComparator authorTitlePriceComparator = new AuthorTitlePriceComparator();

        Book book1 = new Book("Title1", "Author1", 1);
        Book book2 = new Book("Title2", "Author2", 2);
        System.out.println("Compare: " + titleComparator.compare(book1, book2));

        Book book3 = new Book("Title1", "Author2", 2);
        Book book4 = new Book("Title1", "Author1", 1);
        System.out.println("Compare: " + titleAuthorComparator.compare(book3, book4));

        Book book5 = new Book("Title1", "Author1", 1);
        Book book6 = new Book("Title2", "Author1", 2);
        System.out.println("Compare: " + authorTitleComparator.compare(book5, book6));

        Book book7 = new Book("Title1", "Author1", 2);
        Book book8 = new Book("Title1", "Author1", 1);
        System.out.println("Compare: " + authorTitlePriceComparator.compare(book7, book8));
    }
}
