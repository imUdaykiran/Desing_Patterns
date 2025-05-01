package FactoryPattern;

import java.util.Scanner;

public class Client {
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter vehicle name: ");
        String vehicleType=sc.nextLine();
        System.out.println(vehicleType);
        Vehicle vehicle = VehicleFactory.getVehicle(vehicleType);
        vehicle.createVehicle();
    }
}
