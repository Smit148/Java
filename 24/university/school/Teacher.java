package university.school;

public class Teacher 
{
    public static void main(String[] args) 
    {
        Student s = new Student();

        System.out.println(s.rollNo);    // public
        System.out.println(s.name);      // protected
        System.out.println(s.marks);     // default
        // System.out.println(s.age);    // private

        System.out.println("================= Show Details Method is Called =================");
        s.showDetails();
    }
}