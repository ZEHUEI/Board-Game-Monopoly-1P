package main;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.net.URL;

public class Sound {

    Clip clip;
    URL soundURL[] = new URL[20];

    public Sound(){

        soundURL[0] = getClass().getResource("/Sound/song.wav");
        soundURL[1] = getClass().getResource("/Sound/GainCoin.wav");
        soundURL[2] = getClass().getResource("/Sound/GainGem.wav");
        soundURL[3] = getClass().getResource("/Sound/GainToken.wav");
        soundURL[4] = getClass().getResource("/Sound/Striked.wav");
        soundURL[5] = getClass().getResource("/Sound/Teleport.wav");
        soundURL[6] = getClass().getResource("/Sound/Con1.wav");
        soundURL[7] = getClass().getResource("/Sound/Con2.wav");

    }

    public void setFile(int i){
        try {
            AudioInputStream ais = AudioSystem.getAudioInputStream(soundURL[i]);
            clip =  AudioSystem.getClip();
            clip.open(ais);

        } catch (Exception e) {
        }

    }
    public void play(){
        clip.start();
        //stop cause damn annoying
    }
    public void loop(){
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }
    public void stop(){
        clip.stop();
    }
}
