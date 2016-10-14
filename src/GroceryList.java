import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Matthew.Watson on 10/12/16.
 */
public class GroceryList {
    IO io=new IO();

    public void groceryList() throws IOException{ //should break this up
        Scanner s = new Scanner(System.in);
        double newItem;
        String anotherItem;

        System.out.println("How much is your first item? ");
        newItem = s.nextDouble();
        ArrayList<Double> groceryList = new ArrayList<>();
        groceryList.add(newItem);
        System.out.println("Would you like to add another item?");
        anotherItem = s.nextLine();
        while (anotherItem.equalsIgnoreCase("y") || anotherItem.equalsIgnoreCase("yes")) {
            System.out.println("add item:");
            newItem = s.nextDouble();
            groceryList.add(newItem);
            System.out.println("would you like to add another item?");
            anotherItem = s.nextLine();
            double afterTax = 0;
            double total = 0;
            for (int i = 0; i < groceryList.size(); ++i) {
                total += groceryList.get(i);
                afterTax = (total * .06) + total;
            }
            BigDecimal convertedTotal = new BigDecimal(afterTax);
            BigDecimal roundedTotal = convertedTotal.setScale(2, RoundingMode.DOWN);
            io.clear();
            IO.groceryOut(roundedTotal);
            System.out.println("Your total after tax is $" + roundedTotal);
        }
    }
}
