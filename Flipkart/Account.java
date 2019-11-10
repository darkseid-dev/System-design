package Flipkart;

import Kernal.Ride;

public abstract class Account {
	private Person person;
	private int ridesTaken;
	private int ridesOffered;
	private accountState state;
	private Vehicle vehicle;
	private String source;
	private String destination;
	private float duration;
	private float startTime;
	private int numberOfSeats;
	private Ride ride;
	
	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public Ride getRide() {
		return ride;
	}

	public void setRide(Ride ride) {
		this.ride = ride;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public float getDuration() {
		return duration;
	}

	public void setDuration(float duration) {
		this.duration = duration;
	}

	public float getStartTime() {
		return startTime;
	}

	public void setStartTime(float startTime) {
		this.startTime = startTime;
	}

	public float getEndTime() {
		return endTime;
	}

	public void setEndTime(float endTime) {
		this.endTime = endTime;
	}

	private float endTime;
	
	
	public accountState getState() {
		return state;
	}

	public void setState(accountState state) {
		this.state = state;
	}

	public int getRidesTaken() {
		return ridesTaken;
	}

	public void setRidesTaken(int ridesTaken) {
		this.ridesTaken = ridesTaken;
	}

	public int getRidesOffered() {
		return ridesOffered;
	}

	public void setRidesOffered(int ridesOffered) {
		this.ridesOffered = ridesOffered;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(String name, String model, String vehicleNumber) {
		Vehicle vehicle = new Vehicle();
		vehicle.setModel(model);
		vehicle.setName(name);
		vehicle.setVehicleNumber(vehicleNumber);
		this.vehicle = vehicle;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	public abstract Ride selectRide(int numberOfSeats, RideSelectionType rideSelectionType);
	
	public abstract Ride offerRide(AppType app, Ride ride);

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
}
