package Book;
public class Book {
   private String title;
   private String author;
   private int copiesAvailable;
   private Book next;
   
   public Book(String title, String author, int copiesAvailable){
        this.author = author;
        this.title = title;
        this.copiesAvailable = copiesAvailable;
        this.next = null;
   }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getCopiesAvailable() {
        return copiesAvailable;
    }

    public void setCopiesAvailable(int copiesAvailable) {
        this.copiesAvailable = copiesAvailable;
    }

    public Book getNext() {
        return next;
    }

    public void setNext(Book next) {
        this.next = next;
    }
    
    @Override
    public String toString() {
        String dataBook = "Title: " + this.getTitle() + "\nAuthor: " + this.getAuthor() + "\nCopies available: " + this.getCopiesAvailable() + "\n---------------------------";
        return dataBook;
    }
}