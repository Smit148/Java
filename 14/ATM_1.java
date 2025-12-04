import java.util.Scanner;

class operation 
{
    Scanner sc = new Scanner(System.in);

    public void balance(int b)
    {
        System.out.println("Your Current Balance Is "+b);
    }
    
    public void credit(int b)
    {
        System.out.println("Enter Amount To Credit: ");
        int c = sc.nextInt();
        b = b+c;
        balance(b);
    }
    
    public void debit(int b)
    {
        System.out.println("Enter Amout To Debit");
        int d = sc.nextInt();

        if(b>=d)
        {
            b = b-d;
            balance(b);
        }
        
        else
        {
            System.out.println("Amount Entered Exceeds Your Bank Balance");
        }

    }

}

public class ATM_1 
{
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) 
    {

        int Acc = 12345;        
        int Code = 9999;
        int credit, debit;
        int balance = 150000;
        
        System.out.println("Enter Your Account Number: ");
        int acc = s.nextInt();
        
        System.out.println("Enter Your PinCode: ");
        int pin = s.nextInt();

        if (Acc == acc && Code == pin)
        {
            System.out.println("Enter Your desired Option: ");
            System.out.println("(1)");
            System.out.println("(2)");
            System.out.println("(3)");
            System.out.println("(4)");
            
            int choice = s.nextInt();

            

        }

        else
        {
            System.out.println("Account Number or Pincode Entered is Invalid");
        }
        
    }    
}
