import java.util.Scanner;

public class prob1
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter Your Character: ");
        char l = sc.next().charAt(0);


        if( Character.isAlphabetic(l))
        {
            if( l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'u' )
            {
                System.out.println(l+" is a LowerCase vowel");
            }
            else if( l == 'A' || l == 'E' || l == 'I' || l == 'O' || l == 'U' )
            {
                System.out.println(l+" is a UpperCase vowel");
            }
            else
            {
                System.out.println(l+" is a Consonent ");
            }
        }

        else
        {
            System.out.println("Entered Data is not a Character");
        }


    }    
}
