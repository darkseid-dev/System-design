package Kernal;

import java.util.List;

import Flipkart.Account;
import Flipkart.AppType;
import Flipkart.Person;
import Flipkart.RideSelectionType;

public class Host extends Account{
	public Host(String name, String gender, int age){
		Person person = new Person(name, null, age, gender);
		this.setPerson(person);
	}

	@Override
	public Ride selectRide(int numberOfSeats, RideSelectionType rideSelectionType) {
		return null;
	}

	@Override
	public Ride offerRide(AppType app, Ride ride) {
		List<Ride> rides = app.getAllRides();
		app.addRide(ride);
		String hostName = ride.getName();
		List<Host> host = app.getAllHost();
		//get host with name hostName
		
		for(int i=0;i<host.size();i++){
			if(host.get(i).getPerson().getName().equalsIgnoreCase(hostName)) {
				this.setRidesOffered(this.getRidesOffered()+1);
				break;
			}
		}
		return ride;
	}
}
