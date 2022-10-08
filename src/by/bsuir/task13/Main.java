package by.bsuir.task13;

import by.bsuir.task12.Book;

public class Main {
    public static void main(String[] args) {
        Book book = new ProgrammerBook("Искусство программирования",
                "Дональд Кнут",
                50, "en",
                255);
        System.out.println("toString(): \n" + book + "\n");
    }
}
