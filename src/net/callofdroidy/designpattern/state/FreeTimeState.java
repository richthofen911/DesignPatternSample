package net.callofdroidy.designpattern.state;

/**
 * Created by admin on 05/10/15.
 */
public class FreeTimeState extends State {
    Room hotelManagement;

    public FreeTimeState(Room hotelManagement){
        this.hotelManagement = hotelManagement;
    }

    @Override
    public void bookRoom(){
        System.out.println("Successfully booked a room");
        hotelManagement.setState(hotelManagement.getBookedState());
    }

    @Override
    public void checkInRoom(){
        System.out.println("Successfully checked in the room");
        hotelManagement.setState(hotelManagement.getCheckInState());
    }

    public void checkOutRoom(){
        super.checkOutRoom();
    }

    public void cancelRoom(){
        super.cancelRoom();
    }
}
