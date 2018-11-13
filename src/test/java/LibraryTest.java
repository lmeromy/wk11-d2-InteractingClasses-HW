import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class LibraryTest {

    Library library;
    Book book1;
    Book book2;
    Book book3;
    Borrower borrower1;

    //    Create your own library class with an internal collection of books
//    MVP:
//    Books should have title, author and genre.
//    Write a method to count the number of books in the library.
//    Write a method to add a book to the library stock.
//    Add a capacity to the library and write a method to check if stock is full before adding a book.
//    Extension:
//    Add a third class which interacts with the other two.
//    E.g. you could add a Borrower with a method that takes a Book and moves to the Borrower's collection.


    @Before
    public void setup(){
        library = new Library(2);
        book1 = new Book("Falling Up", "Silverstein", "Poetry");
        book2 = new Book("Holes", "Sachar", "Fiction");
        book3 = new Book("The Source", "Michener", "Historical Fiction");
        borrower1 = new Borrower("Zoe");
    }

    @Test
    public void canCountBooks(){
        assertEquals(0, library.countBooks());
    }

    @Test
    public void canAddBook(){
        library.addBook(book1);
        assertEquals(1, library.countBooks());
    }

    @Test
    public void canAddBooksIfSpace(){
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(2, library.countBooks());
    }

    @Test
    public void cannotAddBookIfFull(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(false, library.addBook(book3));
        assertEquals(2, library.countBooks());
    }

    @Test
    public void canLoanBook(){
        library.addBook(book1);
        library.addBook(book2);
//        Book toBeLoanedBook = borrower1.request(book1);
        library.loanBook(book1, borrower1);
        assertEquals(1, library.countBooks());
        assertEquals(1, borrower1.countBooks());


    }
}
