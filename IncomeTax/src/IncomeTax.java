
import java.util.Scanner;

public class IncomeTax {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int annualSalary = 0;
        double taxRate = 0.0;
        int taxToPay = 0;

        System.out.println("Enter annual salary: ");
        annualSalary = scnr.nextInt();

        // Determine the tax rate from the annual salary
        // FIXME: Write code to address the challenge question above
        if (annualSalary > 50000 && annualSalary <= 100000) {
            taxRate = 0.30;
        } else if (annualSalary >0 && annualSalary  <= 100000) {
            taxRate = 0.40;
        } 
        else if (annualSalary <= 0){
            System.out.println("Don't enter negative number DUMBASS!!");
        }
        else {
            taxRate = 0.30;
        }

        taxToPay = (int) (annualSalary * taxRate);     // Truncate tax to an integer amount
        System.out.println("Annual Salary: " + annualSalary);
        System.out.println("Tax rate: " + taxRate);
        System.out.println("Tax to pay: " + taxToPay);

        return;
    }
}
