package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class sublist {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));
		ArrayList<Integer> sublist=new ArrayList<Integer>(list.subList(2,6));
		System.out.println(sublist);
		// TODO Auto-generated method stub

	}

}
