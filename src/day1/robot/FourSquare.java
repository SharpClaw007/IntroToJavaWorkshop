package day1.robot;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	Robot r2D2 = new Robot("mini");
	

	void go() {
		r2D2.setSpeed(50);

		r2D2.setPenWidth(3);

		// 6. Do steps #7 to #8 four times...

			for(int i = 0; i < 4; i++)
			{
					r2D2.setRandomPenColor();
	
					drawSquare();
	
					r2D2.turn(90);
			}
			r2D2.turn(-90);
			r2D2.penUp();
			r2D2.move(100);
			for(int i = 0; i < 4; i++)
			{
					r2D2.setRandomPenColor();
	
					drawSquare();
	
					r2D2.turn(90);
			}
			r2D2.penUp();
			r2D2.move(200);
			for(int i = 0; i < 4; i++)
			{
					r2D2.setRandomPenColor();
	
					drawSquare();
	
					r2D2.turn(90);
			}
			r2D2.penUp();
			r2D2.turn(90);
			r2D2.turn(90);
			r2D2.move(500);
			r2D2.turn(-90);
			for(int i = 0; i < 4; i++)
			{
					r2D2.setRandomPenColor();
	
					drawSquare();
	
					r2D2.turn(90);
			}
			r2D2.penUp();
			

	}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		//JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		r2D2.penDown();
		r2D2.move(100);

		
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}
	
}
