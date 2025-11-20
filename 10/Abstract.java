abstract class c1 
{
 void m1()
 {
    System.out.println("normal/concrete method works normally ");
 }   

 abstract void m2();      //you can only define a abstract menthod like this and use it in child class like c2 and c3 

}

abstract class c2 extends c1
{
    void m1()
    {
        System.out.println("Here i am not using m2 i.e. abstract method isliye i have to make this class a abstract class");
        System.out.println("but can freely use m1 bcs it is concrete method");
    }
}

class c3 extends c2
{
    void m2()
    {
        System.out.println("Here i am using it bcs this is a child class else this must also be like c2 i.e. convert into abstract");
    }
}

class c4 extends c3
{
    void m2()
    {
        System.out.println("Any normal child class of abstract praent must use the abstract method to stay normal class");
    }
}

public class Abstract 
{
    public static void main(String[] args) 
    {
        // c2 o = new c2; //can't create it becuse you cannot make object for a abstract class therefore next line;
        c3 o3 = new c3();
        o3.m2();
        c4 o4 = new c4();
        o4.m2();

    }   
}
