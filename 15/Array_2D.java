
public class Array_2D 
{
    public static void main(String[] args) 
    {
        int[][] neo = new int[3][3];
        
        neo[0][0] = 10;
        neo[0][1] = 20;
        neo[0][2] = 30;
        
        neo[1][0] = 40;
        neo[1][1] = 50;
        neo[1][2] = 60;
        
        neo[2][0] = 70;
        neo[2][2] = 80;
        neo[2][2] = 90;

        System.out.println("Length Of Row "+neo.length);
        System.out.println("Length Of Column "+neo[0].length);

        System.out.println("Accessing 2D Array Through Index: ");
        System.out.println("Element of index [1][2] "+neo[1][2]);

        for(int i=0;i<neo.length;i++)
        {for(int j=0;j<neo[i].length;j++)
        {
            System.out.println("Elemnet of Index ["+i+"]["+j+"] is " +neo[i][j] );
        }
        }


    }
}
