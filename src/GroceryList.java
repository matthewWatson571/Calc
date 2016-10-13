import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Matthew.Watson on 10/12/16.
 */
public class GroceryList {

    public void groceryList() {
        Scanner addItem = new Scanner(System.in);
        Scanner yesNo = new Scanner(System.in);
        double newItem;
        String anotherItem;

        System.out.println("How much is your first item? ");
        newItem = addItem.nextDouble();
        ArrayList<Double> groceryList = new ArrayList<>();
        groceryList.add(newItem);
        System.out.println("Would you like to add another item?");
        anotherItem = yesNo.nextLine();
        while (anotherItem.equals("y")) {
            System.out.println("add item:");
            newItem = addItem.nextDouble();
            groceryList.add(newItem);
            System.out.println("would you like to add another item?");
            anotherItem = yesNo.nextLine();
            double afterTax = 0;
            double total = 0;
            for (int i = 0; i < groceryList.size(); ++i) {
                total += groceryList.get(i);
                afterTax = (total * .06) + total;
            }
            BigDecimal convertedTotal = new BigDecimal(afterTax);
            BigDecimal roundedTotal = convertedTotal.setScale(2, RoundingMode.DOWN);
            System.out.println("Your total after tax is $" + roundedTotal);
        }
    }
}
