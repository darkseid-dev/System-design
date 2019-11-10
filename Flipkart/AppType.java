package Flipkart;

import java.util.List;

import Kernal.Host;
import Kernal.Passenger;
import Kernal.Ride;

public interface AppType {
	public List<Host> getAllHost();
	public List<Passenger> getAllPassenger();
	public List<Ride> getAllRides();
	public boolean addHost(Host host);
	public boolean addPassenger(Passenger passenger);
	public boolean addRide(Ride ride);
}
