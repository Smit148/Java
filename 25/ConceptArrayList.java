import java.util.ArrayList;
import java.util.List;

public class ConceptArrayList
{
    public static void main(String[] args)
    {
        // Create a list in Avengers
        List<String> avengers = new ArrayList<>();

        // 1. add(element) -Adding element
        avengers.add("Iron Man");
        avengers.add("Captain America");
        avengers.add("Thor");
        avengers.add("Hulk");
        avengers.add("Black Widow");

        System.out.println("Element at index 2");

        // 2. get(index) - Getting element at index 2
        System.out.println("Element at index 2: "+ avengers.get(2));

        // 3. set(index,element) - Replacing element at index 3
        avengers.set(3, "Hawkeye");
        System.out.println("After set: "+ avengers);

        // 4. remove(index) - Removing element at index 1
        avengers.remove(1);
        System.out.println("After remove: "+avengers);

        // 5. size() - Getting no. of elements
        System.out.println("After Clear: "+avengers);

        // 6. contains(elements) - Checking if "Iron man" exists
        System.out.println("Contains Iron man?"+ avengers.contains("Iron Man"));

        //7. clear()-clearing the entire list
        //avengers.clear();
        System.out.println("After clear:"+ avengers);

        //1. Using a traditional for loop
        System.out.println("\nAccess using traditional for loop:");
        for (int i=0;i<avengers.size();i++){
            System.out.println("Avengers at index"+i+":"+avengers.get(i));
        }
        // 2. Using an enhanced for - each loop
        System.out.println("\nAccess using for-each loop");
        for(String avenger:avengers){
            System.out.println(avenger);
        }
    }
}