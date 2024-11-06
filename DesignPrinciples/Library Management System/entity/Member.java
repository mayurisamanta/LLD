package entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Member extends Person {

    private List<BorrowBookDetails> borrowedBooks = new ArrayList<>();

    public Member(String name, String email, String phone, String address) {
        super(name, email, phone, address);
    }

    public List<BorrowBookDetails> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<BorrowBookDetails> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public void borrowBook(Book book, LocalDate dueDate) {

        if (!book.isAvailable()) {
            System.out.println("Book is not available");
            return;
        }
        BorrowBookDetails borrowBookDetails = new BorrowBookDetails(book, dueDate);
        borrowedBooks.add(borrowBookDetails);
        book.setAvailable(false);
    }

    public void returnBook(Book book) {
        for (BorrowBookDetails borrowBookDetails : borrowedBooks) {
            if (borrowBookDetails.getBook().equals(book)) {
                borrowedBooks.remove(borrowBookDetails);
                book.setAvailable(true);
                return;
            }
        }
        System.out.println("Book is not borrowed by this member");
    }
}
