package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class foreach {public static void main(String[] args) throws CloneNotSupportedException 
{
    ArrayList<String> names = new ArrayList<>(Arrays.asList("A","B","C","D")); 
     
   names.forEach(name -> printString(name));
}
 
private static void printString(String str) {
    System.out.println(str.toLowerCase());
}

	

}
