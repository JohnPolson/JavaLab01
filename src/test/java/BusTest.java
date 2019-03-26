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
        assertEquals(1, bus.addPassenger(person));
    }

    @Test
    public void checkAddPassengerWhenFull() {

    }

    @Test
    public void checkRemovePassenger() {
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(3, bus.removePassenger());
    }

}
