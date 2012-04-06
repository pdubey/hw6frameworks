package GUI;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import framework.*;

import java.awt.*;
public class EntryScreen extends JFrame {
	private Framework framework;
	//private DisplayGrid dg;

	public EntryScreen(Framework f){
		framework = f;
		//dg = new DisplayGrid(f);
	}
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
		setVisible(true);
	}

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