package day3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	public static void main(String[] args) {

		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		JOptionPane.showMessageDialog(null, "If you find yourself having to cross a piranha-infested river, here's how to do it...");

		// Get the user to enter an adjective
		String adjective = JOptionPane.showInputDialog("Enter A Adjective");

		// Get the user to enter a type of liquid
		String liquid = JOptionPane.showInputDialog("Enter A Liquid");

		// Get the user to enter a body part
		String bodyPart = JOptionPane.showInputDialog("Enter A Body Part");

		// Get the user to enter a verb
		String verb = JOptionPane.showInputDialog("Enter A Verb");

		// Get the user to enter a place
		String place = JOptionPane.showInputDialog("Enter A Place");

		// Fit the user's words into this sentence, and save it in a String:
		// Piranhas are more [adjective] during the day, so cross the river at
		// night. Piranhas are attracted to fresh [type of liquid] and will most
		// likely take a bite out of your [body part] if you [verb]. Whatever
		// you do, if you have an open wound, try to find another way to get
		// back to the [place]. Good luck!
		JOptionPane.showMessageDialog(null, "Piranhas are more " + adjective + " during the day, so cross the river at night. \n Piranhas are attracted to fresh " + liquid + " and will most likely take a bite out of your " 
		+ bodyPart + " if you " + verb + ". Whatever you do, \n if you have an open wound, try to find another way to get back to the " + place + ". Good Luck!");
		
		// Make a pop-up for the final story. You can use \n to go to the next line.
		JOptionPane.showMessageDialog(null, "Congratulations! You have crossed the river and only lost a few body parts! \n Now, can you find your way back to " + place + "?");
		

	}
}

