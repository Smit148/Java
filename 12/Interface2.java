interface A 
{
    int x= 60;
    void i1();
}

interface B extends A
{
    int x = 70;
    void i2();
}

class N implements B
{
    public void i1()
    {
        System.out.println("Method 1");
        System.out.println("value of x from interface 1 "+A.x);
        System.out.println("value of x from interface 2 "+B.x);
    }

    public void i2()
    {
        System.out.println("Method 2");
    }
}

public class Interface2 
{
    public static void main(String[] args) 
    {
        N obj = new N();
        obj.i1();
        obj.i2();        
    }    
}
