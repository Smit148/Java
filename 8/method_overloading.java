class Operations
{
    static void op(int p)
    {
        System.out.println(p*p);
    }

    static void op(int p, int q)
    {
        System.out.println(p/q);
    }

    static void op(int p, int q, int r)
    {
        System.out.println(p*q*r);
    }

    static void op(int p, int q, int r,int s)
    {
        System.out.println(p+q+r+s);
    }
}

public class method_overloading 
{
    public static void main(String[] args) 
    {
        Operations.op(4);
        Operations.op(8,4);
        Operations.op(4,6,7);
        Operations.op(4,6,7,5);
    }
}
