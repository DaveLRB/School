public class Book {

    private String bookName;
    private String authorName;
    private int bookID;
    private int yearOfPublishing;
    private int availableStock;

    public Book() {

    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPublisherName() {
        return authorName;
    }

    public void setPublisherName(String publisherName) {
        this.authorName = publisherName;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public int getAvailableStock() {
        return availableStock;
    }

    public void setAvailableStock(int availableStock) {
        this.availableStock = availableStock;
    }

    public Book(String bookName, String authorName, int yearOfPublishing, int availableStock, int bookID) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.yearOfPublishing = yearOfPublishing;
        this.availableStock = availableStock;
        this.bookID = bookID;
    }


}

