package CTSDemo;

import java.util.Scanner;

public class pasword {

	public static void main(String[] args) 
	{boolean count=false;
		Scanner n=new Scanner(System.in);
		System.out.println("enter the password");
		String s=n.nextLine();
		char a[]=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			if(a[i]=='!'||a[i]=='@'||a[i]=='#'||a[i]=='$'||a[i]=='%'||a[i]=='^'||a[i]=='&'||a[i]=='*'||a[i]=='+'||a[i]=='?')
			{count=true;
			}
			
		}
		if(count==false)
		{
			System.out.println("Password is good ");	
			
		}
		else {
			System.out.println("Please don't use special charaecters");
			
		}
		}
		// TODO Auto-generated method stub

	}


