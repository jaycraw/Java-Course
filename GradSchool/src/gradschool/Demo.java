package gradschool;
import javax.swing.*;
public class Demo {

	public static void main(String[] args) {
		String firstName, lastName;
		double sGPA,sGMAT;
		
		Student myStudent = new Student();
		MISStudent myMIS = new MISStudent();
		//Getting Inputs
		//Setting First Name
		firstName=JOptionPane.showInputDialog("Enter First Name");
		myStudent.setFName(firstName);
		//Setting Last Name
		lastName=JOptionPane.showInputDialog("Enter Last Name");
		myStudent.setLname(lastName);
		//Setting GPA
		do{
			sGPA=Double.parseDouble(JOptionPane.showInputDialog("Enter GPA:"));
			}while(myMIS.checkGPA(sGPA)==false);
		myMIS.setGPA(sGPA);
		//Setting GMAT
		do {
		sGMAT=Double.parseDouble(JOptionPane.showInputDialog("Enter GMAT:"));
		}while(myMIS.checkGMAT(sGMAT)==false);
		myMIS.setGMAT(sGMAT);
		//Determining Admission
		myMIS.setAdmitted(sGPA, sGMAT);
		//Displaying Output
		if (myMIS.getAdmitted()) {
			JOptionPane.showMessageDialog(null, "Congratulations, "+myStudent.getFName()+" "+myStudent.getLName()
			+"\n You got admitted");
		}
		else
			JOptionPane.showMessageDialog(null, "Sorry, "+myStudent.getFName()+" "+myStudent.getLName()
			+"\n You were not admitted");
	}

}
