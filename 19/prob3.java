import java.util.Scanner;

public class prob3 
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your String: ");
        String s = sc.nextLine();

        int ch=0;
        int sp=0;
        int no=0;

        for (int i=0; i<s.length(); i++)
        {
            char x = s.charAt(i);
            
            if( Character.isAlphabetic(x))
            { ch++; }

            else if( Character.isDigit(x))
            { no++; }
            
            else
            { sp++; }

        }

        System.out.println("Your String contains \""+ch+"\" Alphabet \""+no+"\" Digit \""+sp+"\" Special Character");

    }    
}
