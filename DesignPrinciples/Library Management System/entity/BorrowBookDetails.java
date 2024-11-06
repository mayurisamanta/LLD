package entity;

import java.time.LocalDate;
import java.util.Objects;

public class BorrowBookDetails {

    private Book book;

    private LocalDate borrowDate;

    private LocalDate dueDate;

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(LocalDate borrowDate) {
        this.borrowDate = borrowDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public BorrowBookDetails(Book book, LocalDate dueDate) {
        this.book = book;
        this.dueDate = dueDate;
        this.borrowDate = LocalDate.now();
    }

    // toString
    @Override
    public String toString() {
        return "BorrowBookDetails{" +
                "book=" + book +
                ", borrowDate=" + borrowDate +
                ", dueDate=" + dueDate +
                '}';
    }

}
