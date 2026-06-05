package com;
import java.util.ArrayList;

public class TestDriver 
{
	public static void main(String[] args)
	{
		Driver d1 = new Driver(1,"Sai Ram","Car",3773);
		Driver d2 = new Driver(2,"Mr Blue","car",7337);
		Driver d3 = new Driver(3,"Rahul", "Auto",1200);
		Driver d4 = new Driver(4,"Akhil","lorry",4500);
	
	ArrayList<Driver>driverList =new ArrayList<>();
	driverList.add(d1);
	driverList.add(d2);
	driverList.add(d3);
	driverList.add(d4);
	Travel travel = new Travel();
	System.out.println("Is car driver : " + travel.isCarDriver(d1));
	System.out.println(travel.RetriveByDriverid(driverList ,1));
	System.out.println("Car Drivers Count :" +travel.RetriveCountOfDrivers(driverList , "car"));
    ArrayList<Driver> carDrivers = travel.retriveDriver(driverList, "Car");
    System.out.println("Drivers belonging to Car category:");
    for (Driver d : carDrivers) {
        System.out.println(d.getName());
    }
    Driver maxDriver = travel.RetriveMaximumDistanceTravelledDriver(driverList);
    System.out.println("Maximum distance travelled by: " + maxDriver.getName());
}
}
