import java.util.Scanner;

public class Practice
{
    
    static void prime(int x)
    {
        if (x<2)
        {
            System.out.println("Invalide Number");
        }

        else if(x==2)
        {
            System.out.println(x+" is a prime number");
        }

        else
        {
            boolean d = true;
            for (int i=2; i<x; i++)
            {
                if (x%i==0)
                {
                    d=false;
                }
            }
            
            if(d==true)
            {
                System.out.println(x+" is a prime number");
            }
            
            else
            {
                System.out.println(x+" is not a prime number");
            }
        }

    }

    static void leap(int x)
    {
        if( x%100!=0 && x%4==0)
        {
            System.out.println(x+" is a leap year");
        }
        
        else if( x%400==0)
        {
            System.out.println(x+" is a leap year");
        }
        
        else
        {
            System.out.println(x+" is not a leap year");
        }
    }

    static void armstrong(int x)
    {
        int n=x;
        int d=x;
        int no=0;
        int dig=0;
        while(n>0)
        {
            n=n/10;
            no++;
        }
        while(d>0)
        {
            dig+=Math.pow((d%10),no);
            d=d/10;
        }

        if (dig==x)
        {
            System.out.println(x+" is a Armstrong Number");
        }

        else
        {
            System.out.println(x+" is not a Armstrong Number");
        }
    }

    public static void main(String[] args) 
    {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number to check if it is prime: ");
        int n = sc.nextInt();
        prime(n);

        System.out.println("Enter number to check if it is a leap year: ");
        int y = sc.nextInt();
        leap(y);

        System.out.println("Enter number to check if it is Armstrong: ");
        int no = sc.nextInt();
        armstrong(no);
        

    }
    
}