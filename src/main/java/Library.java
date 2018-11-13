import java.util.ArrayList;

public class Library {

    private ArrayList<Book> collection;
    private int capacity;

    public Library(int capacity){
        this.collection = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int countBooks(){
        return this.collection.size();
    }

    public boolean addBook(Book book){
        if(this.countBooks() < this.capacity){
            this.collection.add(book);
            return true;
        } else {
            return false;
        }
    }

    public void loanBook(Book book, Borrower borrower){
        if(this.collection.contains(book)){
            this.collection.remove(book);
            borrower.borrow(book);
        }
    }

}


