import java.util.ArrayList;
import java.util.Scanner;

public class BookMain {

    // Added objects using overloaded constructors
    Book unknownBook = new Book();
    Book bookByTitle = new Book ("The Epic of Gilgamesh");
    Book lostBookWithPublishingDate = new Book (1998);
    Book bookByYearAndTitle = new Book (1995, "Shahnameh");
    Book bookByTitleAndPageCount = new Book ("Captain Underpants and the Attack of the Talking Toilets", 144);

    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("The Book of Chuang Tzu", 320, 1996));
        books.add(new Book("The I Ching or Book of Changes", 740, 1997));
        books.add(new Book("Art of War and Thirty-Six Stratagems", 306, 2022));
        books.add(new Book("Wu Zi, The Methods of the Sima, Wei Liao Zi", 355, 2005));
        books.add(new Book("The Art of War", 273, 2005));
        while (true) {
            System.out.println("What information would you like to access?");
            System.out.println("Enter nothing to exit.");
            String query = scan.nextLine();
            if (query.equalsIgnoreCase("Everything")) {
                for (int i = 0; i < books.size(); i++) {
                    System.out.println(books.get(i));
                }
            } else if (query.equalsIgnoreCase("Name")) {
                for (int i = 0; i < books.size(); i++) {
                    System.out.println(books.get(i).getTitle());
                }
            } else if (query.trim().isEmpty()) {
                break;
            }
        }
    }
}