package net.callofdroidy.designpattern.state;

/**
 * Created by admin on 05/10/15.
 */
public class Room {
    State freeTimeState;
    State checkInState;
    State bookedState;

    State state;

    public Room(){
        freeTimeState = new FreeTimeState(this);
        checkInState = new CheckInState(this);
        bookedState = new BookedState(this);

        state = freeTimeState; // a room's initial state should be freeTimeState
    }

    public void bookRoom(){
        state.bookRoom();
    }

    public void cancelRoom(){
        state.cancelRoom();
    }

    public void checkInRoom(){
        state.checkInRoom();
    }

    public void checkOutRoom(){
        state.checkOutRoom();
    }

    public State getFreeTimeState(){
        return freeTimeState;
    }

    public void setFreeTimeState(State freeTimeState){
        this.freeTimeState = freeTimeState;
    }

    public State getCheckInState() {
        return checkInState;
    }

    public void setCheckInState(State checkInState) {
        this.checkInState = checkInState;
    }

    public State getBookedState() {
        return bookedState;
    }

    public void setBookedState(State bookedState) {
        this.bookedState = bookedState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String toString(){
        return "This room's current state is: " + getState().getClass().getName();
    }
}
