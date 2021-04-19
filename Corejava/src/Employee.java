
public class Employee {
	
	int empId;
	String empName;
	float empSalary;
	
	public Employee() {
		
		empId=87778;
		empName="A kumar";
		empSalary=787887;
		System.out.println("Constructor Called");
		
	}
	// the below function is auto generated in eclipse
	// source -> generate construcot using fields - > generate
	public Employee(int empId, String empName, float empSalary) {
		System.out.println("Overloaded Constructor Called");
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	void empInfo() {

		System.out.println("\n Employee Information");
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(empSalary);
	}
	
	public static void main(String[] args) {
		Employee employee1=new Employee();
		Employee employee2=new Employee(90200,"v kumar",121000);
		Employee employee3=new Employee(90310,"v kumar",224100);
		
		Employee employee4=employee1;
		
		employee4.empId=1;
		employee4.empName="sample";
		employee4.empSalary=123;
		
		
		
		employee1.empInfo();
		employee2.empInfo();
		employee3.empInfo();
		
	}
	
}
