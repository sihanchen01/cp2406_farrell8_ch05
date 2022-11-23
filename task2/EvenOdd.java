import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.print("Give me an integer >>> ");
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();
        String output =  userInput % 2 == 0 ? "even" : "odd";
        System.out.println("The given number is " + output);
    }
}
