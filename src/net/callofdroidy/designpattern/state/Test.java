package net.callofdroidy.designpattern.state;

/**
 * Created by admin on 05/10/15.
 */
public class Test {
    public static void main(String[] args){
        Room[] rooms = new Room[3]; //assume the hotel as 3 rooms

        for(int i = 0; i < rooms.length; i++){
            rooms[i] = new Room();
        }

        rooms[0].bookRoom();
        rooms[0].checkInRoom();
        rooms[0].bookRoom();
        rooms[0].cancelRoom();
        System.out.println(rooms[0]);
    }
}
