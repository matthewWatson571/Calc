import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;

/**
 * Created by Matthew.Watson on 10/12/16.
 */
public class IO {

    public static void writeToFile(double num1, double num2, double answer, String operator) throws IOException {
        String fileName="numbers.txt";
        PrintWriter outFile= new PrintWriter(new FileWriter(fileName,true));
        outFile.println(num1 + operator + num2+ " = " + answer);
        outFile.close();
    }

    public static void groceryOut(BigDecimal roundedTotal) throws IOException {
        String fileName="numbers.txt";
        PrintWriter outFile= new PrintWriter(new FileWriter(fileName,true));
        outFile.println("Grocery total: " + roundedTotal);
        outFile.close();
    }

    public static void tipCalcOut(BigDecimal roundedTotal, BigDecimal roundedTip) throws IOException {
        String fileName="numbers.txt";
        PrintWriter outFile= new PrintWriter(new FileWriter(fileName,true));
        outFile.println("Total: " + roundedTotal + " Tip: " + roundedTip);
        outFile.close();
    }

    public void clear(){
        for (int i = 0; i < 50; ++i)
            System.out.println("\n"); //If Terminal can do it, then I can do it.
    }
}