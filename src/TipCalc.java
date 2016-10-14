import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * Created by Matthew.Watson on 10/12/16.
 */
public class TipCalc {
    public double tip=0;
    public double total=0;
    Scanner s = new Scanner(System.in);
    IO io=new IO();

    public void tipCalc() throws IOException {
        System.out.println("How much was your bill?");
        total = s.nextDouble();
        tipSwitch();
    }

    public double tipSwitch() throws IOException{
        int menuItem;
        System.out.println("How was your meal?");
        System.out.println("0. Return to Main Menu");
        System.out.println("1.--30%-Outstanding--");
        System.out.println("2.--20%-Good--");
        System.out.println("3.--15%-It was Okay--");
        System.out.println("4.--10% Bad--");
        System.out.println("5.--5% Terrible!--");
        System.out.println();
        System.out.println("Please Enter a choice: ");
        menuItem = s.nextInt();
        if (menuItem != 0) {
            switch (menuItem) {
                case 1:
                    tip = 0.30;
                    tipDisplay();
                    break;
                case 2:
                    tip = 0.20;
                    tipDisplay();
                    break;
                case 3:
                    tip = 0.15;
                    tipDisplay();
                    break;
                case 4:
                    tip = 0.10;
                    tipDisplay();
                    break;
                case 5:
                    tip = 0.05;
                    tipDisplay();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Please choose an option.");
            }
        }
                     return tip;
    }

public void tipDisplay() throws IOException{
    double afterTip;
    afterTip = (total * tip) + total;
    BigDecimal convertedTip = new BigDecimal(afterTip - total);
    BigDecimal roundedTip = convertedTip.setScale(2, RoundingMode.DOWN);
    BigDecimal convertedTotal = new BigDecimal(afterTip);
    BigDecimal roundedTotal = convertedTotal.setScale(2, RoundingMode.DOWN);
    io.clear();
    System.out.println("your tip should be $" + (roundedTip));
    System.out.println("Your total including tip is $" + roundedTotal);
    IO.tipCalcOut(roundedTip, roundedTotal);
    }
}