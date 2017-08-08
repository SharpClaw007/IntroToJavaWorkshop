package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		Robot r2D2 = new Robot("mini");
		r2D2.turn(90);
		r2D2.setSpeed(5);
		r2D2.move(400);
		act();

	
		
		
	}
	public static void act()
	{
		Robot r2D2 = new Robot("mini");
		r2D2.turn(90);
		r2D2.setSpeed(5);
		r2D2.move(400);
	
	}
}
