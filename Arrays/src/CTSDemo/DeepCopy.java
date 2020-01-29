package CTSDemo;
import java.util.Date;
public class DeepCopy {
	
	 public class Employee implements Cloneable {
	 
	    private Long id;
	    private String name;
	    private Date dob;       //Mutable field
	 
	    public Employee(Long id, String name, Date dob) {
	        super();
	        this.id = id;
	        this.name = name;
	        this.dob = dob;
	    }
	 
	    //Getters and setters
	 
	    @Override
	    protected Object clone() throws CloneNotSupportedException {
	        Employee clone = null;
	        try
	        {
	            clone = (Employee) super.clone();
	 
	            //Copy new date object to cloned method
	            clone.setDob((Date) this.getDob().clone());
	        } 
	        catch (CloneNotSupportedException e) 
	        {
	            throw new RuntimeException(e);
	        }
	        return clone;
	    }
	 
	    @Override
	    public String toString() {
	        return "Employee [id=" + id + ", name=" + name + ", dob=" + dob + "]";
	    }
	}

}
