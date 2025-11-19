import java.util.Scanner;

public class Fibo
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter No. Of Elements You Want: ");
        int n = sc.nextInt();

        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);

        for(int i=1; i<n-1; i++)
        {
            int c=a+b;
            a=b;
            b=c;
            System.out.println(c);
        }

    }    
}
