package finalcrawford;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.text.*;
public class MyGui extends JFrame{
	//declare variables
	//tests UI concepts learned throughout the class, particularly listeners
	JPanel jplRegister,jplWorkshop,jplButtons;
	JLabel jlbHeading;
	JRadioButton jrbGeneral, jrbStudent;
	JComboBox jcbWorkshops;
	JButton jbnCalculate,jbnExit;
	DecimalFormat myFormat = new DecimalFormat("$0.00");
	private String[] workshopTypes = {"Introduction to E-Commerce","The Internet of Things",
	                               "Web Application Development","Internet Security"};
	ButtonGroup bg;
	public MyGui() {
		//create container
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		//create GUI areas
		jlbHeading = new JLabel("Select Registration Options");
		createRegister();
		createWorkshop();
		createButtons();
		//add areas to container
		c.add(jlbHeading,BorderLayout.NORTH);
		c.add(jplRegister,BorderLayout.WEST);
		c.add(jplWorkshop,BorderLayout.EAST);
		c.add(jplButtons,BorderLayout.SOUTH);
		//set size and visibility
		pack();
		setVisible(true);
	}
	public void createRegister() {
		//initiate panel and radio buttons
		jplRegister = new JPanel();
		jrbGeneral = new JRadioButton("General Registration");
		jrbStudent = new JRadioButton("Student Registration");
		// makes the buttons mutually exclusive
		bg = new ButtonGroup();
		bg.add(jrbGeneral);
		bg.add(jrbStudent);
		//add buttons to panel
		jplRegister.add(jrbGeneral);
		jplRegister.add(jrbStudent);
	}
	public void createWorkshop() {
		//initiate panel and combo box, taking the string array, and adding cb to panel
		jplWorkshop = new JPanel();
		jcbWorkshops = new JComboBox(workshopTypes);
		jplWorkshop.add(jcbWorkshops);
		
	}
	public void createButtons() {
		jplButtons = new JPanel();
		jplButtons.setLayout(new GridLayout(1,2));
		ButtonHandler h = new ButtonHandler();
		
		jbnCalculate = new JButton("Calculate Charges");
		jbnExit = new JButton("Exit");
		jbnCalculate.addActionListener(h);
		jbnExit.addActionListener(h);
		jplButtons.add(jbnCalculate);
		jplButtons.add(jbnExit);
	}
	public class ButtonHandler implements ActionListener {
		public void actionPerformed (ActionEvent ae) {
			//if the exit button is pressed, exit
			if (ae.getSource()==jbnExit) {
			System.exit(0);	
			}
			if (ae.getSource()==jbnCalculate) {
				Registration r = new Registration();
				//if they don't have either option selected, yell at them
				if (jrbGeneral.isSelected()==false && jrbStudent.isSelected()==false) {
					JOptionPane.showMessageDialog(null, "Please select a registration type", "Notice", JOptionPane.INFORMATION_MESSAGE);	
				}
				else {
					//set registration cost based on which option is selected
					if (jrbGeneral.isSelected()) 
						r.setRegistrationCost(1);
					if (jrbStudent.isSelected()) 
						r.setRegistrationCost(2);
					//send index of the workshop
					r.setWorkshopCost(jcbWorkshops.getSelectedIndex());
					//calculate the total charges and display the output
					JOptionPane.showMessageDialog(null, "Total Charges: "+myFormat.format(r.getTotal()), "Message", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		}
	}
}

