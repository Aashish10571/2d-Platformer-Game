package Main;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Sound {
    Clip clip;
    File[] files = new File[10];

    Sound() {
        files[0] = new File("C:\\Users\\Aashish\\Desktop\\JAVA SWING PROJECTS\\TreasureHuntingGame\\res\\sound\\BlueBoyAdventure.wav");
        files[1] = new File("C:\\Users\\Aashish\\Desktop\\JAVA SWING PROJECTS\\TreasureHuntingGame\\res\\sound\\coin.wav");
        files[2] = new File("C:\\Users\\Aashish\\Desktop\\JAVA SWING PROJECTS\\TreasureHuntingGame\\res\\sound\\powerup.wavres/sound/powerup.wav");
        files[3] = new File("C:\\Users\\Aashish\\Desktop\\JAVA SWING PROJECTS\\TreasureHuntingGame\\res\\sound\\unlock.wav");
        files[4] = new File("C:\\Users\\Aashish\\Desktop\\JAVA SWING PROJECTS\\TreasureHuntingGame\\res\\sound\\fanfare.wav");
    }

    public void setFile(int i) {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(files[i]);
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            throw new RuntimeException(e);
        }
    }

    public void play() {
        clip.start();
    }

    public void loop() {
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }

    public void stop() {
        clip.stop();
    }
}
