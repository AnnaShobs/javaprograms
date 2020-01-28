package arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class listiterator {

	public static void main(String[] args) {
		ArrayList<String> alphabets=new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
		ListIterator<String> listItr=alphabets.listIterator();
		System.out.println(listItr.next());
		System.out.println(listItr.next());
		listItr.add("E");
		
		System.out.println(alphabets);
		System.out.println(listItr.previous()); 
        System.out.println(listItr.next());     
         
        System.out.println(listItr.next());     
         
        listItr.remove();       
         
        System.out.println(alphabets);
         
        System.out.println(listItr.next());  
	
	}

}
