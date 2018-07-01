package Hotel;

import Hotel.Rooms.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static Hotel.Rooms.RoomType.DOUBLE;

public class Hotel {

    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<DiningRoom> diningRooms;

    public Hotel(String name, ArrayList<Bedroom> bedrooms, ArrayList<ConferenceRoom> conferenceRooms, ArrayList<DiningRoom> diningRooms) {
        this.name = name;
        this.bedrooms = bedrooms;
        this.diningRooms = diningRooms;
        this.conferenceRooms = conferenceRooms;
    }

    public String getName(){
        return this.name;
    }

    public ArrayList<Bedroom> getBedrooms(){
        return new ArrayList<>(this.bedrooms);
    }

    public ArrayList<DiningRoom> getDiningRooms(){
        return new ArrayList<>(this.diningRooms);
    }

    public ArrayList<ConferenceRoom> getConferenceRooms(){
        return new ArrayList<>(this.conferenceRooms);
    }


    public void checkInGuest(Room bedroom, Guest guest){
        bedroom.addGuest(guest);
    }


}
