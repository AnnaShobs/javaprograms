package arraylist;

import java.util.ArrayList;

public class ensurecapacity {

	public static void main(String[] args) {
		 ArrayList<String> list = new ArrayList<>(2);
         
	        list.add("A");
	        list.add("B");
	         
	        System.out.println(list);
	         
	       // list.ensureCapacity(4);
	         
	        list.add("C");
	        list.add("D");
	        list.add("E");
	 
	        System.out.println(list);
		// TODO Auto-generated method stub

	}

}
