package Hotel.Rooms;

import Hotel.Guest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
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
        bedroom = new Bedroom(2, guests, "double", 21, 78.99);
    }

    @Test
    public void canGetCapacity(){
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void canGetGuests(){
        assertEquals(guests, bedroom.getGuests());
    }

    @Test
    public void canGetRoomNumber(){
        assertEquals(21,bedroom.getRoomNumber());
    }
}
