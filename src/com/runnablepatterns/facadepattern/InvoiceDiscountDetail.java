package com.runnablepatterns.facadepattern;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Class to handle invoice discount details
 *
 */
public class InvoiceDiscountDetail {

	/**
	 * Variable to store discount name
	 */
	private String discountName;
	
	/**
	 * Variable to store discount value
	 */
	private double discountValue;
	
	/**
	 * Overloaded constructor
	 * @param _dicountName Discount name
	 * @param _discountValue Discount value
	 */
	public InvoiceDiscountDetail(String _dicountName, double _discountValue) {
		this.setDiscountName(_dicountName);
		this.setDiscountValue(_discountValue);
	}

	/**
	 * @return the discountName
	 */
	public String getDiscountName() {
		return discountName;
	}

	/**
	 * @param discountName the discountName to set
	 */
	public void setDiscountName(String discountName) {
		this.discountName = discountName;
	}

	/**
	 * @return the discountValue
	 */
	public double getDiscountValue() {
		return discountValue;
	}

	/**
	 * @param discountValue the discountValue to set
	 */
	public void setDiscountValue(double discountValue) {
		this.discountValue = discountValue;
	}
	
	/**
	 * Check if current discount is valid
	 */
	public void checkDiscountDetail() {
		System.out.println(String.format("Discount: %s with value %s%s - Checked.", this.getDiscountName(), 
				this.getDiscountValue(), "%"));
	}
	
	/**
	 *  Add the invoice
	 */
	public void addInvoice(Invoice invoice) {
		System.out.println(String.format("Invoice: %s added to Discount Detail: %s", invoice.getInvoiceNumber(),
				this.getDiscountName()));
	}
	
	/**
	 * Save current details
	 */
	public void saveDiscountDetail() {
		System.out.println(String.format("Discount: %s saved.", this.getDiscountName()));
	}
}
