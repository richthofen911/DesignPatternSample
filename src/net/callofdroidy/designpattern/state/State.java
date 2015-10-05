package net.callofdroidy.designpattern.state;

/**
 * Created by admin on 05/10/15.
 */
public class State {

    public void bookRoom(){
        System.out.println("Method bookRoom() is not usable under current state");
    }

    public void cancelRoom(){
        System.out.println("Method cancelRoom() is not usable under current state");
    }

    public void checkInRoom(){
        System.out.println("Method checkInRoom() is not usable under current state");
    }

    public void checkOutRoom(){
        System.out.println("Method checkOutRoom() is not usable under current state");
    }
}
