package day1.robot;

import org.jointheleague.graphical.robot.Robot;
import org.teachingextensions.logo.Tortoise;

public class TriangleShell {

	Robot bob = new Robot("mini");

	
	void go() {

		bob.setSpeed(10);

		 int triLength = 50;

		 for(int i = 0; i < 60; i++)
		 {

			bob.setRandomPenColor();
	
			// 8. Increase the length of the side by 10 pixels
			triLength = 50 + 10;
	
			// 5. call your drawTriangle() method using your length variable
			drawTriangle(triLength);
	
			// 10. Turn the tortoise 6 degrees to the right
			bob.turn(6);
		 }

	}

	/* 2. fill in the method below to draw a triangle. Use the length variable for the size of the triangle. */
	private void drawTriangle(int length) {
		
		bob.penDown();
		bob.turn(-130);
		bob.move(100);
		bob.turn(-130);
		bob.move(100);
		bob.turn(-115);
		bob.move(85);
		bob.penUp();
		bob.move(100);
		
	}

	
	public static void main(String[] args) {
		new TriangleShell().go();
	}
}
