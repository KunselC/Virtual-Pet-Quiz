import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class AudioPlayer {

    public static void playSound(String soundFileName) {
        try {
            File soundFile = new File(soundFileName);
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            
            Clip clip = AudioSystem.getClip();
            
            clip.open(audioIn);
            
            clip.start();
            
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            System.out.println("Error with playing sound.");
            e.printStackTrace();
        }
    }
}
