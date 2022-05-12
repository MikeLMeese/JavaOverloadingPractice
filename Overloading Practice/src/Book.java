public class Book {

    private String title;
    private int numberOfPages;
    private int year;

    // Start of overloaded constructors
    public Book () {
        this.title = "";
        this.numberOfPages = 0;
        this.year = 0;
    }
    
    public Book (String title) {
        this.title = title;
        this.numberOfPages = 0;
        this.year = 0;
    }

    public Book (int year) {
        this.title = "";
        this.numberOfPages = 0;
        this.year = year;
    }

    public Book (int year, String title) {
        this.title = title;
        this.numberOfPages = 0;
        this.year = year;
    }

    public Book (String title, int numberOfPages) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.year = 0;
    }
    // End of overloaded constructors

    public Book (String title, int numberOfPages, int year) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return getTitle() + ", " + getNumberOfPages() + " pages, " + getYear();
    }
}