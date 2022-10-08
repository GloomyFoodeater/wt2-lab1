package by.bsuir.task15;

import by.bsuir.task12.Book;

public class ComparableBook extends Book implements Comparable<ComparableBook> {
    private int isbn;

    public ComparableBook(String title, String author, int price, int isbn) {
        super(title, author, price);
        this.isbn = isbn;
    }

    @Override
    public int compareTo(ComparableBook o) {
        return isbn - o.isbn;
    }

    @Override
    public String toString(){
        return super.toString() + ", " + "ISBN: " + isbn;
    }

    public int getIsbn() {
        return isbn;
    }
}
