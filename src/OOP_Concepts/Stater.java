package OOP_Concepts;
import java.util.Scanner;

public class Stater {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		//--------Person Data Input---------
		System.out.println("Enter your name: ");
		String name = scan.nextLine();
		System.out.println("Enter your last name: ");
		String lname = scan.nextLine();
		System.out.println("Enter your age: ");
		int age = scan.nextInt();

		System.out.println("Enter your gender: ");
		char g = scan.next().charAt(0);
		
		//------Employee Data Input------------

		System.out.println("Enter your employee ID: ");
		int empid = scan.nextInt();
		scan.nextLine();
		System.out.println("Enter your job tittle: ");
		String role = scan.nextLine();
		System.out.println("Enter your hire date : ");
		String hdate = scan.nextLine();
		System.out.println("Enter your hourly wage: ");
		int hwag = scan.nextInt();
		
		//------Student Data Input--------------
		System.out.println("Enter your student ID: ");
		int sid = scan.nextInt();
		System.out.println("Enter your major: ");
		String major = scan.nextLine();
		scan.next();
		System.out.println("Enter your subject 1 score: ");
		double s1= scan.nextDouble();
		System.out.println("Enter your subject 2 score: ");
		double s2= scan.nextDouble();
		System.out.println("Enter your subject 3 score: ");
		double s3= scan.nextDouble();
		scan.close();
		
		Employee emp = new Employee(empid, name, lname, age, g, role, hdate, hwag);
		emp.display();
		
		Student std = new Student(sid, name, lname, age, g, major, s1, s2, s3);
		std.display();
		
		Person1 p1 = new Person1();
		p1.setPname(name);
		p1.setPlname(lname);
		p1.setPage(age);
		p1.setPgender(g);
		p1.displayp1();
		
		
	}

		
		
}
