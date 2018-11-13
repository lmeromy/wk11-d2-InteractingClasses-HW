import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

//    Create your own library class with an internal collection of books
//    MVP:
//    Books should have title, author and genre.
//    Write a method to count the number of books in the library.
//    Write a method to add a book to the library stock.
//    Add a capacity to the library and write a method to check if stock is full before adding a book.

    Book book;

    @Before
    public void setup(){
        book = new Book("Harry Potter", "Rowling", "Fantasy");

    }

    @Test
    public void bookHasTitle(){
        assertEquals("Harry Potter", book.getTitle());
    }

    @Test
    public void bookHasAuthor(){
        assertEquals("Rowling", book.getAuthor());
    }

    @Test
    public void bookHasGenre(){
        assertEquals("Fantasy", book.getGenre());
    }



}
