package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class get1 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>(Arrays.asList("alex", "brian", "charles", "dough"));
        String firstName = list.get(2);         //alex
        String secondName = list.get(3);        //brian
        System.out.println(firstName);
        System.out.println(secondName);
		// TODO Auto-generated method stub

	}

}
