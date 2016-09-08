package net.callofdroidy.designpattern.adapter;

import javax.print.attribute.standard.Media;

/**
 * Created by admin on 06/09/16.
 */
public class AudioPlayer implements MediaPlayer{
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName){
        if(audioType.equalsIgnoreCase("mp3")){
            // mp3 type is a built-in supported format for MediaPlayer
            System.out.println("Playing mp3 file. Name: " + fileName);
        }else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }else
            System.out.println("Invalid media format: " + audioType + ", not supported");
    }
}
