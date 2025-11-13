public class Labeled {
    public static void main(String[] args) {
        System.out.println("==== Unlabeled Break ====");

        for(int i=1;i<4;i++)
        {
            for(int j=0; j<4; j++)
            {
                if (i == 2)
                {break;}
                System.out.println(" i = "+i+" j = "+j);
            }
        }
        
        System.out.println("==== Labeled Break ====");

        for(int i=1;i<4;i++)
        Outer:
        {
            for(int j=0; j<4; j++)
            {
                if (i == 2)
                {break Outer ;}
                System.out.println(" i = "+i+" j = "+j);
            }
        }

    }    
}
