package utility;

public class Person {
	private String name;
	private Date dob;
	public Person() {
		this.name = "ABC";
		this.dob = new Date();
	}
	
	public Person(String name, int d, int m, int y) {
		this.name = name;
		this.dob = new Date(d,m,y);
	}

	@Override
	public String toString() {
		return "Nmae: "+name + "\n"+dob.toString();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	
	
	
	
}
