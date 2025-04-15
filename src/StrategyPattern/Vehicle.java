package StrategyPattern;

public class Vehicle {
    DriveStrategy driveObject;

    public Vehicle(DriveStrategy driveObject) { //this is called constructer injection
        this.driveObject = driveObject;
    }
    public void drive()
    {
        driveObject.drive();
    }
}
