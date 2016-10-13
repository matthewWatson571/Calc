import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

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
}