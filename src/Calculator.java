/**
 * Created by Matthew.Watson on 10/10/16.
 */
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
public static ArrayList<Double> answers = new ArrayList<>();

    public static void writeToFile(double num1, double num2, double answer, String operator) throws IOException{
        String fileName="numbers.txt";
        PrintWriter outFile= new PrintWriter(new FileWriter(fileName,true));
        outFile.println(num1 + operator + num2+ " = " + answer);
        outFile.close();
    }

    public static void addition() throws IOException {
        double num1;
        double num2;
        String operator=" + ";
        Scanner numberInput = new Scanner(System.in);
        System.out.println("Enter your first number to be added ");
        num1 = numberInput.nextDouble();
        System.out.println("Enter your second number to be added ");
        num2 = numberInput.nextDouble();
        double answer= num1+num2;
        System.out.println(num1 + " + " + num2 + " = " + answer);
        answers.add(answer);
        Calculator.writeToFile(num1,num2,answer,operator);

    }

    public static void subtraction()throws IOException{
        double num1;
        double num2;
        String operator = " - ";
        Scanner numberInput = new Scanner(System.in);
        System.out.println("Enter your first number that will be subtracted from");
        num1 = numberInput.nextDouble();
        System.out.println("Enter your second number to be subtracted ");
        num2 = numberInput.nextDouble();
        double answer= num1-num2;
        System.out.println(num1 + " + " + num2 + " = " + answer);
        answers.add(answer);
        Calculator.writeToFile(num1,num2,answer,operator);

    }

    public static void multiplication() throws IOException{
        double num1;
        double num2;
        String operator = " * ";
        Scanner numberInput = new Scanner(System.in);
        System.out.println("Enter your first number to be multiplied ");
        num1 = numberInput.nextDouble();
        System.out.println("Enter your second number to be multiplied ");
        num2 = numberInput.nextDouble();
        double answer= num1*num2;
        System.out.println(num1 + " + " + num2 + " = " + answer);
        answers.add(answer);
        Calculator.writeToFile(num1,num2,answer,operator);


    }

    public static void division() throws IOException{
        double num1;
        double num2;
        String operator = " / ";
        Scanner numberInput = new Scanner(System.in);
        System.out.println("Enter your first number to be divided ");
        num1 = numberInput.nextDouble();
        System.out.println("Enter your second number to be divided ");
        num2 = numberInput.nextDouble();
        double answer= num1/num2;
        System.out.println(num1 + " + " + num2 + " = " + answer);
        answers.add(answer);
        Calculator.writeToFile(num1,num2,answer,operator);

    }

    public static void tipCalc()throws IOException{
        double total;
        double tip;
        double tipAmount;
        double afterTip;
        Scanner numberInput = new Scanner(System.in);
        System.out.println("How much was your bill?");
        total = numberInput.nextDouble();
        System.out.println("How much would you like to tip?");
        System.out.println("Please enter your amount as a percentage:");
        tip = numberInput.nextDouble();
        tipAmount=tip/100;
        afterTip= (total*tipAmount)+total;
        System.out.println("your tip should be $" + (afterTip-total));
        System.out.println("Your total including tip is $" + afterTip);

    }

    public static void groceries() {
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
            System.out.println("Your total after tax is $" + afterTax);
        }
    }

    public static void answers(){
        System.out.println("List of previous answers :" + answers);
    }



}





