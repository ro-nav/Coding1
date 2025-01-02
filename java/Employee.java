package utility;

public abstract class Employee extends Person {
	private int empID;
	protected double BasicSalary;
	
	public Employee() {
		super();
		empID = 100;
		BasicSalary = 1000.0;
	}
	
	public Employee(String name, int d, int m, int y, int empID, double BasicSalary) {
		super(name, d, m, y);
		// TODO Auto-generated constructor stub
		this.empID = empID;
		this.BasicSalary = BasicSalary;
	}

	@Override
	public String toString() {
		return super.toString()+"\nEmployee ID: "+empID+"\nBasic Salary: "+BasicSalary;
	}

	public abstract double CalculateSalary();

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public double getBasicSalary() {
		return BasicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		BasicSalary = basicSalary;
	}
	
	
}
