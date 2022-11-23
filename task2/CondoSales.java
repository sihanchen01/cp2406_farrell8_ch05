import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CondoSales {
    enum ViewName {
        PARK_VIEW,
        GOLF_COURSE_VIEW,
        LAKE_VIEW
    }

    private int price;
    private String condoName;

    private static final String WRONG_INPUT = "Invalid input, try again!";
    private static final HashMap<Integer, Integer> PRICES = new HashMap<Integer, Integer>() {{
        put(1, 150000);
        put(2, 170000);
        put(3, 210000);
    }};

    public static void main(String[] args) {
        CondoSales condoSales = new CondoSales();
        try {
            int userInput = condoSales.getUserInput();
            if (userInput < 1 || userInput > 3){
                System.out.println(WRONG_INPUT);
                main(null);
            } else {
                condoSales.condoName = ViewName.values()[userInput - 1].toString();
                condoSales.price = PRICES.get(userInput);
                System.out.printf("The %s is $%s.", condoSales.condoName, condoSales.price);
            }
        } catch (InputMismatchException e) {
            System.out.println(WRONG_INPUT);
            main(null);
        }
    }

    private int getUserInput () {
        System.out.println("""
                Welcome to Summerdale Condo Sales office, to check price for different condos:
                press 1 -> park view;
                press 2 -> golf course view;
                press 3 -> lake view.
                """);
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
}
