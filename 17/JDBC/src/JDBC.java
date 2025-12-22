import java.sql.*;
import java.util.Scanner;

public class JDBC 
{    
    static Connection con;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws SQLException
    {
        String url = "jdbc:mysql://localhost:3307/shield";
        String user = "root";
        String pass = "root";

        
        con = DriverManager.getConnection(url,user,pass);
        System.out.println("connection ZALAAAAAAAAAAA!");

        while (true) 
        {
            
            System.out.println("Welcome to Avengers Database");
            System.out.println("1. View Avenger");
            System.out.println("2. Add Avenger");
            System.out.println("3. Update Avenger");
            System.out.println("4. Delete Avenger");
            System.out.println("5. Exit");

            System.out.println("Enter Your Choice");
            int choice = sc.nextInt();

            switch(choice)
            {
                case 1: viewAvenger();
                    break;

                case 2: addAvenger();
                    break;
                
                default: System.out.println("Select Correct Option");
                    break;
            }
        }
    }

    static public void viewAvenger() throws SQLException
    {
        
        Statement smt = con.createStatement();
        ResultSet rs = smt.executeQuery("select * from avengers");
        
        while(rs.next())
        {
            int id = rs.getInt("ar_id");
            String f_name = rs.getString("f_name");
            String l_name = rs.getString("l_name");
            String heroic_name = rs.getString("heroic_name");
            String city = rs.getString("city");

            System.out.println(id+" | "+f_name+" | "+l_name+" | "+heroic_name+" | "+city);
        }
    }

    static public void addAvenger() throws SQLException
    {
        PreparedStatement pst = con.prepareStatement("insert into avengers(f_name,l_name,heroic_name,city) values(?,?,?,?)");
        
        sc.nextLine();
        System.out.println("Enter First Name:");
        String f_name = sc.nextLine();
        
        System.out.println("Enter Last Name:");
        String l_name = sc.nextLine();
        
        System.out.println("Enter Heroic Name:");
        String heroic_name = sc.nextLine();
        
        System.out.println("Enter City Name:");
        String city = sc.nextLine();
        
        pst.setString(1, f_name);
        pst.setString(2, l_name);
        pst.setString(3, heroic_name);
        pst.setString(4, city);

        pst.executeUpdate();
    }

    static public void deleteAvenger() throws SQLException
    {
        PreparedStatement pst = con.prepareStatement("delete from avengers where ar_id=?");
        System.out.println("Enter ar_id to delete it's data: ");
    }
}
