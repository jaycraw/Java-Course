package gradschool;

public class Student {
	//another basic class that simply has a first and last name to set/return as needed
	private String fname, lname;
	public Student() {
		fname ="";
		lname="";
	}
	public void setFName(String f) {
		fname=f;
	}
	public void setLname(String l) {
		lname=l;
	}
	public String getFName() {
		return fname;
	}
	public String getLName() {
		return lname;
	}
}
