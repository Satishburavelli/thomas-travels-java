package com;
import java.util.ArrayList;


public class Travel {

	public boolean isCarDriver(Driver driver)
	{
		if(driver.getCategory().equalsIgnoreCase("car"))
		{
			return true;
		}
		return false;
	}
	public String  RetriveByDriverid(ArrayList<Driver> driverList , int driverID)
	{
		for(Driver d : driverList)
		{
			
		if(d.getId() == driverID)
		{
			return "Driver name is " + d.getName() + "  belong to this category" + d.getCategory() + "travelled" + d.getTotal_Distance()+ "Km so far.";
		}
		}
		    return "Driver not found";
    }
		

	public int RetriveCountOfDrivers(ArrayList<Driver> driverList ,String driverCategory)
	{
		int count = 0;
		for(Driver d : driverList)
		{
			if(d.getCategory().equalsIgnoreCase(driverCategory))
			{
				count++;
			}
		}
		return count++;
	}
    public ArrayList<Driver> retriveDriver(ArrayList<Driver> driverList ,String category)
    {
    	ArrayList<Driver>result  = new ArrayList<>();
    	for( Driver d : driverList)
    	{
    		if(d.getCategory().equalsIgnoreCase(category))
    		{
    			result.add(d);
    		}
    	}
    	return result;
    } 
    public Driver RetriveMaximumDistanceTravelledDriver(ArrayList<Driver> driverList)
    {
    	Driver maxdriver = driverList.get(0);
    	for(Driver d: driverList)
    	{
    		if(d.getTotal_Distance() > maxdriver.getTotal_Distance())
    		{
    			maxdriver = d; 
    		}
    	}
    	return maxdriver;
    }
}
