import java.util.Scanner;

public class prob2 
{
    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Character: ");
        char l = sc.next().charAt(0);

        if( Character.isAlphabetic(l))
        {
            if( Character.isUpperCase(l))
            {
                System.out.println(l+" is in UpperCase ");
            }
            else if( Character.isLowerCase(l))
            {
                System.out.println(l+" is in LowerCase ");
            }
        }

        else
        {
            System.out.println(l+" is not a Character");
        }

    }    
}
