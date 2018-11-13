import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower1;
    Book book1;
    Book book2;
    Book book3;
//    Add a third class which interacts with the other two.
//    E.g. you could add a Borrower with a method that takes a Book and moves to the Borrower's collection.

    @Before
    public void setup(){
        borrower1 = new Borrower("Zoe");
        book1 = new Book("Falling Up", "Silverstein", "Poetry");
        book2 = new Book("Holes", "Sachar", "Fiction");
        book3 = new Book("The Source", "Michener", "Historical Fiction");
    }

    @Test
    public void canGetBorrowedBooks(){
        assertEquals(0, borrower1.countBooks());
    }

    @Test
    public void canBorrowBook(){
        borrower1.borrow(book1);
        assertEquals(1, borrower1.countBooks());
    }

    @Test
    public void canBorrowMultipleBooks(){
        borrower1.borrow(book1);
        borrower1.borrow(book2);
        assertEquals(2, borrower1.countBooks());
    }
}
