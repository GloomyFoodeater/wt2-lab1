package by.bsuir.task14;

import by.bsuir.task12.Book;

public class ClonableBook extends Book {
    public ClonableBook(String title, String author, int price) {
        super(title, author, price);
    }

    public Object clone(){
        return new ClonableBook(this.getTitle(), this.getAuthor(), this.getPrice());
    }
}
