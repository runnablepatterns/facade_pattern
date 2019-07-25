package com.runnablepatterns.facadepattern;

import java.util.ArrayList;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Class that represents the Facade pattern
 *
 */
public class InvoiceFacade {
	
	/**
	 * Variable to reference customer details
	 */
	private Customer customer;
	
	/**
	 * Variable to reference store details
	 */
	private Store store;
	
	/**
	 * Variable to reference invoice details
	 */
	private Invoice invoice;
	
	/**
	 * Variable to reference tax details
	 */
	private ArrayList<InvoiceTaxDetail> taxes;
	
	/**
	 * Variable to reference discount details
	 */
	private ArrayList<InvoiceDiscountDetail> discounts;
	
	/**
	 * Variable to reference invoice details
	 */
	private ArrayList<InvoiceDetail> details;

	/**
	 * Overloaded constructor
	 * @param _customer Customer to store
	 * @param _store Store to save
	 * @param _invoice Invoice to store
	 * @param _taxes Taxes list applied to invoice
	 * @param _discounts Discount list applied to invoice
	 * @param _details Invoice details
	 */
	public InvoiceFacade(Customer _customer, Store _store, Invoice _invoice, ArrayList<InvoiceTaxDetail> _taxes,
			ArrayList<InvoiceDiscountDetail> _discounts, ArrayList<InvoiceDetail> _details) {
		this.customer = _customer;
		this.store = _store;
		this.invoice = _invoice;
		this.taxes = _taxes;
		this.discounts = _discounts;
		this.details = _details;
	}
	
	/**
	 * Handle Invoice save process and steps
	 */
	public void saveInvoice() {
		
		// check invoice number is valid
		invoice.checkInvoiceNumber();
				
		// add customer and store
		invoice.addCustomer(customer);
		invoice.addStore(store);
		
		// store invoice header
		invoice.saveInvoice();
				
		// add invoice to taxes and save
		for (InvoiceTaxDetail invoiceTaxDetail : taxes) {
			invoiceTaxDetail.checkTaxDetail();
			invoiceTaxDetail.addInvoice(invoice);
			invoiceTaxDetail.saveTaxDetail();
		}
				
		// add invoice to discounts and save
		for (InvoiceDiscountDetail invoiceDiscountDetail : discounts) {
			invoiceDiscountDetail.checkDiscountDetail();
			invoiceDiscountDetail.addInvoice(invoice);
			invoiceDiscountDetail.saveDiscountDetail();
		}
				
		// add invoice to details and save
		for (InvoiceDetail invoiceDetail : details) {
			invoiceDetail.checkInvoiceDetail();
			invoiceDetail.addInvoice(invoice);
			invoiceDetail.saveInvoiceDetail();
		}
	}
}
