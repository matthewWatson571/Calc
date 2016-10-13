/**
 * Created by Matthew.Watson on 10/10/16.
 */
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class Calculator {
public static ArrayList<Double> answers = new ArrayList<>();

    public void addition() throws IOException {
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
        IO.writeToFile(num1,num2,answer,operator);
    }

    public void subtraction()throws IOException{
        double num1;
        double num2;
        String operator = " - ";
        Scanner numberInput = new Scanner(System.in);
        System.out.println("Enter the number that will be subtracted from");
        num1 = numberInput.nextDouble();
        System.out.println("Enter the number to be subtracted ");
        num2 = numberInput.nextDouble();
        double answer= num1-num2;
        System.out.println(num1 + " + " + num2 + " = " + answer);
        answers.add(answer);
        IO.writeToFile(num1,num2,answer,operator);
    }

    public void multiplication() throws IOException{
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
        IO.writeToFile(num1,num2,answer,operator);
    }

    public void division() throws IOException{
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
        IO.writeToFile(num1,num2,answer,operator);
    }

    public static void answers(){
        System.out.println("List of previous answers :" + answers);
    }
}





