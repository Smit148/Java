class Agents {
    
    static String name;
    int age;
    
    static void Name (String name)
    {
        System.out.println("Name is: "+name);
    }
    
    int Age(int age)
    {
        return age;
    }

}

public class method_type {
    public static void main(String[] args) {
        Agents a = new Agents();

        System.out.println("Static Method 1");

        String naam = Agents.name = "Natasha";       // Static Variable altering
        int x = a.Age(32);                      // Instance Variable altering

        Agents.Name(naam);         //Static Method with Parameter

        System.out.println(a.age=36);
        System.out.println(x);

        stat();           // Static Method called in Static Method

        method_type x1 = new method_type();
        x1.inst();        // Instance Method called in Static Method

    }

    static void stat ()
    {
        System.out.println("Static Method 2");
        // inst();  cannot do without object
    }

    void inst ()
    {
        System.out.println("Instance Method 1");
        inst1();     // Instance Method called in Instance Method
    }

    void inst1 ()
    {
        System.out.println("Instance Method 2");
        stat();      // Static Method called in Instance Method
    }


}
