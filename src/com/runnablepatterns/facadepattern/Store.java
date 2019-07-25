package com.runnablepatterns.facadepattern;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Class to handle store details
 *
 */
public class Store {
	
	/**
	 * Variable to handle store name
	 */
	private String name;
	
	
	/**
	 * Variable to handle store phone
	 */
	private String phone;

	/**
	 * Overloaded constructor
	 * @param _name Store name
	 * @param _phone Store phone
	 */
	public Store(String _name, String _phone) {
		this.setName(_name);
		this.setPhone(_phone);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}


	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * Save store information
	 */
	public void saveStore() {
		System.out.println(String.format("Saving store: %s phone: %s", this.getName(), this.getPhone()));
	}
}
