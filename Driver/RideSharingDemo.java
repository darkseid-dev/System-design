package Driver;

import java.util.List;

import Flipkart.AppType;
import Flipkart.Person;
import Flipkart.Vehicle;
import Kernal.Host;
import Kernal.ObjectFactory;
import Kernal.Passenger;
import Kernal.Ride;

public class RideSharingDemo {
	public static void main(String s[]) {
		AppType app = ObjectFactory.getObject("RideShare");
		Host host1 = new Host("Rohan", "Male", 36);
		host1.setVehicle("Rohan", "Swift", "KA-01-12345");
		app.addHost(host1);
		
		Host host2 = new Host("Shashank", "Male", 29);
		host2.setVehicle("Shashank", "Baleno", "TS-0562395");
		app.addHost(host2);
		
		Passenger passenger1 = new Passenger("Nandini", "Female", 29);
		app.addPassenger(passenger1);
		
		Passenger passenger2 = new Passenger("Gaurav", "Male", 29);
		app.addPassenger(passenger2);
		
		Host host3 = new Host("Shipra", "Female", 27);
		host3.setVehicle("Shashank", "Polo", "KA-05-41491");
		app.addHost(host3);
		
		showAllHosts(app);
		showAllPassenger(app);
		
		passenger1.setRidesTaken(1);
		passenger1.setRidesOffered(0);
		
		Ride ride1 = new Ride("Rohan", "hyderabad", 1, new Vehicle("Swift", "KA-01-12345"), "Bangalore", 8, 21, 13);
		app.addRide(ride1);
		Ride ride2 = new Ride("Shipra", "Bangalore", 1, new Vehicle("Scooty", "KA-12-12332"), "Mysore", 6, 16, 10);
		app.addRide(ride2);
		Ride ride3 = new Ride("Shipra", "Bangalore", 2, new Vehicle("Polo", "KA-05-41491"), "Mysore", 18, 22, 4);
		app.addRide(ride3);
		Ride ride4 = new Ride("Shashank", "hyderabad", 2, new Vehicle("Baleno", "TS-05-62395"), "Bangalore", 10, 24, 14);
		app.addRide(ride4);
		
		
		
	}
	
	public static void showAllHosts(AppType app) {
		List<Host> host = app.getAllHost();
		for(int i = 0;i<host.size();i++) {
			Person per = host.get(i).getPerson();
			System.out.print("Person Details:\n" );
			System.out.print(per.getName() + " " + per.getGender() +" " + per.getAge());
			
			Vehicle veh = host.get(i).getVehicle();
			System.out.print("Vehicle Details:\n" );
			System.out.print(veh.getModel() + " " + veh.getVehicleNumber() +" " + veh.getName());
		}
	}
	
	
	public static void showAllPassenger(AppType app) {
		List<Passenger> passenger = app.getAllPassenger();
		for(int i = 0;i<passenger.size();i++) {
			Person per = passenger.get(i).getPerson();
			System.out.print("Person Details:\n" );
			System.out.print(per.getName() + " " + per.getGender() +" " + per.getAge());
			
		}
	}
}
