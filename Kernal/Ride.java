package Kernal;

import Flipkart.Vehicle;

public class Ride {
	private String source;
	private String destination;
	private float duration;
	private float startTime;
	private int numberOfSeats;
	private float endTime;
	private String name;
	private Vehicle vehicle;
	
	public Ride(String name, String source, int numberOfSeats, Vehicle vehicle, String destination, float startTime, float endTime, float duration){
		this.destination = destination;
		this.numberOfSeats = numberOfSeats;
		this.name = name;
		this.source = source;
		this.vehicle = vehicle;
		this.startTime = startTime;
		this.endTime = endTime;
		this.duration = duration;	
	}
	public Ride() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public float getEndTime() {
		return endTime;
	}
	public void setEndTime(float endTime) {
		this.endTime = endTime;
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
	public int getNumberOfSeats() {
		return numberOfSeats;
	}
	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
}
