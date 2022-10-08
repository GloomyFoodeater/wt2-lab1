package by.bsuir.task13;

import by.bsuir.task12.Book;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    public ProgrammerBook(String title, String author, int price, String language, int level) {
        super(title, author, price);
        this.language = language;
        this.level = level;
    }

    public String toString() {
        return super.toString() + "\n" +
                "Language: " + language + "\n" +
                "Level: " + level;
    }

    public String getLanguage() {
        return language;
    }

    public int getLevel() {
        return level;
    }
}
