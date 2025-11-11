
class Calculate
{
    
    Calculate(int n)
    {
        System.out.println("Origninal Number: "+n);
    }
    
    Calculate(int n, int n1)
    {
        System.out.println("Product of Number is: "+n*n1);
    }
    
    Calculate(int n, int n1, int n2)
    {
        System.out.println("Area of Cubiod: "+n*n1*n2);
    }

}

public class Constructor 
{
    public static void main(String[] args) {
        Calculate a = new Calculate(5);
        Calculate a1 = new Calculate(5,6);
        Calculate a2 = new Calculate(5,6,7);
    }
}
