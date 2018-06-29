package Hotel.Rooms;

import Hotel.Guest;

import java.util.ArrayList;

public class Bedroom extends Room {

    private String type;
    private int roomNumber;
    private double rate;

    public Bedroom(int capacity, ArrayList<Guest> guests, String type, int roomNumber, double rate) {
        super(capacity, guests);
        this.type = type;
        this.roomNumber = roomNumber;
        this.rate = rate;
    }


    public int getRoomNumber() {
        return this.roomNumber;
    }
}


