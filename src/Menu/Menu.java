package Menu;
import Book.Book;
import Library.LibraryManagement;
import java.util.Scanner;
public class Menu {
    public static void main(String[] args){
        LibraryManagement libraryManagement = new LibraryManagement();
        int op;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Option menu:");
            System.out.println("1. View books");
            System.out.println("2. Add a book");
            System.out.println("3. Borrow a book");
            System.out.println("4. Return a book");
            System.out.println("0. Exit");
            System.out.print("\nChoose a option: ");
            op = sc.nextInt();
            switch(op){
                case 1:
                    libraryManagement.viewBooks();
                break;
                case 2:
                    sc.nextLine();
                    System.out.print("Title: ");
                    String title = sc.nextLine();
                    System.out.print("Author: ");
                    String author = sc.nextLine();
                    System.out.print("How many copies do you want to add?: ");
                    int copiesAvailable = sc.nextInt();
                    System.out.println("\nThe book was added successfully!\n");
                    Book newBook = new Book(title, author, copiesAvailable);
                    libraryManagement.addBook(newBook);
                break;
                case 3:
                    sc.nextLine();
                    System.out.print("\nEnter the title of the book you want to borrow: ");
                    String titleToBorrow = sc.nextLine();
                    libraryManagement.BorrowABook(titleToBorrow);
                break;
                case 4:
                    sc.nextLine();
                    System.out.print("\nEnter the title of the book you want to return: ");
                    String titleToReturn = sc.nextLine();
                    libraryManagement.ReturnABook(titleToReturn);
                break;
            }
        }while(op != 0);
    }
}
