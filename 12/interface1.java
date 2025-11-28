interface A
{
    // public static final int value = 100; or
    int value = 100;  // variable in a interface is called constaint
}

class N implements A
{
    void show()
    {
        System.out.println("Value: "+value);
    }
}

public class interface1
{
    public static void main(String[] args) 
    {
        N ob = new N();
        ob.show();        
    }
}
