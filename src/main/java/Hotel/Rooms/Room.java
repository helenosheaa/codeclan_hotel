package Hotel.Rooms;

import Hotel.Guest;

import java.util.ArrayList;

public abstract class Room {

    private RoomType roomType;
    private ArrayList<Guest> guests;

    public Room(RoomType roomType, ArrayList<Guest> guests){
        this.roomType = roomType;
        this.guests = guests;
    }

    public int getCapacity(){
        return roomType.getCapacity();
    }

    public double getRoomRate(){
        return roomType.getRoomRate();
    }

    public String getRoomType(){
        return roomType.getRoomType();
    }

    public ArrayList<Guest> getGuests(){
        return new ArrayList<> (this.guests);
    }

}
