import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Matthew.Watson on 10/13/16.
 */
public class Menu {

    public static void menuSwitch() throws IOException {
        String fileName="Help.txt";
        String fileName2="numbers.txt";
        TipCalc tipCalc=new TipCalc();
        Calculator calc=new Calculator();
        GroceryList groceryList=new GroceryList();
        IO io=new IO();
        int menuItem = -1;
        while (menuItem != 0) {
            menuItem = showMenu();
            switch (menuItem) {
                case 1: calc.addition();
                    break;
                case 2: calc.subtraction();
                    break;
                case 3: calc.multiplication();
                    break;
                case 4: calc.division();
                    break;
                case 5: tipCalc.tipCalc();
                    break;
                case 6:groceryList.groceryList();
                    break;
                case 7:calc.answers();
                    break;
                case 8:calc.answers.clear();
                       io.clear();
                    break;
                case 9:Desktop.getDesktop().open(new File(fileName2));
                       io.clear();
                    break;
                case 10:Desktop.getDesktop().open(new File(fileName));
                    io.clear();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Please choose an option.");
            }
        }
    }


    public static int showMenu() {
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("***Mathly***");
        System.out.println("0. Exit the program");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Tip Calculator");
        System.out.println("6. Grocery Calculator");
        System.out.println("7. Answer History");
        System.out.println("8. Clear Answer History");
        System.out.println("9. Past Commands");
        System.out.println("10. HELP!");
        System.out.println();
        System.out.println("Please Enter a choice: ");
        choice = input.nextInt();
        return choice;
    }


}