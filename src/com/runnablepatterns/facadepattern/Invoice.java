package com.runnablepatterns.facadepattern;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Class to handle invoice details
 *
 */
public class Invoice {

	/**
	 * Variable to store invoice consecutive number
	 */
	private String invoiceNumber;
	
	/**
	 * Overloaded constructor
	 * @param _invoiceNumber Invoice number
	 */
	public Invoice(String _invoiceNumber) {
		this.setInvoiceNumber(_invoiceNumber);
	}

	/**
	 * @return the invoiceNumber
	 */
	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	/**
	 * @param invoiceNumber the invoiceNumber to set
	 */
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	
	/**
	 * Add the customer to the invoice
	 * @param customer The customer to add
	 */
	public void addCustomer(Customer customer) {
		System.out.println(String.format("Customer: %s added.", customer.getName()));
	}
	
	/**
	 * Add the store to the invoice
	 * @param store The store to add
	 */
	public void addStore(Store store) {
		System.out.println(String.format("Store: %s added.", store.getName()));
	}
	
	/**
	 * Check the invoice number
	 */
	public void checkInvoiceNumber() {
		System.out.println(String.format("Invoice number: %s is correct.", this.getInvoiceNumber()));
	}
	
	/**
	 * Save current invoice
	 */
	public void saveInvoice() {
		System.out.println(String.format("Invoice: %s header generated.", this.getInvoiceNumber()));
	}
}
