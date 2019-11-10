package Kernal;
import java.util.ArrayList;
import java.util.List;

import Flipkart.AppType;

public class RideSharingApp implements AppType{
	private List<Host> listOfHost;
	private List<Passenger> listOfPassenger;
	private List<Ride> rides;
	
	public List<Host> getListOfHost() {
		return listOfHost;
	}

	public void setListOfHost(List<Host> listOfHost) {
		this.listOfHost = listOfHost;
	}

	public List<Passenger> getListOfPassenger() {
		return listOfPassenger;
	}

	public void setListOfPassenger(List<Passenger> listOfPassenger) {
		this.listOfPassenger = listOfPassenger;
	}

	public List<Ride> getRides() {
		return rides;
	}

	public void setRides(List<Ride> rides) {
		this.rides = rides;
	}

	public RideSharingApp(){
		listOfHost = new ArrayList<Host>();
		listOfPassenger = new ArrayList<Passenger>();
		rides = new ArrayList<Ride>();
	}
	
	@Override
	public List<Host> getAllHost() {
		return listOfHost;
	}
	@Override
	public List<Passenger> getAllPassenger() {
		return listOfPassenger;
	}
	@Override
	public boolean addHost(Host host) {
		if(host!=null) {
			listOfHost.add(host);
			return true;
		}
		return false;
	}
	@Override
	public boolean addPassenger(Passenger passenger) {
		if(passenger!=null) {
		listOfPassenger.add(passenger);
		return true;
		}
		return false;
	}

	@Override
	public List<Ride> getAllRides() {
		// TODO Auto-generated method stub
		return rides;
	}

	@Override
	public boolean addRide(Ride ride) {
		rides.add(ride);
		return false;
	}
}
