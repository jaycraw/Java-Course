package lab7crawford;

public class GradeActivity {
	protected String name;
	private String exam;
	private double score;
	private char letterGrade;
	//class containing info about grades for the course and labs/exams
	public GradeActivity() {
		name="";
		exam="";
		score = 0.0;
	}
	public void setName(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	public boolean checkName(String name) {
		if (name.isEmpty())
			return false;
		else
			return true;
	}
	public void setExam (int e) {
		if(e==1)
			 exam = "Lab";
		else if (e==2)
			 exam = "Mid-term Exam";
		else if (e==3)
			 exam = "Final Essay Exam"; 
	}
	public String getExam() {
		return exam;
	}
	public void setScore(double s) {
		score=s;
	}
	public double getScore() {
		return score;
	}
	public char getGrade() {
		if (score>=90)
			letterGrade='A';
		else if (score>=80)
			letterGrade='B';
		else if (score>=70)
			letterGrade='C';
		else if (score>=60)
			letterGrade='D';
		else
			letterGrade='F';
		return letterGrade;
			
	}
}

