package Owner;

import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Mp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mp3 m = new Mp3();
		m.mp3play();
	}

	private void mp3play() {
		// TODO Auto-generated method stub
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new URL("FireAlarm.mp3"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
		} catch (Exception ex) {
			ex.getMessage();
			ex.printStackTrace();
		}
	}

}
