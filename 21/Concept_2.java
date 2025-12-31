public class Concept_2 {

    public static void main(String[] args) 
    {
        
        try 
        {
            int a = 10 / 2;
            // int a = 10 / 0;

            System.out.println("Value Of a: " + a);

            int[] arr = new int[2];
            arr[1] = 10;
            // arr[3] = 10;
            System.out.println("Value Of Array: " + arr[1]);

            String s = "Avenger";
            // String s = null;
            System.out.println("Length Of String: " + s.length());

        }

        catch (ArithmeticException e) 
        {
            System.out.println("Arthmetic Exception");
        }
        
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Arthmetic Exception");
        }
        
        catch (NullPointerException e) 
        {
            System.out.println("Arthmetic Exception");
        }
    }
}