package day1.robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

/* Teacher’s note: before beginning, draw a pentagon and have students work out the angle that the robot will have to turn (360/5) */

public class PentagonCrazy {

	private void makePrettyThings() {
		Robot r2D2 = new Robot("mini");

		r2D2.penDown();

		r2D2.setSpeed(10);

		r2D2.setRandomPenColor();

		int side = 5;

		int angle = 360/side;

		for(int i = 0; i < 200; i++)
		{

			r2D2.move(i);
	
			// 10. Make the robot move "i" pixels instead of 200 (don’t need new line of code for this, just change previous one)
	
			r2D2.turn(angle);
	
			r2D2.turn(1);
		}

	}

	// Variations:
	// *12. make the pattern really huge
	// *13. randomize the color of the pattern 
	// *14. experiment with different shapes

	public static void main(String[] args) {
		new PentagonCrazy().makePrettyThings();
	}
}