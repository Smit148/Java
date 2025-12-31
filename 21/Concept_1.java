public class Concept_1
{

    public static void main(String[] args) 
    {
        try
        {
            System.out.println("Before Division");
            // int a = 10/2;
            int a = 10/0;
            System.out.println("After Division");

        }

        catch (ArithmeticException e)
        {
            System.out.println("Cannot divide by zero");
        }

        System.out.println("Program Continues");   
    }

}