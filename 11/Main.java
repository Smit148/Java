
public class Main
{
    public static void main(String[] args) 
    {
        Rectangle r = new Rectangle(5,4);
        Rectangle r1 = new Rectangle(5,7);

        System.out.println("Area Of Rectanle Is: "+r.area());
        System.out.println("Perimeter Of Rectanle Is: "+r.perimeter());
        
        System.out.println("Area Of Rectanle Is: "+r1.area());
        System.out.println("Perimeter Of Rectanle Is: "+r1.perimeter());
        
        Circle c = new Circle(5);

        System.out.println("Area Of Circle Is: "+c.area());
        System.out.println("Perimeter Of Circle Is: "+c.perimeter());
    }
}
