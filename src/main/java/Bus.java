import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
    }


    public String getDestination() {
        return this.destination;
    }

    public int getCapacity() {
        return this.capacity;
    }


    public int passengerCount() {
        return this.passengers.size();
    }


    public int addPassenger(Person person) {
        if (this.passengers.size() < this.capacity) {
            passengers.add(person);
        }
        return this.passengers.size();


    }


    public int removePassenger() {
        this.passengers.remove(0);
                return this.passengers.size();
    }
}
