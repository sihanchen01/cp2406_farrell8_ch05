import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AscendingAndDescending {
    public static ArrayList<Integer> inputs = new ArrayList<Integer>();

    public static void main(String[] args) {
        for (int i=0; i<3; i++) {
            System.out.println("Give me a number: ");
            Scanner input = new Scanner(System.in);
            inputs.add(input.nextInt());
        }
        Collections.sort(inputs);
        System.out.println("Ascending order: ");
        System.out.println(inputs.toString());

        Collections.reverse(inputs);
        System.out.println("Descending order: ");
        System.out.println(inputs.toString());
    }
}
