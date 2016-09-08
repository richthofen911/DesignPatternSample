package net.callofdroidy.designpattern.adapter;

/**
 * Created by admin on 06/09/16.
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName){
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName){
        // Do Nothing
    }
}
