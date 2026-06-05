package com;

public class Driver 
{
	private int id;
	private String name;
	private String category;
	private double totaldistance;
	
public Driver(int id , String name ,String category , double total_distance)
{
	this.id = id;
	this.name = name;
	this.category = category;
	this.totaldistance = total_distance;	
}
public int getId()
{
	return id;
	
}
public void setId(int id)
{
	this.id = id;
}
public String getName()
{
	return name;
}
public void setName( String name)
{
	this.name = name;
}
public String getCategory()
{
	return category;
}
public void setCategory(String category)
{
	this.category = category;
}
public double getTotal_Distance()
{
	return totaldistance;
}
public void setTotal_Distance(double Total_Distance)
{
	this.totaldistance = Total_Distance;
}
}