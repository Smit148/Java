import java.sql.*;
import java.util.Scanner;

public class App {

    static Connection con;
    static Scanner sc = new Scanner(System.in);

    public static void view(int a) throws SQLException
    {
        Statement smt = con.createStatement();
        ResultSet rs = smt.executeQuery("SELECT * FROM avengers where acc=?");

        String Con = "SELECT * FROM avengers where acc=?";
        PreparedStatement pst = con.prepareStatement(Con);

        
        // int acc = rs.getInt("acc");
        String name = rs.getString("name");
        // int pin = rs.getInt("password");
        int amt = rs.getInt("balance");
        
        System.out.println("Welcome "+name+" Your Account's Current is "+amt);
        
        pst.setInt(1, a);
    }

    public static void main(String[] args) throws Exception 
    {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3307/shield","root","root");
        System.out.println("connected");

        System.out.println("Enter Your Account Number: ");
        int acc = sc.nextInt();
        
        // System.out.println("Enter Your Pincode: ");
        // int pin = sc.nextInt();

        while(true)
        {
            System.out.println("1. View Balance");
            System.out.println("2. Deposite Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Change Pincode");
            System.out.println("5. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    view(acc);
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
            
                default:
                    break;
            }
        }

    }
}
