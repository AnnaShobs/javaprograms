package arraylist;

import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {
		ArrayList<String> List1 =new ArrayList<>();
		List1.add("Anna");
		List1.add("Sharon");
		List1.add("Angelica");
		List1.add("satya");
		List1.add("navya");
		ArrayList<String> List2 =new ArrayList<>();
		List2.add("sreekanth");
		List1.addAll(List2);
System.out.println(List1);
	}

}
