package day29;

public class multiplecatchblock2 {

	public static void main(String[] args) {
		try
		{
			int a[]=new int[5];
			a[5]=30/0;
		}
		 catch(ArrayIndexOutOfBoundsException e)  
        {  
         System.out.println("ArrayIndexOutOfBounds Exception occurs");  
        }    
     catch(Exception e)  
        {  
         System.out.println("Parent Exception occurs");  
        }             
     System.out.println("rest of the code");    
		// TODO Auto-generated method stub

	}

}
