package Joy;

// fc goa
public class Employee {

	int employeeId;
	String employeeName;
	
	void setEmployeeDetails(int id,String name)
	{
		
		employeeId=id;
		employeeName=name;
	}
	int getEmployeeId()
	{
		return employeeId;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1=new Employee();
		e1.setEmployeeDetails(23, "John");
		
		System.out.println(e1.getEmployeeId());
		System.out.println(e1.getEmployeeName());
		
		

	}

}
