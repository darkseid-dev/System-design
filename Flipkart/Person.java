package Flipkart;

public class Person {
	public Person(String name, Address address, int age, String gender) {
		this.name = name;
		this.address = address;
		this.age = age;
		this.gender = gender;
	}
	private String name;
	private Address address;
	
	private String gender;
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private int age;
	
	
}
