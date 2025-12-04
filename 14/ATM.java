import java.util.Scanner;

public class ATM 
{
    public static void main(String[] args) 
    {

        int AccNo= 12345;
        int credit, debit;
        int pincode = 9999;
        int balance = 150000;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Account Number: ");
        int checkacc = sc.nextInt();

        System.out.println("Enter Your Pincode: ");
        int checkpin = sc.nextInt();

        if(AccNo == checkacc && pincode == checkpin)
        {   boolean con = true;          
            
            while(con == true){
                System.out.println("Input Your Desired Option:");
                System.out.println("(1) Check Balance");
                System.out.println("(2) Credit");
                System.out.println("(3) Debit");
                System.out.println("(4) Exit");                                
                int choice = sc.nextInt();
            
                switch (choice) 
            {
                case 1:
                    System.out.println("Your Current Account Balance Is "+balance);
                    break;
                case 2:
                    System.out.println("Enter Amount To Credit In Your Account");
                    int cred = sc.nextInt();
                    balance = balance + cred;
                    System.out.println("Your Current Account Balance Is "+balance);
                    break;
                case 3:
                    System.out.println("Enter Amount To Debit From Your Account");
                    int deb = sc.nextInt();
                    if(balance>=deb)
                    {
                        balance = balance - deb;
                        System.out.println("Your Current Account Balance Is "+balance);
                        break;
                    }
                    else
                    {
                        System.out.println("Debit Amout Exceeds Your Bank Balance");
                        break;
                    }
                case 4:
                    System.out.println("Thank You For Visiting");
                    con = false;
                    break;
            
                default:
                    System.out.println("Invalid Option! Please Read Carefully And Try Again");
                    break;
            }

            }
            
            
        }

        else
        {
            System.out.println("Invalid Account No. or Pincode, Try Again");
        }

    }    
}