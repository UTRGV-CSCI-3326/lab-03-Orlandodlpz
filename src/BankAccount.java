import java.text.DecimalFormat;
public class BankAccount {

    public static void main (String [] alo) {
        double bobAccount = 2175.37;
        double bobWD = 302.50;
        double bobDP = 50.03;
        bobAccount -= bobWD;
        bobAccount += bobDP;
        bobAccount /= 2;
        bobDP = 20.00;
        bobAccount += bobDP;
        bobWD = 1;
        bobAccount -= bobWD;
        bobAccount *= 2;
        bobDP = 1;
        bobAccount += bobDP;
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Bob's new balance is: " + df.format(bobAccount));        
    }
}