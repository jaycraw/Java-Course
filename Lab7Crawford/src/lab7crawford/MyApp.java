package lab7crawford;
import javax.swing.*;
public class MyApp {

	public static void main(String[] args) {
		//calculates final grade for a class given variety of inputs for labs/exams
		//Define variables and initialize constructor
		String name;
		int examSelect,questions,missed;
		double lScore,grammar,content;
		//Accept Inputs
		CourseGrade myGrade = new CourseGrade();
		do {
			//continue asking for name until a valid name is provied
			name = JOptionPane.showInputDialog("Enter Student Name");
			if (myGrade.checkName(name)==false)
				JOptionPane.showMessageDialog(null, "Please Enter a Student Name", "Error", JOptionPane.ERROR_MESSAGE);
		}while (myGrade.checkName(name)==false);
		myGrade.setName(name);
		
		do {
			//input box to select grading of exam
			examSelect=Integer.parseInt(JOptionPane.showInputDialog("Which exam do you want to grade:\n1:Lab Assignment\n2:Mid-Term Assignment\n3:Final Essay Assignemnt"));
			if ((myGrade.checkSelect(examSelect)==false))
				JOptionPane.showMessageDialog(null, "Error in Exam Selection","Error", JOptionPane.ERROR_MESSAGE);
		} while (myGrade.checkSelect(examSelect)==false);
		myGrade.setExam(examSelect);
		//set score for lab
		if (myGrade.getExam() =="Lab") {
			lScore=Integer.parseInt(JOptionPane.showInputDialog("Please Enter Lab Score:"));
			myGrade.setScore(lScore);
		}
		//calculate exam score given # of questions missed out of the total
		else if (myGrade.getExam() == "Mid-term Exam") {
			questions = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of questions on the exam:"));
			myGrade.setQuestions(questions);
			missed = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of questions missed on the exam:"));
			myGrade.setMissed(missed);
			myGrade.setScore(myGrade.getMScore());
		}
		//calculate exam score given separate grammar and content scores
		else if (myGrade.getExam() =="Final Essay Exam") {
			grammar = Double.parseDouble(JOptionPane.showInputDialog("Enter the Final Essay's Grammar Score (<=30)"));
			myGrade.setGrammar(grammar);
			content = Double.parseDouble(JOptionPane.showInputDialog("Enter the Final Essay's Content Score (<=70)"));
			myGrade.setContent(content);
			myGrade.setScore(myGrade.getFScore());
		}
		//display final score
		JOptionPane.showMessageDialog(null, myGrade.getName()+"'s "+myGrade.getExam()+" Score is "+myGrade.getScore()+" and Grade is "+ myGrade.getGrade(), "Grade Report", JOptionPane.INFORMATION_MESSAGE);	
	}

}
