package com.runnablepatterns.facadepattern;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Class to store customer details
 *
 */
public class Customer {
	/**
	 * Variable to store customer name
	 */
	private String name;
	
	/**
	 * Variable to store customer address
	 */
	private String address;
	
	/**
	 * Overloade constructor
	 * @param _name Customer name
	 * @param _address Customer address
	 */
	public Customer(String _name, String _address) {
		this.setName(_name);
		this.setAddress(_address);
	}
	
	/**
	 * Get the customer name
	 * @return The customer name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Set the customer name
	 * @param name The name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Get the customer address
	 * @return The customer address
	 */
	public String getAddress() {
		return address;
	}
	
	/**
	 * Set the customer address
	 * @param address The address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
	 * Save customer information
	 */
	public void saveClient() {
		System.out.println(String.format("Saving customer: %s with address %s", this.getName(), this.getAddress()));
	}
}
