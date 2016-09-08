package net.callofdroidy.designpattern.adapter;

/**
 * Created by admin on 06/09/16.
 */
public class Mp4Player implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName){
        // Do Nothing
    }

    @Override
    public void playMp4(String fileName){
        System.out.println("Playing mp4 file. Name: " + fileName);
    }
}
