public class Rims extends VehicleDecorator {
    Vehicle vehicle;
    public Rims (Vehicle vehicle){
        this.vehicle = vehicle;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return vehicle.toString() + ", cool rims";
    }

    @Override
    public double getCost() {
        // TODO Auto-generated method stub
        return vehicle.getCost() + 200;
    }
    
}
