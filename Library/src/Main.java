import java.io.Console;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Library library = new Library();
        libraryLoginMenu(library);
        libraryAdminMenu(library);
        libraryUserMenu(library);

    }

    private static void libraryLoginMenu(Library library) {
        while (true) {
            System.out.println("📖" + "\u001b[33;1m" + "Welcome to the Library of St. Minder" + "\033[0m" + "📖");
            System.out.println("⓵ Login");
            System.out.println("⓶ Sign up");
            System.out.println("⓷ Exit");

            String option = input.next();
            input.nextLine();
            switch (option) {
                case "1":
                    System.out.print("\u001b[34m" + "Username : " + "\033[0m");
                    String userName = input.nextLine();
                    System.out.print("\u001b[34m" + "Password : " + "\033[0m");
                    String userPassword = input.next();

                    User loggedInUser = library.authenticateUser(userName, userPassword);
                    if (loggedInUser != null) {
                        if (loggedInUser.isAdmin) {
                            libraryAdminMenu(library);
                        } else {
                            libraryUserMenu(library);
                        }
                    } else {
                        System.out.println("\u001b[31;1m" + "Non-existant credentials!" + "\033[0m");
                    }
                    break;
                case "2":
                    System.out.println("\u001b[34m" + "Insert data please : \n" + "\033[0m");
                    addNewUserName(library);
                    libraryLoginMenu(library);
                    break;
                case "3":
                    System.out.println("\u001b[34m" + "Leaving library! Hope to see you soon!" + "\033[0m" + "☀️");
                    input.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("\u001b[31;1m" + "Invalid option\n Input valid option" + "\033[0m");
                    break;


            }
        }
    }

    private static void libraryUserMenu(Library library) {
        while (true) {
            System.out.println("\u001b[34m" + "Select an option please : " + "\033[0m");
            System.out.println("⓵ List of books");
            System.out.println("⓶ New requisitions");
            System.out.println("⓷ Returns");
            System.out.println("⓸ Log out");
            System.out.println("⓹ Exit");


            String option = input.next();
            input.nextLine();

            switch (option) {

                case "1":
                    library.printListOfBooks();
                    break;
                case "2":
                    System.out.print("\u001b[34m" + "Book name to loan : " + "\033[0m");

                    String bookName = input.nextLine();
                    library.isBookAvailableToLoan(bookName);
                    library.loanAvailableBook(bookName);
                    break;
                case "3":
                    System.out.print("\u001b[34m" + "Book name to return : " + "\033[0m");

                    bookName = input.nextLine();
                    library.returnLoanedBook(bookName);
                    break;
                case "4":
                    libraryLoginMenu(library);
                    break;
                case "5":
                    System.out.println("\u001b[34m" + "Leaving library! Hope to see you soon!" + "\033[0m" + "☀️");
                    input.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("\u001b[31;1m" + "Invalid option\n Input valid option" + "\033[0m");
            }

        }
    }

    private static void libraryAdminMenu(Library library) {
        while (true) {
            System.out.println("\u001b[34m" + "Select an option please : " + "\033[0m");
            System.out.println("⓵ Add book : ");
            System.out.println("⓶ Remove book : ");
            System.out.println("⓷ Add user : ");
            System.out.println("⓸ Remove user : ");
            System.out.println("⓹ List of books");
            System.out.println("⓺ List of users");
            System.out.println("⓻ Log out");
            System.out.println("⓼ Exit ");

            String option = input.next();
            input.nextLine();

            switch (option) {
                case "1":
                    addBookToLibrary(library);
                    break;

                case "2":
                    removeBookFromLibrary(library);
                    break;

                case "3":
                    addNewUserName(library);
                    break;

                case "4":
                    removeUserName(library);
                    break;
                case "5":
                    library.printListOfBooks();
                    break;
                case "6":
                    library.printListOfUsers();
                    break;
                case "7":
                    libraryLoginMenu(library);
                    break;
                case "8":
                    System.out.println("\u001b[34m" + "Leaving library! Hope to see you soon!" + "\033[0m" + "☀️");
                    input.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("\u001b[31;1m" + "Invalid option\n Input valid option" + "\033[0m");

            }
        }
    }

    public static void addBookToLibrary(Library library) {
        System.out.print("\u001b[34m" + "Name of book : " + "\033[0m");
        String bookName = input.nextLine();
        System.out.print("\u001b[34m" + "Authors name : " + "\033[0m");
        String authorName = input.nextLine();
        System.out.print("\u001b[34m" + "Published year : " + "\033[0m");
        int yearOfPublishing = input.nextInt();
        System.out.print("\u001b[34m" + "Available stock : " + "\033[0m");
        int availableStock = input.nextInt();
        System.out.print("\u001b[34m" + "Book ID:" + "\033[0m");
        int bookID = input.nextInt();
        library.addBook(bookName, authorName, yearOfPublishing, availableStock, bookID);
        System.out.print("\u001b[34m" + "Book added! \n" + "\033[0m");

    }

    public static void removeBookFromLibrary(Library library) {
        System.out.print("\u001b[34m" + "Name of book to remove : " + "\033[0m");
        String bookNameRemove = input.nextLine();
        List<Book> libraryBooks = library.getBooks();
        boolean bookRemoved = false;

        for (Book book : libraryBooks) {
            if (book.getBookName().equals(bookNameRemove)) {
                library.removeBook(book);
                System.out.println("\u001b[34m" + "Book removed" + "\033[0m");
                bookRemoved = true;
                break;
            }
        }
        if (!bookRemoved) {
            System.out.println("\u001b[31;1m" + "Book not found" + "\033[0m");
        }

    }

    public static void addNewUserName(Library library) {
        System.out.print("\u001b[34m" + "Username : " + "\033[0m");
        String userName = input.nextLine();
        System.out.print("\u001b[34m" + "Age : " + "\033[0m");
        int userAge = input.nextInt();
        System.out.print("\u001b[34m" + "Password : " + "\033[0m");
        String userPassword = input.next();
        library.addUser(userName, userAge, userPassword);
        System.out.print("\u001b[34m" + "User added!\n" + "\033[0m");


    }

    public static void removeUserName(Library library) {
        System.out.print("\u001b[34m" + "Username to remove : " + "\033[0m");
        String userNameRemove = input.nextLine();
        List<User> libraryUsers = library.getUsers();
        boolean userRemoved = false;

        for (User user : libraryUsers) {
            if (user.getUserName().equals(userNameRemove)) {
                library.removeUser(user);
                System.out.println("\u001b[34m" + "User removed!" + "\033[0m");
                userRemoved = true;
                break;
            }
        }
        if (!userRemoved) {
            System.out.println("\u001b[31;1m" + "User not found" + "\033[0m");
        }

    }


}






