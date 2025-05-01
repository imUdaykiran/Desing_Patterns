package FactoryPattern;

public class Car implements Vehicle{
    @Override
    public void createVehicle() {
        System.out.println("creating car vehicle....");
    }
}
