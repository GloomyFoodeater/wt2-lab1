package by.bsuir.task14;

import by.bsuir.task12.Book;

public class Main {
    public static void main(String[] args) {
        ClonableBook book = new ClonableBook("Война и мир", "Лев Николаевич Толстой", 50);
        Book clonedBook = (Book) book.clone();
        System.out.println("Book: " + book);
        System.out.println("Cloned book equals to original: " + book.equals(clonedBook));
    }
}
