package First;

public class EmployeeCons {
	int employeeId;
	int salary;
	String dept;
	
	EmployeeCons(int empid, int sal, String d){
		employeeId = empid;
		salary = sal;
		dept = d;
	}
	
	public static void main(String[] args) {
		EmployeeCons harsha = new EmployeeCons(101,1000,"Testing");
		EmployeeCons varsha = new EmployeeCons(102,5000,"developing");
		System.out.println(harsha.employeeId+ " Salary "+ harsha.salary+" Dept "+harsha.dept);
		System.out.println(varsha.employeeId+ " Salary "+ varsha.salary+" Dept "+varsha.dept);
		
	}
}
