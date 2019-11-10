package Kernal;
import java.util.ArrayList;
import java.util.List;

import Flipkart.Account;
import Flipkart.AppType;
import Flipkart.Person;
import Flipkart.RideSelectionType;

public class Passenger extends Account {
	public Passenger(String name, String gender, int age){
		Person person = new Person(name, null, age, gender);
		this.setPerson(person);
	}
	
	@Override
	public Ride selectRide(int numberOfSeats, RideSelectionType rideSelectionType) {
		AppType app = ObjectFactory.getObject("RideShare");
		List<Host> hosts = app.getAllHost();
		List<Ride> rides = app.getAllRides();
// 		for(int i=0;i<hosts.size();i++) {
// 			Ride ride = hosts.get(i).getRide();
//			if(this.getSource().equalsIgnoreCase(ride.getSource()) && this.getDestination().equalsIgnoreCase(ride.getDestination())
//					&& this.getNumberOfSeats() >= ride.getNumberOfSeats()) {
//				rides.add(ride);
//			}
//		}
 		if(rideSelectionType==RideSelectionType.EarliestRide){	
 			Ride ride = new Ride();
 			ride.setEndTime(Float.MAX_VALUE);
 			for(int i=0;i<rides.size();i++) {
 				if((int)ride.getEndTime()>rides.get(i).getEndTime())
 					ride = rides.get(i);
 			}
 			this.setRidesTaken(this.getRidesTaken()+1);
 			return ride;
 		}
 			
 		else if(rideSelectionType==RideSelectionType.FastestRide) {
 			Ride ride = new Ride();
 			ride.setDuration(Float.MAX_VALUE);
 			for(int i=0;i<rides.size();i++) {
 				if((int)ride.getDuration()>rides.get(i).getDuration())
 					ride = rides.get(i);
 			}
 			this.setRidesTaken(this.getRidesTaken()+1);
 			return ride;
 		}
		
		return null;
	}
	
	public Ride offerRide(AppType app, Ride ride) {
		return null;
	}
}
