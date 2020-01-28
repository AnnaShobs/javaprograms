package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class toArray {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>(2);
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		Object[] array=list.toArray();
		System.out.println(Arrays.toString(array));
		for(Object o:array)
		{
			String s=(String) o;
			System.out.println(s);
		}
		// TODO Auto-generated method stub

	}

}
