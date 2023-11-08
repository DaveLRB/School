public class Book {

    private String bookName;
    private String authorName;
    private int bookID;
    private int yearOfPublishing;
    public int availableStock;

    public Book(String bookName, String authorName, int yearOfPublishing, int availableStock, int bookID) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.yearOfPublishing = yearOfPublishing;
        this.availableStock = availableStock;
        this.bookID = bookID;
    }

    public void decreaseStock() {
        if (availableStock > 0) {
            availableStock--;
        } else {
            System.out.println("Sorry, the book is out of stock.");
        }
    }

    public void increaseStock() {
        availableStock++;
    }

    public String toString() {
        return "\033[33m" + " Bookname: " + "\033[0m" + bookName + "\033[33m" + " Author : " + "\033[0m" + authorName +
                "\033[33m" + " Published year : " + "\033[0m" + yearOfPublishing + "\033[33m" + " Stock : " + "\033[0m"
                + availableStock + "\033[33m" + " Book ID : " + "\033[0m" + bookID;
    }

    public String getBookName() {
        return this.bookName;
    }

    public int getAvailableStock() {
        return this.availableStock;
    }


}

