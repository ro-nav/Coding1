package utility;

public class Date {
	private int day, month, year;

	public Date() {
		day = 10;
		month = 10;
		year = 2002;
	}
	
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public String toString() {
		return "Date of Birth: [" + day + "/" + month + "/" + year + "]";
	}
	
	
	
}
