package Hotel.Rooms;

import Hotel.Guest;

import java.util.ArrayList;

public class Bedroom extends Room {

    private int roomNumber;

    public Bedroom(int roomNumber, ArrayList<Guest> guests, RoomType roomType) {
        super(roomType, guests);
        this.roomNumber = roomNumber;
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }

}


