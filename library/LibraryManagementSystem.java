package library;
import library.books.Book;
import library.members.Member;
import library.transactions.Transaction;

public class LibraryManagementSystem {
	public static void main(String[] args) {
        Book book1 = new Book("Java Basics", "James Gosling", "12345");
        Member member1 = new Member("Alice", 101);

        book1.displayInfo();
        member1.displayInfo();

        Transaction transaction = new Transaction();
        transaction.issueBook(book1, member1);
        transaction.returnBook(book1, member1);
    }
}
