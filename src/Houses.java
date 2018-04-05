import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	public static void main(String[] args) {
		Robot r2d2 = new Robot();
r2d2.setX(70);
r2d2.setY(500);
r2d2.hide();
r2d2.setSpeed(500);
r2d2.penDown();
Random r = new Random();

for (int i = 0; i < 15; i++) {
	

r2d2.move(100);
r2d2.turn(90);
r2d2.move(20);
r2d2.turn(90);
r2d2.move(100);
r2d2.turn(-90);
r2d2.setPenColor(r.nextInt(256),r.nextInt(256),r.nextInt(256));
r2d2.setPenColor(17,255,0);
r2d2.move(30);
r2d2.turn(-90);
r2d2.setPenColor(17,255,0);
r2d2.move(100);
r2d2.turn(45);
r2d2.move(5);
r2d2.turn(45);
r2d2.move(5);
r2d2.turn(45);
r2d2.move(100);
r2d2.setPenColor(0,0,0);
r2d2.turn(-90);
r2d2.setPenColor(17,255,0);
r2d2.move(30);
r2d2.turn(-90);
r2d2.setPenColor(r.nextInt(256),r.nextInt(256),r.nextInt(256));
	}
	}
}
