import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;
    Person person;


    @Before
    public void before() {
        bus = new Bus ("Glasgow", 50);
        person = new Person();
    }

    @Test
    public void hasDestination(){
        assertEquals("Glasgow", bus.getDestination());
    }

    @Test
    public void hasCapacity() {
        assertEquals(50, bus.getCapacity());
    }

    @Test
    public void busStartsEmpty() {
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void checkAddPassenger() {

        bus.addPassenger(person);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void checkAddPassengerWhenFull() {
        bus = new Bus ("Dundee", 2);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(2, bus.passengerCount());
    }

    @Test
    public void checkRemovePassenger() {
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.removePassenger();
        assertEquals(3, bus.passengerCount());
    }

}
