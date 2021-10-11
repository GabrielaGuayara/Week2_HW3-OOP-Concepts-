package OOP_Concepts;

public class Person1 {
	String pname;
	String plname;
	int page;
	char pgender;

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPlname() {
		return plname;
	}

	public void setPlname(String plname) {
		this.plname = plname;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public char getPgender() {
		return pgender;
	}

	public void setPgender(char pgender) {
		this.pgender = pgender;
	}

	public void displayp1() {
		System.out.println("****************Person 1 Information**************");
		System.out.println("Name: " + this.pname);
		System.out.println("Last name: " + this.plname);
		System.out.println("Age: " + this.page);
		System.out.println("Gender: " + this.pgender);
		System.out.println();
	}

}
