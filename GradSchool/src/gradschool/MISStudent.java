package gradschool;

public class MISStudent extends Student{
	private double gpa, gmat;
	private boolean admitted;
	//exploration a basic class, where gpa, gmat, and boolean of admission is setup
	public MISStudent() {
		
	}
	//set GPA and GMAT for specific instance of MISStudent class
	public void setGPA(double p) {
		gpa = p;
	}
	public void setGMAT(double m) {
		gmat = m;
	}
	//these return GPA/GMAT that have been previously set
	public double getGPA() {
		return gpa;
	}
	public double getGMAT() {
		return gmat;
	}
	//checks to insure that GPA and GMAT are in expected ranges
	public boolean checkGPA(double sp) {
		if (sp<0.0||sp>4.0)
			return false;
		else
			return true;
	}
	public boolean checkGMAT(double sm) {
		if (sm>800.0||sm<0.0)
			return false;
		else
			return true;
	}
	//setup boolean for admission
	public void setAdmitted(double p, double m) {
		if (checkQualification(p,m))
			admitted = true;
		else
			admitted = false;
	}
	//return boolean for admission
	public boolean getAdmitted() {
		return admitted;
	}
	//if their GPA is 3 or higher and GMAT is 600 or higher, they're in. I'm very proud of them
	public boolean checkQualification(double sgpa, double sgmat) {
		if (sgpa>=3.0 && sgmat>=600)
			return true;
		else
			return false;
	}
}
