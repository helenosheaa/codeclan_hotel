package Hotel;

import Hotel.Rooms.Bedroom;
import Hotel.Rooms.ConferenceRoom;
import Hotel.Rooms.DiningRoom;
import Hotel.Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    ArrayList<Bedroom> bedrooms;
    ArrayList<DiningRoom> diningRooms;
    ArrayList<ConferenceRoom> conferenceRooms;
    Bedroom bedroom1;
    ArrayList guests;
    Guest guest1;
    Guest guest;
    Bedroom bedrooms;

    @Before
    public void before() {
        hotel = new Hotel("CodeClan Towers", bedrooms, conferenceRooms, diningRooms);
        bedrooms.add(bedroom1);
        bedroom1 = new Bedroom(21, guests, RoomType.SINGLE);
        guest1 = new Guest("Helen");
        guests = new ArrayList<Guest>();
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
        hotel.checkInGuest(bedroom1, guest1);
        assertEquals(1, bedroom1.getGuests().size());
    }

}
