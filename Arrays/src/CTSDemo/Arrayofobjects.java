package CTSDemo;

public class Arrayofobjects {
	public static void main(String[] args)
	{
		Employee[] EmployeeArray;
		EmployeeArray=new Employee[5];
		EmployeeArray[0]= new Employee(1,"Prameela");
		EmployeeArray[1]= new Employee(2,"Yamini");
		EmployeeArray[2]= new Employee(3,"Navya");
		EmployeeArray[3]= new Employee(4,"Urmila");
		EmployeeArray[4]= new Employee(5,"Vyshnavi");
		
		for (int i=0;i<EmployeeArray.length;i++)
			System.out.println("Element at" +i+":"+EmployeeArray[i].id+" "+EmployeeArray[i].name);
	}
}
class Employee{
	int id;
	String name;
	Employee(int a,String n)
	{
	this.name=n;
	this.id=a;
}

}

