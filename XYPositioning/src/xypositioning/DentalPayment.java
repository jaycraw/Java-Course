package xypositioning;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import javax.swing.*;
//goal of this is to get experience using exact x/y axes to map items on Frames
public class DentalPayment extends JFrame {
	//declare endless variables
	private JLabel jlbDentalPaymentForm, jlbPatientName;
	private JTextField jtfPatientName, jtfTotal;
	private JCheckBox jcbCleaning, jcbCavity, jcbXRay;
	private JLabel jlbCleaning, jlbCavity, jlbXray, jlbTotal;
	private JButton jbnCalculate;
	
	public DentalPayment() {
		createInterface();
	}
	public void createInterface(){
		Container c = getContentPane();
		c.setLayout(null);
		// set up form
		jlbDentalPaymentForm = new JLabel();
		//first use of x/y axis positioning
		jlbDentalPaymentForm.setBounds(19,19,235,28);
		jlbDentalPaymentForm.setText("Dental Payment Form");
		jlbDentalPaymentForm.setFont(new Font ("Default", Font.PLAIN, 22));
		jlbDentalPaymentForm.setHorizontalAlignment(JLabel.CENTER);
		c.add(jlbDentalPaymentForm);
		jlbPatientName = new JLabel();
		jlbPatientName.setBounds(19,65,91,21);
		jlbPatientName.setText("Patient Name: ");
		c.add(jlbPatientName);
		//all of these new items aren't intended to do anything, just to get a little bit of experience using coordinates
		jtfPatientName = new JTextField();
		jtfPatientName.setBounds(132,65,117,21);
		c.add(jtfPatientName);
		
		jcbCleaning = new JCheckBox();
		jcbCleaning.setBounds(16,112,122,24);
		jcbCleaning.setText("Cleaning: ");
		c.add(jcbCleaning);
		
		jlbCleaning = new JLabel();
		jlbCleaning.setBounds(211,112,38,24);
		jlbCleaning.setText("$35");
		c.add(jlbCleaning);
		
		jcbCavity = new JCheckBox();
		jcbCavity.setBounds(16,159,122,24);
		jcbCavity.setText("Cavity: ");
		c.add(jcbCavity);
		
		jlbCavity = new JLabel();
		jlbCavity.setBounds(211,159,38,24);
		jlbCavity.setText("$150");
		c.add(jlbCavity);
		
		jcbXRay = new JCheckBox();
		jcbXRay.setBounds(16,206,122,24);
		jcbXRay.setText("X-Ray: ");
		c.add(jcbXRay);
		
		jlbXray = new JLabel();
		jlbXray.setBounds(211,206,38,24);
		jlbXray.setText("$85");
		c.add(jlbXray);
		
		jlbTotal = new JLabel();
		jlbTotal.setBounds(144,256,41,21);
		jlbTotal.setText("Total");
		c.add(jlbTotal);
		
		jtfTotal = new JTextField();
		jtfTotal.setBounds(192,256,94,24);
		c.add(jtfTotal);
		
		jbnCalculate = new JButton();
		jbnCalculate.setBounds(155, 296, 92, 24);
		jbnCalculate.setText("Calculate");
		c.add(jbnCalculate);
		setSize(400,400);
		setVisible(true);
	}
}
