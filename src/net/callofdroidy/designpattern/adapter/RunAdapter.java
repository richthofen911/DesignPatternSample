package net.callofdroidy.designpattern.adapter;

/**
 * Created by admin on 06/09/16.
 */
public class RunAdapter {
    public static void main(String[] args){
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
