import java.util.ArrayList;
import java.util.Scanner;

public class AnimalMain {

    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        ArrayList<Animal> list = new ArrayList<Animal>();
        System.out.println("Animal Menu");
        System.out.println("Entering nothing will stop the loop");
        while (true) {
            System.out.print("Please enter a name: ");
            String name = scan.nextLine();
            if (name.trim().isEmpty()) {
                break;
            }
            System.out.print("Is it a dog? Yes or no: ");
            String response = scan.nextLine();
            boolean isDog = response.equalsIgnoreCase("Yes");
            list.add(new Animal(name, isDog));
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
