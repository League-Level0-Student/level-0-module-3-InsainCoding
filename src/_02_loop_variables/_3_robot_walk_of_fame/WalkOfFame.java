
package _02_loop_variables._3_robot_walk_of_fame;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot();
		
		// 1. Set the X position of the robot so that it starts on the left. 
		// You also need to show the robot to see the result of this line.
		rob.setX(100);
		int i = 0;
		// 2. Make the robot draw a star shape. Hint: angle=144.
		rob.setAngle(27);
		rob.penDown();
		rob.setSpeed(10);
		
		/*if(i < 8) {
			rob.move(50);
			rob.turn(117);
			System.out.println("sgddf");
			i++;
		}
		//rob.hide();
		*/
		rob.move(50);
		rob.turn(144);
		rob.move(50);
		rob.turn(144);
		rob.move(50);
		rob.turn(144);
		rob.move(50);
		rob.turn(144);
		rob.move(50);
		rob.turn(144);
		rob.hide();
		// 3. Set the length of each line in the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of 10 stars (see recipe to see how it should look)
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
