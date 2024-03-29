package com.machinecoding.cab;

import java.util.ArrayList;
import java.util.List;

public class RideService {

	private UserDAO user = null;
	
	private static Integer MAX_DISTANCE =  3;
	
	public static RideService rideService = null;
	
	private RideService() {

	}

	public static RideService getInstance() {
		if(rideService == null) {
			return new RideService();
		}

		return rideService;
	}
	

	public Driver bookRide(int riderId,Location fromLocation,Location toLocation,UserDAO user) throws DriverNotAvailableException {
		Rider rider = user.getRiderMap().get(riderId);
		this.user = user;
		List<Driver> drivers = fetchAvailableDrivers(fromLocation);
		if(drivers.isEmpty()) throw new DriverNotAvailableException();
		drivers.get(0).setAvailable(false);
		
		Ride ride = new Ride(drivers.get(0),rider,fromLocation,toLocation);
		rider.getRides().add(ride);
		return drivers.get(0);
	}
	
	public List<Driver> fetchAvailableDrivers(Location location) {
		List<Driver> driverList = new ArrayList<Driver>();
		
		for(Driver driver : user.getDriverMap().values()) {
			if(driver.isAvailable() && distance(driver.getVehicle().getLocation(), location) < MAX_DISTANCE) {
				driverList.add(driver);
			}
		}
		return driverList;
	}
	
	
	public int distance(Location l1,Location l2) {
		return Math.abs(l1.getX() - l2.getX()) + Math.abs(l1.getY() - l2.getY());//Calculation is wrong it seems Mukesh here
		
		int xDistance = Math.abs(l1.getX() - l2.getX());
		int yDistance =  = Math.abs(l1.getY() - l2.getY();
		return Math.sqrt(xDistance*xDistance + yDistance*yDistance);
		
	}
	
	
}
