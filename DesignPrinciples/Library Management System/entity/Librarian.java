package entity;

import java.time.LocalDate;
import java.util.List;

public class Librarian extends Person{

    public Librarian(String name, String email, String phone, String address) {
        super(name, email, phone, address);
    }

    public final List<Book> books = Library.getInstance().getBooks();

    public void addBook(Book book) {
        books.add(book);
    }

    public void lendBook(Member member, Book book) {
        member.borrowBook(book, LocalDate.now().plusDays(7));
    }

    public void returnBook(Member member, Book book) {
        member.returnBook(book);
    }

    public List<Book> getBooks() {
        return books;
    }






}
