package Client;

import framework.Framework;
import framework.FrameworkImpl;
import framework.Grid;
import framework.Rule;

import java.awt.Color;

import GUI.EntryScreen;

/**
 * This is the default plugin we wrote that tests the framework -- 
 * it uses all defaults so that > 90% of the Framework code is covered 
 * (through the various actions/buttons of the GUI)
 * 
 * @author Gautham Nagaraju, Victor Dong, Prakhar Dubey, Akash Kulkarni
 *
 */
public class DefaultClient {
	
	public static void main(String args[]){
		Framework f = new FrameworkImpl();
		f.init();
		f.display();
		EntryScreen screen = new EntryScreen(f);
		screen.display();
		
	}
}
