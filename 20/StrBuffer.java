public class StrBuffer 
{

    public static void main(String[] args) 
    {

        StringBuffer sb = new StringBuffer("Hulk SmASH");

        // 1.
        System.out.println("Length: "+sb.length());

        // 2.
        System.out.println("Character at index 3: "+sb.charAt(3));

        // 3.
        sb.append("Now");
        System.out.println("After Append: "+sb);

        // 4.
        sb.insert(3,"Red");
        System.out.println("After Insert: "+sb);

        // 5.
        sb.replace(3,5,"Agent");
        System.out.println("After Replace: "+sb);
        
        // 6.
        sb.delete(5,sb.length());
        System.out.println("After Delete: "+sb);
        
        // 7.
        sb.reverse();
        System.out.println("After Reverse: "+sb);
        
        // 8.
        sb.setCharAt(0,'!');
        System.out.println("After setCharAt: "+sb);
        
                
    }
    
}
