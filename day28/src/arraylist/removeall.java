package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Collections;

public class removeall {

	public static void main(String[] args) {
		ArrayList<String> alphabets = new ArrayList<>(Arrays.asList("A", "B", "A", "D", "A"));
        
        System.out.println(alphabets);
         
        alphabets.removeAll(Collections.singleton("A"));
         
        System.out.println(alphabets);
				// TODO Auto-generated method stub

	}

}
