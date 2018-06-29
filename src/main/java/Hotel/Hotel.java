package Hotel;

import Hotel.Rooms.Bedroom;
import Hotel.Rooms.ConferenceRoom;
import Hotel.Rooms.DiningRoom;

import java.util.ArrayList;

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

    public ArrayList<Bedroom> getBedrooms(){
        return new ArrayList<>(this.bedrooms);
    }

    public ArrayList<DiningRoom> getDiningRoom(){
        return new ArrayList<>(this.diningRooms);
    }

    public ArrayList<ConferenceRoom> getConferenceRooms(){
        return new ArrayList<>(this.conferenceRooms);
    }

    public void checkInGuest(){

    }
}
