public class Paint extends VehicleDecorator {
    Vehicle vehicle;
    public Paint(Vehicle vehicle){
        this.vehicle = vehicle;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return vehicle.toString() + ", fancy paint";
    }

    @Override
    public double getCost() {
        return vehicle.getCost() + 150;
    }
    
}
