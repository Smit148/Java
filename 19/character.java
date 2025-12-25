public class character 
{
    public static void main(String[] args) 
    {
        
        char ch1= 'A';
        char ch2= 'a';
        char ch3= '5';
        char ch4= ' ';
        char ch5= '@';

        // 1.
        System.out.println("isLetter('A'): "+Character.isLetter(ch1));
        
        // 2.
        System.out.println("isDigit('5'): "+Character.isDigit(ch3));
        
        // 3.
        System.out.println("isLetterOrDigit('@'): "+Character.isLetter(ch5));
        
        // 4.
        System.out.println("isUpperCase('A'): "+Character.isLetter(ch1));
        
        // 5.
        System.out.println("isLowerCase('a'): "+Character.isLetter(ch2));
        
        // 6.
        System.out.println("toUpperCase('a'): "+Character.isLetter(ch2));
        
        // 7.
        System.out.println("toLowerCase('A'): "+Character.isLetter(ch1));
        
        // 8.
        System.out.println("isWhitespace(' '): "+Character.isWhitespace(ch4));
        
        // 9.
        System.out.println("isSpaceChar(' '): "+Character.isSpaceChar(ch4));
        
        // 10.
        System.out.println("getNumericValue('5'): "+Character.getNumericValue(ch3));
        
        // 11.
        System.out.println("compare('A','a'): "+Character.compare(ch1, ch2));

        // 12.
        Character obj = Character.valueOf(ch1);
        System.out.println("Character object: "+ obj);

        // 13.
        // char primitive

    }
}