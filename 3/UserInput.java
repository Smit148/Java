import java.util.Scanner;

class UserInput {
    public static void main(String[] args)
    {
        Scanner a = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String fullName = a.nextLine();

        // System.out.print("Enter Your Nickname: ");
        // String NName = a.next();

        System.out.print("Enter Your Age: ");
        int  age = a.nextInt();

        System.out.print("Enter Your Phone No.: ");
        long Phone = a.nextLong();

        System.out.print("Enter Your Height: ");
        float  Height = a.nextFloat();

        System.out.print("Enter Your GPA: ");
        double  gpa = a.nextDouble();    

    }
}
