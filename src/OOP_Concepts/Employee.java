package OOP_Concepts;

public class Employee extends Person implements PersonInterface{
	
	int emp_id;
	String role, hiredate;
	int hwag;
	
	
	Employee(int eid, String name, String lname, int age, char gender, String rol, String hdate, int hw) {
		super(name, lname, age, gender);

		this.emp_id = eid;
		this.role = rol;
		this.hiredate=hdate;
		this.hwag = hw;
	}
	
	public void display() {
		System.out.println();
		System.out.println("****************Employee Information**************");
		System.out.println("Employee Id: " + this.emp_id);
		System.out.println("Name: " + this.name);
		System.out.println("Last name: " + this.lname);
		System.out.println("Age: " + this.age);
		System.out.println("Gender: " + this.gender);
		System.out.println("Job Tittle: " + this.role);
		System.out.println("Hire Date: " + this.hiredate);
		System.out.println("Week Salary: " + this.calculate(40)+"$");
		System.out.println("Annual Net Salary: " + this.netSal(100)+"$");
		System.out.println();
		System.out.println();
		
	}
	
	public double calculate(int hours) {
		double weekSalary = this.hwag*hours;
		return weekSalary;
	}
	
	public double netSal (int bonus) {
		double anualS = (this.hwag*40*52)+bonus;
		return anualS;
		
	}
	

}
