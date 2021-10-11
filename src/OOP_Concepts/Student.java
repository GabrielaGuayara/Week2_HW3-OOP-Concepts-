package OOP_Concepts;

public class Student extends Person{
	
	int st_id;
	String major;
	double scr1, scr2, scr3;
	
	
	Student(int sid, String name, String lname, int age, char gender, String m, double sr1, double sr2, double sr3) {
		super(name, lname, age, gender);
		
		this.st_id=sid;
		this.major = m;
		this.scr1 = sr1;
		this.scr2 = sr2;
		this.scr3 = sr3;
	}
	
	public void display() {
		System.out.println("****************Student Information**************");
		System.out.println("Student ID: " + this.st_id);
		System.out.println("Name: " + this.name);
		System.out.println("Last name: " + this.lname);
		System.out.println("Age: " + this.age);
		System.out.println("Gender: " + this.gender);
		System.out.println("Subject 1 score: " + this.scr1);
		System.out.println("Subject 2 score: " + this.scr2);
		System.out.println("Subject 3 score: " + this.scr3);
		System.out.printf("Scores Average:  "+ getAverage());
		System.out.println();
		System.out.println();
	}
	
	double getAverage()
	{
		double avrg = (this.scr1+ this.scr2 + this.scr3)/3;
		return avrg;
	}

}
