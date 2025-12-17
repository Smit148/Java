
public class Array 
{
    public static void main(String[] args) 
    {
        int[] nums;
        nums = new int[5];

        nums[0]=10;
        nums[1]=20;
        nums[2]=30;
        nums[3]=40;
        nums[4]=50;

        System.out.println("Through Index:");

        System.out.println(nums[2]);

        System.out.println("Through FOR loop:");

        for(int i=0; i < nums.length; i++)
        {
            System.out.println("Element at "+i+" is "+nums[i]);
        }

        System.out.println("Through Enhanced for loop:");

        for(int j : nums)
        {
            System.out.println(j);
        }

        System.out.println("Accesssing array of string:");

        String[] names = { "Aryan", "Babban", "Chetak", "Dholya"};

        for(String name: names)
        {
            System.out.println(name);
        }


    }    
}
