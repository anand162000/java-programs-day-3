package day3;

class Employee
{
	private String name;
	private int salary;
	private String empID;
	
	
	
	public Employee(String name, int salary, String empID) {
		super();
		this.name = name;
		this.salary = salary;
		this.empID = empID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getEmpID() {
		return empID;
	}
	public void setEmpID(String empID) {
		this.empID = empID;
	}
	
	
}


public class MyEncapsulation { 
	public static void main(String args[])
	{
		Employee e1=new Employee("Anand",180000,"18EC111");
		System.out.println(e1.getEmpID());
		System.out.println(e1.getName());
		System.out.println(e1.getSalary());
		}

}