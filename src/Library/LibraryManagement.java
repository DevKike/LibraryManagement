package Library;
import Book.Book;
public class LibraryManagement {
    private Book first;
    public LibraryManagement(){
        first = null;
    }

    public void viewBooks(){
        Book currentBook = this.first;
        if(currentBook == null){
            System.out.println("\nThe library is empty!\n");
        }else{
            System.out.println("\nBooks:");
            while(currentBook != null){
                System.out.println(currentBook.toString());
                currentBook = currentBook.getNext();
            }
            System.out.println("");
        }
    }
    public void addBook(Book newBook){
        if(this.first == null){
            this.first = newBook;
        }else{
            Book currentBook = this.first;
            while(currentBook.getNext() != null){
                currentBook = currentBook.getNext();
            }
            currentBook.setNext(newBook);
        }
    }

    public void BorrowABook(String title){
        Book currentBook = this.first;
        boolean bookFound = false;
        
        while(currentBook != null){
            if(currentBook.getTitle().equals(title)){
                if(currentBook.getCopiesAvailable() > 0){
                    currentBook.setCopiesAvailable(currentBook.getCopiesAvailable() - 1);
                    System.out.println("The book " + title + " was borrowed.\n");
                    bookFound = true;
                }else{
                    System.out.println("Sorry, no copies of the book " + title + " are available");
                }
                break;
            }
            currentBook = currentBook.getNext();
        }
        if(!bookFound){
            System.out.println("\nThe book " + title + " wasn't found in the library\n");
        }
    }

    public void ReturnABook(String title){
        Book currentBook = this.first;
        boolean bookFound = false;
        
        while(currentBook != null){
            if(currentBook.getTitle().equals(title)){
                currentBook.setCopiesAvailable(currentBook.getCopiesAvailable() + 1);
                System.out.println("The book " + title + " was returned\n");
                bookFound = true;
                break;
            }
            currentBook = currentBook.getNext();
        }
        if(!bookFound){
            System.out.println("The book " + title + " wasn't found in the library\n");
        }
    }
}
