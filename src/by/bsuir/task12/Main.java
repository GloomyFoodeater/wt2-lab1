package by.bsuir.task12;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Война и мир", "Лев Николаевич Толстой", 50);
        System.out.println("toString(): \n" + book + "\n");
        System.out.println("hashCode(): \n" + book.hashCode() + "\n");

        Book sameBook = new Book("Война и мир", "Лев Николаевич Толстой", 50);
        Book differentBook = new Book("Евгений Онегин", "Александр Сергеевич Пушкин", 62);
        System.out.println("Equals to the same book: " + book.equals(sameBook));
        System.out.println("Equals to the different book: " + book.equals(differentBook));
    }
}
