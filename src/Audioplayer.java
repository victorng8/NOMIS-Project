import java.io.*;
import javax.sound.sampled.*;
import javax.swing.*;
   
// To play sound using Clip, the process need to be alive.
// Hence, we use a Swing application.
public class Audioplayer extends JFrame {

// Constructor
   public Audioplayer() {
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setTitle("Music Background");
      this.setSize(300, 200);
      this.setVisible(true);
   
      try {
         // Open an audio input stream.
    	  File soundFile = new File("C:/Users/Victor Ng/workspace/Inf-1 OOP project/Music/85046_newgrounds_parago.wav");
    	  AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
         // Get a sound clip resource.
         Clip clip = AudioSystem.getClip();
         // Open audio clip and load samples from the audio input stream.
         clip.open(audioIn);
         clip.start();
         clip.loop(Clip.LOOP_CONTINUOUSLY);  // repeat forever
      } catch (UnsupportedAudioFileException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      } catch (LineUnavailableException e) {
         e.printStackTrace();
      }
   }
   
   public static void main(String[] args) {
      Audioplayer a = new Audioplayer ();

   }
}