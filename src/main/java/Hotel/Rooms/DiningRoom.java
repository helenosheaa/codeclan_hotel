package Hotel.Rooms;

import Hotel.Guest;

import java.util.ArrayList;

public class DiningRoom extends Room {

    public DiningRoom(ArrayList<Guest> guests, RoomType roomType) {
        super(roomType, guests);
    }
}
