package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		Robot r2D2 = new Robot("mini");
		
		r2D2.penDown();

		r2D2.setSpeed(10);

		for(int i = 0; i < 75; i++)
		{

			r2D2.setRandomPenColor();
	
			r2D2.move(5*i);
	
			
			r2D2.turn(360*1/7);
	
			
	
			r2D2.setPenWidth(i);
		}

	}
}
