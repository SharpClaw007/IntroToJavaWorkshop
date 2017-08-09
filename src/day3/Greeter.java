package day3;

import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) 
	{
		String name = JOptionPane.showInputDialog("What's Your Name?");
		JOptionPane.showMessageDialog(null, "Hello " + name);
	}
	
}
