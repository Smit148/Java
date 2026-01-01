import java.io.FileNotFoundException;
import java.io.FileReader;

public class Throws_Concept 
{
    static void readFile() throws FileNotFoundException
    {
        FileReader fr = new FileReader("Exception\fill.txt");
        System.out.println("File Opened Successfully");;
    }

    public static void main(String[] args) 
    {
        try 
        {
            readFile();
        } 
        
        catch (FileNotFoundException e) 
        {
            System.out.println("File not Found: ");
        }
    }
}
