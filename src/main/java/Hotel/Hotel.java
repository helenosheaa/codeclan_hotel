package Hotel;

import Hotel.Rooms.Bedroom;
import Hotel.Rooms.ConferenceRoom;
import Hotel.Rooms.DiningRoom;
import Hotel.Rooms.Room;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<DiningRoom> diningRooms;
    private ArrayList<Guest> guests;

    public Hotel(String name, ArrayList<Bedroom> bedrooms, ArrayList<ConferenceRoom> conferenceRooms, ArrayList<DiningRoom> diningRooms, ArrayList<Guest> guests) {
        this.name = name;
        this.bedrooms = bedrooms;
        this.diningRooms = diningRooms;
        this.conferenceRooms = conferenceRooms;
        this.guests = guests;
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

    public ArrayList<Guest> getGuests(){
        return new ArrayList<>(this.guests);
    }

//    public void checkInGuest(Room bedroom, Guest guest){
//        if (bedroom.getGuests().size() == 0) {
//            bedroom.getGuests().add(guest);
//        }
//    }
}
