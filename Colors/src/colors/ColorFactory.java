package colors;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ColorFactory extends JFrame{
	//more GUI exploration, specifically changing the color of our container/font to the selected color
	//declare a shedload of variables used below
	public final int WIDTH=500,HEIGHT=300;
	private Container c;
	private JPanel topPanel, bottomPanel;
	private JLabel jlbMessage;
	private JButton jbnRed, jbnOrange, jbnYellow;
	private JRadioButton jrbGreen, jrbBlue, jrbCyan;
	private ButtonGroup bg;
	
	public ColorFactory() {
		//setup the basic frame of the JPanel
		setTitle("Color Factory");
		setSize(WIDTH,HEIGHT);
		c = getContentPane();
		c.setLayout(new BorderLayout());
		buildTopPanel();
		c.add(topPanel,BorderLayout.NORTH);
		buildBottomPanel();
		c.add(bottomPanel,BorderLayout.SOUTH);
		jlbMessage = new JLabel("Top buttons change the panel color and bottom buttons change the text color");
		c.add(jlbMessage, BorderLayout.CENTER);
		setVisible(true);
	}
	private void buildTopPanel() {
		topPanel = new JPanel();
		topPanel.setLayout(new FlowLayout());
		topPanel.setBackground(Color.WHITE);
		ButtonHandler h1 = new ButtonHandler();
		//create three buttons that correspond to Red, Orange, Yellow
		jbnRed = new JButton("Red");
		jbnRed.setBackground(Color.RED);
		jbnRed.addActionListener(h1);
		jbnRed.setActionCommand("R");
		
		jbnOrange = new JButton("Orange");
		jbnOrange.setBackground(Color.ORANGE);
		jbnOrange.addActionListener(h1);
		jbnOrange.setActionCommand("O");
		
		jbnYellow = new JButton("Yellow");
		jbnYellow.setBackground(Color.YELLOW);
		jbnYellow.addActionListener(h1);
		jbnYellow.setActionCommand("Y");
		//add buttons to our top panel
		topPanel.add(jbnRed);
		topPanel.add(jbnOrange);
		topPanel.add(jbnYellow);
	}
	private void buildBottomPanel() {
		bottomPanel = new JPanel();
		bottomPanel.setLayout(new FlowLayout());
		bottomPanel.setBackground(Color.WHITE);
		RadioButtonHandler h2 = new RadioButtonHandler();
		//create three radio buttons that correspond to various cool tones
		jrbBlue = new JRadioButton("Blue");
		jrbBlue.setBackground(Color.BLUE);
		jrbBlue.addActionListener(h2);
		
		jrbGreen = new JRadioButton("Green");
		jrbGreen.setBackground(Color.GREEN);
		jrbGreen.addActionListener(h2);
		
		jrbCyan = new JRadioButton("Cyan");
		jrbCyan.setBackground(Color.CYAN);
		jrbCyan.addActionListener(h2);
		
		bg = new ButtonGroup();
		bg.add(jrbBlue);
		bg.add(jrbGreen);
		bg.add(jrbCyan);
		//add buttons to the bottom panel
		bottomPanel.add(jrbBlue);
		bottomPanel.add(jrbGreen);
		bottomPanel.add(jrbCyan);
		
	}
	private class ButtonHandler implements ActionListener {
		//when top button is clicked, change background to color associated with selected button
		public void actionPerformed(ActionEvent e1) {
			if(e1.getActionCommand().equals("R")) {
				c.setBackground(Color.RED);
			}
			if(e1.getActionCommand().equals("O")) {
				c.setBackground(Color.ORANGE);
			}
			if(e1.getActionCommand().equals("Y")) {
				c.setBackground(Color.YELLOW);
			}
		}
	}
	private class RadioButtonHandler implements ActionListener {
		//for radio buttons, change font color to selected button
		public void actionPerformed(ActionEvent e2) {
			if (e2.getSource()==jrbBlue) {
				jlbMessage.setForeground(Color.BLUE);
			}
			if (e2.getSource()==jrbGreen) {
				jlbMessage.setForeground(Color.GREEN);
			}
			if (e2.getSource()==jrbCyan) {
				jlbMessage.setForeground(Color.CYAN);
			}
		}
	}
}
