import java.util.ArrayList;
import java.util.Scanner;

public class TvShowMain {

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