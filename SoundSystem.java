public class SoundSystem extends VehicleDecorator{
    Vehicle vehicle;

    public SoundSystem(Vehicle vehicle){
        this.vehicle = vehicle;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return vehicle.toString() + ", awesome sound";
    }

    @Override
    public double getCost() {
        // TODO Auto-generated method stub
        return vehicle.getCost() + 350;
    }
    
}
