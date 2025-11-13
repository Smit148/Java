import java.util.Scanner;

public class array 
{
    public static void main(String[] args) {
        
        Scanner n = new Scanner(System.in);

        System.out.println("Enter No. Of Elements");
        int no = n.nextInt(); 

        int[] num = new int[no];

        for(int i=0; i<no ; i++)
        {
            System.out.println("Enter Element Number "+(i+1));
            num[i] = n.nextInt();
        }

        
        for(int j=0; j<no ; j++)
        {
            System.out.print(num[j]+" ");
        }

    }
}