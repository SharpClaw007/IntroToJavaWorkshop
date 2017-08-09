package day3;

import javax.swing.JOptionPane;

public class Snooper {
	public static void main(String[] args) 
	{
		String name = JOptionPane.showInputDialog("Come here, come here, hehehe.\nWhat's Your Name?");
		String age = JOptionPane.showInputDialog("How old are you?");
		String home = JOptionPane.showInputDialog("Where do you...\n LIVE?");
		
		JOptionPane.showMessageDialog(null, name + ", you are " + age + ". You live at " + home + ".");
		JOptionPane.showMessageDialog(null, "You should not give your personal information to a computer,\n" + name + "!");
	}
}
