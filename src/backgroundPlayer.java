import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.applet.AudioClip;

import sun.audio.AudioPlayer;

public class backgroundPlayer {
	
	public static void main(String[] args) {

		JFrame frame = new JFrame();
		frame.setSize(200,200);
		JButton button = new JButton("Click me to play");
		frame.add(button);
		button.addActionListener(new AL());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public static class AL implements ActionListener {
		public final void actionPerformed (ActionEvent e) {
				music();
		}
	}

	public static void music () {
		try { public boolean play;
		public void playMusic(String loc) {
		location = loc;
		play = true;
		Clip clip = AudioSystem.getClip();
        AudioInputStream inputStream = AudioSystem.getAudioInputStream(new FileInputStream("85046_newgrounds_parago.wav"));
        clip.open(inputStream);
        String fileName = null;
		URL url = AudioPlayer.class.getResource(fileName); 
        AudioInputStream ais =  AudioSystem.getAudioInputStream(url);  
        clip.loop(Clip.LOOP_CONTINUOUSLY);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (LineUnavailableException e) {
			e.printStackTrace();
		} catch (UnsupportedAudioFileException e) {
			e.printStackTrace();
		} public void stop(){
		    play = false;
		}
	}
}
