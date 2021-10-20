package lab7crawford;

public class CourseGrade extends GradeActivity {
	private int numQuestions,numMissed;
	private double pointsEach,mScore,grammar,content,fScore;
	//class that contains info about various aspects of the course grade, including the final grade
	public CourseGrade() {
		GradeActivity Grade = new GradeActivity();
		numQuestions=0;
		numMissed = 0;
		pointsEach=0.0;
		mScore=0.0;
		grammar=0.0;
		content=0.0;
		fScore=0.0;			
				
	}

	public boolean checkSelect(int se) {
		if (se>3||se<1)
			return false;
		else
			return true;
	}
	public void setQuestions(int q) {
		numQuestions=q;
	}
	public int getQuestions() {
		return numQuestions;
	}
	public void setMissed(int m) {
		numMissed=m;
	}
	public int getMissed() {
		return numMissed;
	}
	public double getPointsEach() {
		pointsEach=100/numQuestions;
		return pointsEach;
	}
	public double getMScore() {
		pointsEach=getPointsEach();
		mScore=(numQuestions-numMissed)*pointsEach;
		return mScore;
	}
	public void setGrammar(double gr) {
		grammar=gr;
	}
	public void setContent(double co) {
		content=co;
	}
	public double getGrammar() {
		return grammar;
	}
	public double getContent() {
		return content;
	}
	public double getFScore() {
		fScore=grammar+content;
		return fScore;
	}


}
