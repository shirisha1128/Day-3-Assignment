class Employee
{
	private int eid;
	private String name;
	private float salary;
	public InputDetails(int id,String ename,float sal)
	{
	 eid=id;
	 name=ename;
	 salary=sal; 
	}
	public ShowDetails()
	{
	 System.out.println("Employee No: "+ edi);
	 System.out.println("Employee Name: "+ name);
	 System.out.println("Employee Salary: "+ salary);
	}
}
class EmployeeDetails
{
	public static void main(String[] args)
	{
	  Employee e=new Employee();
	  e.InputDetails(205,"RAMACHANDRA",25000);
	  e.ShowDetails(); 
	  e.InputDetails(894,"RAGHU",45000);
	  e.ShowDetails();
	}
}