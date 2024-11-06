package entity;

import service.DayWiseFineCalculator;
import service.FineCalculator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;

public class Library {

    private List<Book> books = new ArrayList<>();

    // singleton instance
    private static Library instance;

    private Library() {
    }

    public static Library getInstance() {
        if (instance == null) {
            instance = new Library();
        }
        return instance;
    }

    public List<Book> getBooks() {
        return books;
    }

    public static void main(String[] args) {

        Librarian librarian = new Librarian("John Doe", "a@a.com", "1234567890", "123 Main St");
        Member member = new Member("George Washington", "b@b.com", "1234567890", "123 Main St");

        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "978-0743273565", new Fiction());
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "978-0446310789", new NonFiction());

        librarian.addBook(book1);
        librarian.addBook(book2);

        member.borrowBook(book1, LocalDate.now().plusDays(7));

        DoubleStream fine = member.getBorrowedBooks().stream().mapToDouble(b -> new DayWiseFineCalculator(b, 0.5).calculateFine());

        fine.forEach(System.out::println);

        System.out.println(member.getBorrowedBooks());
        System.out.println(librarian.getBooks());


    }


}
