package Hotel.Rooms;

import Hotel.Guest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;
    ArrayList<Guest> guests;
    Guest guest1;
    Guest guest2;

    @Before
    public void before() {
        guest1 = new Guest("Nick");
        guest2 = new Guest("Helen");
        guests = new ArrayList<>();
        guests.add(guest1);
        guests.add(guest2);
        conferenceRoom = new ConferenceRoom(guests, RoomType.CONFERENCE);
    }

    @Test
    public void canGetCapacity(){
        assertEquals(30, conferenceRoom.getCapacity());
        }

    @Test
    public void canGetRoomRate(){
        assertEquals(66.66, conferenceRoom.getRoomRate(), 0.01);
    }

    @Test
    public void canGetRoomType(){
        assertEquals("Conference Room", conferenceRoom.getRoomType());
    }

    @Test
    public void canGetGuests(){
        assertEquals(guests, conferenceRoom.getGuests());
    }
}
