public class Book {

    private String title;
    private int numberOfPages;
    private int year;

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