
package _02_loop_variables._2_shiny_objects;


import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;



public class ShinyObjects {
	
	/***********  SOUND ***************
	 * Some computers are unable to play sounds. 
	 * If you cannot play sound on this computer, set canPlaySounds to false.
	 * If you are not sure, ask your teacher 
	 * *****************/
	boolean canPlaySounds = true;	
	
	public static void main(String[] args) {
		new ShinyObjects().manyShinyObjects();
	}
	
	void manyShinyObjects() {
		
		// 1. Call the method below to play Mister Zee
		playMisterZee();
		int i = 0;
		// 2. Ask the user how many shiny objects they want
		String answer = JOptionPane.showInputDialog(null, "how many shiny objects do you want?")
		
		// 3. Play the sound that many times
		if(i < answer) {
			playMisterZee();
			i++;
		}

	}

	/********************   Use this method. DON'T CHANGE THE CODE BELOW  ***********************/
	
	public void playMisterZee() {
		String path = "src/_02_loop_variables/_2_shiny_objects/";
		if (canPlaySounds) {
			File sound = new File(path+"shiny-objects.wav");
			if (sound.exists()) {
				try {					
					Clip clip= AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(sound));
					clip.start();
					Thread.sleep(clip.getMicrosecondLength()/1000);
				}
				catch (Exception e) {
		
				}
			}
		} else {
			System.out.println("Mister Zee requires shiny objects");
		}
	}


}