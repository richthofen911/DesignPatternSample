package net.callofdroidy.designpattern.state;

/**
 * Created by admin on 05/10/15.
 */
public class CheckInState extends State{
    Room hotelManagement;

    public CheckInState(Room hotelManagement) {
        this.hotelManagement = hotelManagement;
    }

    @Override
    public void bookRoom() {
        System.out.println("该房间已近给预定了The room has been booked already");
    }

    @Override
    public void checkInRoom() {
        System.out.println("该房间已经入住了The room has been checked in");
    }

    @Override
    public void checkOutRoom() {
        System.out.println("退房成功Successfully checked out the room");
        hotelManagement.setState(hotelManagement.getFreeTimeState());
    }

    public void cancelRoom() {
        super.cancelRoom();
    }
}
