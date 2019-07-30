package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {

	public static void main(String[] args) {

		Robot Amala = new Robot();
		Amala.setSpeed(100);
		Amala.penDown();
		Amala.setRandomPenColor();
		for (int i = 0; i < 4; i++) {
			Amala.move(200);
			Amala.turn(90);

		}
	}
}
