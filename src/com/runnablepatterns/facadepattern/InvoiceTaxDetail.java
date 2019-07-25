package com.runnablepatterns.facadepattern;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Class to handle invoice tax details
 *
 */
public class InvoiceTaxDetail {

	/**
	 * Variable to store tax name
	 */
	private String taxName;
	
	/**
	 * Variable to store tax value
	 */
	private double taxValue;
	
	/**
	 * Overloaded constructor
	 * @param _taxName Tax name
	 * @param _taxValue Tax value
	 */
	public InvoiceTaxDetail(String _taxName, double _taxValue) {
		this.setTaxName(_taxName);
		this.setTaxValue(_taxValue);
		checkTaxDetail();
	}

	/**
	 * @return the taxName
	 */
	public String getTaxName() {
		return taxName;
	}

	/**
	 * @param taxName the taxName to set
	 */
	public void setTaxName(String taxName) {
		this.taxName = taxName;
	}

	/**
	 * @return the taxValue
	 */
	public double getTaxValue() {
		return taxValue;
	}

	/**
	 * @param taxValue the taxValue to set
	 */
	public void setTaxValue(double taxValue) {
		this.taxValue = taxValue;
	}
	
	/**
	 * Check if current tax is valid
	 */
	public void checkTaxDetail() {
		System.out.println(String.format("Tax: %s with value %s%s - Checked.", this.getTaxName(), 
				this.getTaxValue(), "%"));
	}
		
	/**
	 *  Add the invoice
	 */
	public void addInvoice(Invoice invoice) {
		System.out.println(String.format("Invoice: %s added to Tax Detail: %s.", invoice.getInvoiceNumber(),
				this.getTaxName()));
	}
	
	/**
	 * Save current details
	 */
	public void saveTaxDetail() {
		System.out.println(String.format("Tax: %s saved.", this.getTaxName()));
	}
}
