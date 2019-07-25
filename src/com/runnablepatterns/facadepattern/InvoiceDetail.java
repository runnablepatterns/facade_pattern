package com.runnablepatterns.facadepattern;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Class to handle invoice details
 *
 */
public class InvoiceDetail {

	/**
	 * Variable to store the line number
	 */
	private int lineNumber;
	
	/**
	 * Variable to store the product name
	 */
	private String product;
	
	/**
	 * Variable to store line amount
	 */
	private double amount;
	
	/**
	 * Overloaded constructor
	 * @param _lineNumber Detail line number
	 * @param _product Detail product
	 * @param _amount Detail amount
	 */
	public InvoiceDetail(int _lineNumber, String _product, double _amount) {
		this.setLineNumber(_lineNumber);
		this.setProduct(_product);
		this.setAmount(_amount);
	}

	/**
	 * @return the lineNumber
	 */
	public int getLineNumber() {
		return lineNumber;
	}

	/**
	 * @param lineNumber the lineNumber to set
	 */
	public void setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
	}

	/**
	 * @return the product
	 */
	public String getProduct() {
		return product;
	}

	/**
	 * @param product the product to set
	 */
	public void setProduct(String product) {
		this.product = product;
	}

	/**
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	/**
	 * Check if detail is valid
	 */
	public void checkInvoiceDetail() {
		System.out.println(String.format("Line: %s for product %s with amount $%s - Checked.", this.getLineNumber(), 
				this.getProduct(), this.getAmount()));
	}
	
	/**
	 *  Add the invoice
	 */
	public void addInvoice(Invoice invoice) {
		System.out.println(String.format("Invoice: %s added to Invoice Detail: %s", invoice.getInvoiceNumber(),
				this.getLineNumber()));
	}
	
	/**
	 * Save current details
	 */
	public void saveInvoiceDetail() {
		System.out.println(String.format("Detail: %s saved.", this.getLineNumber()));
	}
}
