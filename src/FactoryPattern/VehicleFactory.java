package FactoryPattern;

public class VehicleFactory {
    public static Vehicle getVehicle(String vehicleType) {
        Vehicle vehicle = null;
        if(vehicleType.equalsIgnoreCase("car"))
        {
            vehicle= new Car();
        }
        else if(vehicleType.equalsIgnoreCase("bike"))
        {
            vehicle= new Bike();
        }
        return vehicle;
    }
}
