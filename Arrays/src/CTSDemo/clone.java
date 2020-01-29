package CTSDemo;

import java.util.ArrayList;
import java.util.Arrays;

public class clone {
		 
	@SuppressWarnings("unchecked")
	    public static void main(String[] args) 
	    {
	        ArrayList<String> arrayListObject = new ArrayList<>(); 
	         
	        arrayListObject.add("A");
	        arrayListObject.add("B");
	        arrayListObject.add("C");
	        arrayListObject.add("D");
	         
	        System.out.println(arrayListObject);   
	         
	        ArrayList<String> arrayListClone =  (ArrayList<String>) arrayListObject.clone();
	         
	        System.out.println(arrayListClone);   
	    }
	}