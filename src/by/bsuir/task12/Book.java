package by.bsuir.task12;

public class Book {
    private final String title;
    private final String author;
    private final int price;
    private static int edition;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public boolean equals(Object obj) {
        Book book = (Book) obj;
        return (this.title.equals(book.title) &&
                this.author.equals(book.author) &&
                this.price == book.price);
    }

    public String toString() {
        return "Title: " + title + "\n" +
                "Author: " + author + "\n" +
                "Price: " + price + "\n" +
                "Edition: " + edition;
    }

    public int hashCode() {
        return title.hashCode() + author.hashCode() + price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public int getEdition() {
        return edition;
    }
}