package arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class retainAll {

	public static void main(String[] args)throws CloneNotSupportedException {
		ArrayList<String> alphabets=new ArrayList< >(Arrays.asList("A", "B", "A", "D", "A"));
		System.out.println(alphabets);
		alphabets.retainAll(Collections.singleton("A"));
		System.out.println(alphabets);
	}

}
