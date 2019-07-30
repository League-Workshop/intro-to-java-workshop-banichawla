package section2;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot Amala = new Robot();
		// 5. Set your robot's pen down 
		Amala.penDown();
		// 3. Set the robot to go at max speed (100)
		Amala.setSpeed(100);
		// 4. Use a for loop to repeat steps #7 to #8, 75 times
		for (int i = 0; i < 75; i++) {
			// 7. Change the pen color to random
			Amala.setRandomPenColor();
			// 6. Move the robot 5 times the loop counter (5*i)
			Amala.move(5*i);
			// 2. Turn the robot 360/7 degrees to the right
		Amala.turn(360/7);
			// 8. Set the pen width to i
			Amala.setPenWidth(i);
	}
	}
}
