import java.util.Scanner;

public class Center {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 
        
        System.out.println("Enter No. Of Rows: ");
        int rows = sc.nextInt();
        
        System.out.println("Enter No. Of Column: ");
        int col = sc.nextInt();

        int[][] matrix = new int[rows][col];

        System.out.println("Enter Element for Element No.: ");

        for(int i= 0; i<rows; i++)
        {
            for(int j=0; j<col; j++)
            {
                System.out.println(i+" x "+j);
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i= 0; i<rows; i++)
        {
            for(int j=0; j<col; j++)
            {
                System.out.print(matrix[i][j]);
            }
        }

    }
}
