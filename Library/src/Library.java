import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {

    private List<Book> books;
    private List<User> users;

    public Library() {

        this.books = new ArrayList<>();

        books.add(new Book("Los Polos", "Walter White", 2009, 3, 123));
        books.add(new Book("El Mariachi", "Mercolino H.", 1998, 2, 122));
        books.add(new Book("Toy Loco", "J.J.Juanito", 2002, 4, 121));
        books.add(new Book("Return of the Aviary", "Frango Barbecue", 2022, 0, 120));
        books.add(new Book("Trolley", "John Smith", 2000, 4, 119));

        this.users = new ArrayList<>();

        users.add(new User("Admin", 26, "@admin123", true));
        users.add(new User("Marta", 24, "pass1"));
        users.add(new User("David", 26, "password"));
        users.add(new User("Mário", 45, "wordpass"));
        users.add(new User("Alex", 18, "@mindera"));

    }

    public void addBook(String bookName, String authorName, int yearOfPublishing, int availableStock, int bookID) {
        Book book = new Book(bookName, authorName, yearOfPublishing, availableStock, bookID);
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void addUser(String userName, int userAge, String userPassword) {
        User user = new User(userName, userAge, userPassword);
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public List<Book> getBooks() {
        return this.books;
    }

    public List<User> getUsers() {
        return this.users;
    }

    public boolean isBookAvailableToLoan(String bookName) {

        for (Book book : books) {
            if (book.getBookName().equalsIgnoreCase(bookName)) {
                return book.getAvailableStock() > 0;
            }
        }
        return false;
    }

    public void loanAvailableBook(String bookName) {
        for (Book book : books) {
            if (book.getBookName().equalsIgnoreCase(bookName)) {
                if (book.getAvailableStock() > 0) {
                    book.decreaseStock();
                    System.out.println("Good reading!" + "\033[0m");

                } else {
                    System.out.println("Sorry no stock available" + "\033[0m");
                }
                return;
            }
        }
        System.out.println("\033[0;31m" + "There is no corresponding book to your search!" + "\033[0m");

    }

    public void returnLoanedBook(String bookName) {
        boolean bookFound = false;

            for (Book book : books) {
                if (book.getBookName().equalsIgnoreCase(bookName)) {
                    book.increaseStock();
                    System.out.println("\033[1;34m" + "Thank you for returning the book!" + "\033[0m");
                    bookFound = true;
                    break;

                }
            }
            if (!bookFound) System.out.println("\033[0;31m" + "No book to return!" + "\033[0m");

    }

    public void printListOfBooks() {
        System.out.println("\033[0;34m" + " These are all the books available :" + "\033[0m");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void printListOfUsers() {
        System.out.println("\033[0;34m" + " These are all the Users in existence :" + "\033[0m");
        for (User user : users) {
            System.out.println(user);
        }
    }

    public User authenticateUser(String userName, String userPassword) {

        for (User user : users) {
            if (user.getUserName().equals(userName) && user.getUserPassword().equals(userPassword)) {
                return user;
            }
        }
        return null;


    }

}



