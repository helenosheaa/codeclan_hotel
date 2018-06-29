package Hotel.Rooms;

import Hotel.Guest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningRoom;
    ArrayList<Guest> guests;
    Guest guest1;
    Guest guest2;

    @Before
    public void before(){
        guest1 = new Guest("Nick");
        guest2 = new Guest("Helen");
        guests = new ArrayList<>();
        guests.add(guest1);
        guests.add(guest2);
        diningRoom = new DiningRoom(guests, RoomType.DINING);
    }

    @Test
    public void canGetCapacity(){
        assertEquals(20, diningRoom.getCapacity());
    }

    @Test
    public void canGetRoomRate(){
        assertEquals(100, diningRoom.getRoomRate(), 0.01);
    }

    @Test
    public void canGetRoomType(){
        assertEquals("Dining Room", diningRoom.getRoomType());
    }

    @Test
    public void canGetGuests(){
        assertEquals(guests, diningRoom.getGuests());
    }
}
