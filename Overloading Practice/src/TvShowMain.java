import java.util.ArrayList;
import java.util.Scanner;

public class TvShowMain {

    // Added objects using overloaded constructors
    TvShow unknownShow = new TvShow();
    TvShow tvShowByName = new TvShow ("Tenchi-Muyo! Ryo-Ohki");
    TvShow tvShowByNameWithEpisodeList = new TvShow ("Mobile Suit Gundam SEED Destiny", 50);
    TvShow tvShowByEpisodeListAndGenre = new TvShow(49, "Fantasy Comedy"); // Zero no Tsukaima is the name if you were curious
    TvShow tvShowByNameAndGenre = new TvShow("Rurouni Kenshin", "Action/Comedy/Romance");

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        ArrayList<TvShow> list = new ArrayList<TvShow>();
        System.out.println("Entering nothing for the name will stop the loop.");
        while (true) {
            System.out.println("Enter the name of the TV Show:");
            String name = scan.nextLine();
            if (name.trim().isEmpty()) {
                break;
            }
            System.out.println("How many episodes?");
            int episodes = Integer.valueOf(scan.nextLine());
            System.out.println("What is the genre?");
            String genre = scan.nextLine();
            list.add(new TvShow(name, episodes, genre));
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}