package CTSDemo;

import java.util.Scanner;

public class average {

	public static void main(String[] args) {
	
		
		int sum=0,avg;
		int[] a=new int[5];
		System.out.println("enter the array elements");
		Scanner s=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			a[i]=s.nextInt();
			sum=a[i]+sum;
		}
		avg=sum/5;
		System.out.println("the avg of these array is"+avg);
		
		
		// TODO Auto-generated method stub

	}

	}
