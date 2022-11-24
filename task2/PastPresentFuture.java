import java.time.LocalDate;
import java.util.Scanner;

public class PastPresentFuture {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        String userInput = getUserInput();
        LocalDate userDate = LocalDate.parse(userInput);
        if (localDate.isBefore(userDate)) {
            System.out.println("Your date is in the future");
            return;
        }
        if (localDate.isAfter(userDate)) {
            System.out.println("Your date is in the past");
            return;
        }
        System.out.println("Your date is NOW");
    }

    public static String getUserInput() {
        System.out.println("Enter a month, day and year (yyyy-mm-dd) >>> ");
        Scanner scanner = new Scanner(System.in);
        return  scanner.next();
    }
}
