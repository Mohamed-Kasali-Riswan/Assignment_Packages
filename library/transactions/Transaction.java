package library.transactions;

import library.books.Book;
import library.members.Member;

public class Transaction {
    public void issueBook(Book book, Member member) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            System.out.println("Book '" + book.getTitle() + "' issued to " + member.getName());
        } else {
            System.out.println("Book '" + book.getTitle() + "' is currently unavailable.");
        }
    }

    public void returnBook(Book book, Member member) {
        book.setAvailable(true);
        System.out.println("Book '" + book.getTitle() + "' returned by " + member.getName());
    }
}
