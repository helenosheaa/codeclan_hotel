package Hotel;

import Hotel.Rooms.Bedroom;
import Hotel.Rooms.ConferenceRoom;
import Hotel.Rooms.DiningRoom;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    ArrayList<Bedroom> bedrooms;
    ArrayList<DiningRoom> diningRooms;
    ArrayList<ConferenceRoom> conferenceRooms;

    @Before
    public void before() {
        hotel = new Hotel("CodeClan Towers", bedrooms, conferenceRooms, diningRooms);
    }

    @Test
    public void hasBedrooms(){
        assertEquals(bedrooms, hotel.getBedrooms());
    }

    @Test
    public void hasDiningRoom(){
        assertEquals(diningRooms, hotel.getDiningRoom());
    }

    @Test
    public void hasConferenceRooms(){
        assertEquals(conferenceRooms, hotel.getConferenceRooms());
    }

    @Test
    public void canCheckInGuest(){

    }

}
