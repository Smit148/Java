import java.util.Scanner;

public class even_odd {

    static void fact(int x)
    {
        int f=1;
        int g=1;
        while(x>=f)
        {
            g*=f;
            f++;            
        }
        System.out.println(g);
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A Number: ");
        int x = sc.nextInt();

        if(x%2==0)
        {
            System.out.println(x+" is a Even Number");
        }

        else
        {
            System.out.println(x+" is not a Even Number");
        }

        System.out.println("Enter a Number for factorial ");
        int y= sc.nextInt();
        fact(y);

    }
    
}
