import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to the Library of St. Mindera");
            System.out.println("Select an option please : ");
            System.out.println("1. Add book : ");
            System.out.println("2. Remove book : ");
            System.out.println("3. Add user : ");
            System.out.println("4. Remove user : ");
            System.out.println("5. Exit");

            int option = input.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Name of book : ");
                    String bookName = input.next();

                    System.out.println("Authors name : ");
                    String authorName = input.next();

                    System.out.println("Published year : ");
                    int yearOfPublishing = input.nextInt();

                    System.out.println("Available stock : ");
                    int availableStock = input.nextInt();

                    System.out.println("Book ID:");
                    int bookID = input.nextInt();

                    Book newBook = new Book(bookName, authorName, yearOfPublishing, availableStock, bookID);
                    library.addBook(newBook);
                    System.out.println("Book added!");
                    break;

                case 2:
                    System.out.println("Name of book to remove : ");
                    String bookNameRemove = input.next();
                    List<Book> libraryBooks = library.getBooks();
                    boolean bookRemoved = false;

                    for (Book book : libraryBooks) {
                        if (book.getBookName().equals(bookNameRemove)) {
                            library.removeBook(book);
                            System.out.println("Book removed");
                            bookRemoved = true;
                            break;
                        }
                    }
                    if (!bookRemoved) {
                        System.out.println("Book not found");
                    }
                    break;

                case 3:
                    System.out.println("Username : ");
                    String userName = input.next();
                    System.out.println("Age : ");
                    int userAge = input.nextInt();
                    System.out.println("Password : ");
                    String userPassword = input.next();
                    System.out.println(" Role : ");
                    String userRole = input.next();
                    User newUser = new User(userName, userAge, userPassword, userRole);
                    library.addUser(newUser);
                    System.out.println("User added");
                    break;

                case 4:
                    System.out.println("Username to remove : ");
                    String userNameRemove = input.next();
                    List<User> libraryUsers = library.getUsers();
                    boolean userRemoved = false;

                    for (User user : libraryUsers) {
                        if (user.getUserName().equals(userNameRemove)) {
                            library.removeUser(user);
                            System.out.println("User removed");
                            userRemoved = true;
                            break;
                        }
                    }
                    if (!userRemoved) {
                        System.out.println("User not found");
                    }
                    break;

                case 5:
                    System.out.println("Leaving library! Hope to see you soon!");
                    input.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option\n Input valid option");

            }


        }
    }
}
