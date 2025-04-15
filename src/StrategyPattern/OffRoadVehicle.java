package StrategyPattern;

public class OffRoadVehicle extends Vehicle{
    public OffRoadVehicle() {
        super(new SportDriveStrategy());
    }
}
