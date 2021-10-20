package gui;
import javax.swing.*;
import java.awt.*;
import java.text.*;
//has to be explicitly imported due to protections
import java.awt.event.*;

//basic Java GUI exploration
public class MyFrame extends JFrame {
	public JButton btnCal, btnExit;
	public JComboBox jcbDorm, jcbMeal;
	public JLabel jlbDorm, jlbMeal;
	public JPanel dormPanel, mealPanel, buttonPanel;
	private String[] dormNames = {"Allen Hall","Pike Hall", "Farthing Hall", "Univ Suites"};
	private String[] mealPlans = {"7 meals per week","14 meals per week","Unlimited meals per week"};
	public MyFrame() {
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		createDormInterface();
		createMealInterface();
		createButtonInterface();
		add(dormPanel, BorderLayout.NORTH);
		add(mealPanel, BorderLayout.CENTER);
		add(buttonPanel, BorderLayout.SOUTH);
		ButtonHandler h = new ButtonHandler();
		btnCal.addActionListener(h);
		btnExit.addActionListener(h);
		pack();
		setVisible(true);
	}
	//adds new panel that allows user to select a dorm from pre-existing list of dorm names
	public void createDormInterface() {
		jlbDorm = new JLabel("Select a Dorm:");
		jcbDorm = new JComboBox(dormNames);
		dormPanel = new JPanel();
		//jcbDorm.addItem("Allen Hall")
		dormPanel.add(jlbDorm);
		dormPanel.add(jcbDorm);
	}
	//similar to dorm interface, creates panel with combobox of meal plans
	public void createMealInterface() {
		jlbMeal = new JLabel("Select a Meal Plan:");
		jcbMeal = new JComboBox(mealPlans);
		mealPanel = new JPanel();
		//jcbDorm.addItem("Allen Hall")
		mealPanel.add(jlbMeal);
		mealPanel.add(jcbMeal);
	}
	//adding JButtons to panel
	public void createButtonInterface() {
		btnCal = new JButton("Calculate Charges");
		btnExit = new JButton("Exit");
		buttonPanel = new JPanel();
		buttonPanel.add(btnCal);
		buttonPanel.add(btnExit);
	}
	//when button is pressed, calculate total living expenses given dorm and meal plan selected
	public class ButtonHandler implements ActionListener {
		public void actionPerformed (ActionEvent ae) {
			String selectDorm, selectMeal;
			double dormCharges, mealCharges, totalCharges;
			
			if (ae.getSource()==btnCal) {
				selectDorm=dormNames[jcbDorm.getSelectedIndex()];
				if (selectDorm.equals("Allen Hall"))
					dormCharges=1500.00;
				else if (selectDorm.equals("Pike Hall"))
					dormCharges=1600.00;
				else if (selectDorm.equals("Farthing Hall"))
					dormCharges=1200.00;
				else if (selectDorm.equals("Univ Suites"))
					dormCharges=1800.00;
				else
					dormCharges=0.00;
				selectMeal = mealPlans[jcbMeal.getSelectedIndex()];
				if (selectMeal.equals("7 meals per week"))
					mealCharges = 560.00;
				else
					mealCharges = 0.0;
				totalCharges=mealCharges+dormCharges;
				JOptionPane.showMessageDialog(null, "Total Charges: "+totalCharges);
			}
			if (ae.getSource()==btnExit) {
				System.exit(0);
				
			}
		}
	}
}
