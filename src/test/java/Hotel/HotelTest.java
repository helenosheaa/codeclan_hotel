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
    ArrayList<Guest> guests;
    Bedroom bedroom1;
    DiningRoom diningRoom1;
    ConferenceRoom conferenceRoomA;
    Guest guest1;
    Guest guest2;

    @Before
    public void before() {
        guest1 = new Guest("Helen");
        guest2 = new Guest("Nick");
        guests = new ArrayList<>();
        guests.add(guest1);
        guests.add(guest2);

        bedroom1 = new Bedroom(21, guests, RoomType.DOUBLE);
        bedrooms = new ArrayList<>();
        bedrooms.add(bedroom1);

        diningRoom1 = new DiningRoom(guests, RoomType.DINING);
        diningRooms = new ArrayList<>();
        diningRooms.add(diningRoom1);

        conferenceRoomA = new ConferenceRoom(guests, RoomType.CONFERENCE);
        conferenceRooms = new ArrayList<>();
        conferenceRooms.add(conferenceRoomA);


        hotel = new Hotel("CodeClan Towers", bedrooms, conferenceRooms, diningRooms, guests);
    }

    @Test
    public void hasBedrooms(){
        assertEquals(bedrooms, hotel.getBedrooms());
    }

    @Test
    public void hasDiningRoom(){
        assertEquals(diningRooms, hotel.getDiningRooms());
    }

    @Test
    public void hasConferenceRooms(){
        assertEquals(conferenceRooms, hotel.getConferenceRooms());
    }

//    @Test
//    public void canCheckInGuest(){
//        hotel.checkInGuest(bedroom1, guest1);
//        assertEquals(1, bedroom1.getGuests().size());
//    }

}
