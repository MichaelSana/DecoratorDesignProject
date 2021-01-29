/**
 * Gives the String version of getting a SoundSystem and gives the cost
 * @author Michael Sana
 */
public class SoundSystem extends VehicleDecorator{

    Vehicle vehicle;

    /**
     * Initializes the vehicle which will be getting a sound system
     * @param vehicle
     */
    public SoundSystem(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    /**
     * Gives the string version of what getting a SoundSystem is and adds it to the existing vehicle description
     */
    @Override
    public String toString() {
        return vehicle.toString() + ", awesome sound";
    }

    /**
     * Adds the cost of a SoundSystem onto the existing vehicle
     */
    @Override
    public double getCost() {
        return vehicle.getCost() + 350;
    }
    
}
