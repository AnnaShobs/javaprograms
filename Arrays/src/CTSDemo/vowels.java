package CTSDemo;

public class vowels {

	public static void main(String[] args) {
		int  count=0;
		String s="annashobi";
		char a[]=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u')
			{
				count++;
			}
				
		}
		System.out.println("the number of vowels is :"+count);
		// TODO Auto-generated method stub

	}

}
