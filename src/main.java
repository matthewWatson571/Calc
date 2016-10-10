/**
 * Created by Matthew.Watson on 10/10/16.
 */
import java.io.IOException;
import java.util.Scanner;
import java.awt.Desktop;
import java.io.File;
public class main {
    public static void main(String [] args) throws IOException {
        String fileName="Help.txt";
        String fileName2="numbers.txt";
        int menuItem = -1;
        while (menuItem != 0) {
            menuItem = menu();
            switch (menuItem) {
                case 1: Calculator.addition();
                    break;
                case 2: Calculator.subtraction();
                    break;
                case 3: Calculator.multiplication();
                    break;
                case 4:Calculator.division();
                    break;
                case 5: Calculator.tipCalc();
                    break;
                case 6:Calculator.groceries();
                    break;
                case 7:Calculator.answers();
                    break;
                case 8:Desktop.getDesktop().open(new File(fileName2));
                    break;
                case 9:Desktop.getDesktop().open(new File(fileName));
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Please choose an option.");
            }
        }
    }
        static int menu(){
            int choice;
            Scanner input = new Scanner(System.in);
            System.out.println("***Main Menu***");
            System.out.println("0. Exit the program");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Tip Calculator");
            System.out.println("6. Grocery Calculator");
            System.out.println("7. Answer History");
            System.out.println("8. Past Commands");
            System.out.println("9. HELP!");
            System.out.println();
            System.out.println("Please Enter a choice: ");
            choice = input.nextInt();
            return choice;

        }


    }

