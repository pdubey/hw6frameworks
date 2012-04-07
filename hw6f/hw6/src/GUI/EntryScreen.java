package GUI;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import framework.*;

import java.awt.*;

/**
 * The class creates an entry screen that gives the user different
 * options that enhance his experience and provides him more features.
 * These options are of stepping through each stage or simulating a 
 * number of steps together.
 * 
 * @author Gautham Nagaraju, Akash Kulkarni, Victor Dong, Prakhar Dubey
 *
 */
public class EntryScreen extends JFrame {
	private Framework framework;

	/**
	 * The constructor which initialises the entry screen. it is needed
	 * as it specifies what framework to use.
	 *  
	 * @param f the framework to use.
	 */
	public EntryScreen(Framework f){
		framework = f;
	}
	
	/**
	 * The main method that handles displaying the main entry screen
	 * and provides the user with the different options. It also accepts 
	 * user response and responds appropriately.
	 * 
	 * @param Void
	 * @return Void
	 */
	public void display(){
		JPanel panel = new JPanel();
		setTitle("Entry Screen");
		setSize(400, 400);
		setLocationRelativeTo(null);

		final JButton step = new JButton("Step");
		final JButton advance = new JButton("Advance");
		final JTextField advancenum = new JTextField(20);

		step.setBounds(30, 100, 100, 30);
		advance.setBounds(30, 100, 100, 30);
		advancenum.setBounds(150,100,100,30);

		panel.add(step);
		panel.add(advance);
		panel.add(advancenum);
		getContentPane().add(panel);

		step.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				framework.step(1); 
			}
		});

		advance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				String getsteps = advancenum.getText();
				if(getsteps!=null){
					if(isNumeric(getsteps)){
						framework.advance(Integer.parseInt(getsteps));
					}
				}
			}
		});
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	/**
	 * This a helper method that determines if the passed string is an
	 * integer or not.
	 * 
	 * @param str the string to determine if it is an integer
	 * @return boolean if the string is an integer or not.
	 */
	private boolean isNumeric(String str)  
	{  
		try{  	
			int d = Integer.parseInt(str);  
		}  
		catch(NumberFormatException nfe){  
			return false;  
		}  
		return true;  
	}

}