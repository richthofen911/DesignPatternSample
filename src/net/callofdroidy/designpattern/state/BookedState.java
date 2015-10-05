package net.callofdroidy.designpattern.state;

/**
 * Created by admin on 05/10/15.
 */
public class BookedState extends State {
    Room hotelManagement;

    public BookedState(Room hotelManagement){
        this.hotelManagement = hotelManagement;
    }

    @Override
    public void bookRoom() {
        System.out.println("该房间已近给预定了The room has been booked already");
    }

    @Override
    public void checkInRoom() {
        System.out.println("入住成功Successfully checked in");
        hotelManagement.setState(hotelManagement.getCheckInState());
    }

    public void checkOutRoom() {
        super.checkOutRoom();
    }

    @Override
    public void cancelRoom() {
        System.out.println("Successfully unsubscribed");
        hotelManagement.setState(hotelManagement.getFreeTimeState());
    }
}
