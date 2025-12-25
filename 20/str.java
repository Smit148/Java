class Str
{

    public static void main(String[] args) 
    {

        String str = new String("Hulk SmASH");

        // 1.
        System.out.println("Length: "+str.length());

        // 2.
        System.out.println("Character at index 3: "+str.charAt(3));

        // 3.
        System.out.println("Convert To Uppercase: "+str.toUpperCase());

        // 4.  
        System.out.println("Convert To Lowercase: "+str.toLowerCase());

        // 5.
        System.out.println("Substring from index 8: "+str.substring(8));

        // 6.
        System.out.println("Substring (0,7): "+str.substring(0,7));

        // 7.
        System.out.println("Equals 'Hulk SmASH': "+str.equals("hulk smash"));

        // 8.
        System.out.println("EqualsIgnoreCase 'Hulk SmASH': "+str.equalsIgnoreCase("hulk smash"));

        // 9.
        System.out.println("Contains 'Hulk': "+str.contains("ulk"));

        // 10.
        System.out.println("Replace 'SmASH' with 'SMASH': "+str.replace("SmASH","SMASH"));

        // 11.
        System.out.println("Index of 'A': "+str.indexOf("A"));

        // 12.
        String emty = "";
        System.out.println("Is emty string Empty?: "+emty.isEmpty());

        // 13.
        String messy = "     SMMMMAAAAAAAAAAAAASSSSSSSSSHHHHHHHHHHHH     ";
        System.out.println("Trimmed: '"+messy.trim()+"'");

        // 14.
        System.out.println("Starts with 'Hulk': "+str.startsWith("Hu"));

        // 15.
        System.out.println("Ends with 'SmASH': "+str.endsWith("SH!"));
        
    }
    
}
