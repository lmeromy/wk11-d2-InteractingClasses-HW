import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> borrowed;

    public Borrower(String name){
        this.name = name;
        this.borrowed = new ArrayList<Book>();
    }

    public int countBooks(){
        return this.borrowed.size();
    }

    public void borrow(Book book){
        this.borrowed.add(book);
    }


}
