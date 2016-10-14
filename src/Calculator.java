/**
 * Created by Matthew.Watson on 10/10/16.
 */
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class Calculator {
public static ArrayList<Double> answers = new ArrayList<>();
    Scanner s = new Scanner(System.in);
    IO io=new IO();

    public void addition() throws IOException {
        double num1;
        double num2;
        String operator=" + ";
        System.out.println("Enter your first number to be added ");
        num1 = s.nextDouble();
        System.out.println("Enter your second number to be added ");
        num2 = s.nextDouble();
        double answer= num1+num2;
        io.clear();
        System.out.println(num1 + " + " + num2 + " = " + answer);
        answers.add(answer);
        IO.writeToFile(num1,num2,answer,operator);
    }

    public void subtraction()throws IOException{
        double num1;
        double num2;
        String operator = " - ";
        System.out.println("Enter the number that will be subtracted from");
        num1 = s.nextDouble();
        System.out.println("Enter the number to be subtracted ");
        num2 = s.nextDouble();
        double answer= num1-num2;
        io.clear();
        System.out.println(num1 + " + " + num2 + " = " + answer);
        answers.add(answer);
        IO.writeToFile(num1,num2,answer,operator);
    }

    public void multiplication() throws IOException{
        double num1;
        double num2;
        String operator = " * ";
        System.out.println("Enter your first number to be multiplied ");
        num1 = s.nextDouble();
        System.out.println("Enter your second number to be multiplied ");
        num2 = s.nextDouble();
        double answer= num1*num2;
        io.clear();
        System.out.println(num1 + " + " + num2 + " = " + answer);
        answers.add(answer);
        IO.writeToFile(num1,num2,answer,operator);
    }

    public void division() throws IOException{
        double num1;
        double num2;
        String operator = " / ";
        System.out.println("Enter your first number to be divided ");
        num1 = s.nextDouble();
        System.out.println("Enter your second number to be divided ");
        num2 = s.nextDouble();
        double answer= num1/num2;
        io.clear();
        System.out.println(num1 + " + " + num2 + " = " + answer);
        answers.add(answer);
        IO.writeToFile(num1,num2,answer,operator);
    }

    public void answers(){
        io.clear();
        int i;
        for(i=0; i<answers.size(); ++i)
        System.out.println((i+1) + ".)" + answers.get(i));
    }
}





