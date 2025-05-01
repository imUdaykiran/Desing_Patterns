package FactoryPattern;

public class Bike implements Vehicle{
    @Override
    public void createVehicle() {
        System.out.println("creating bike vehicle....");
    }
}
