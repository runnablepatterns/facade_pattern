package com.runnablepatterns.facadedemo;

import java.util.ArrayList;

import com.runnablepatterns.facadepattern.Customer;
import com.runnablepatterns.facadepattern.Invoice;
import com.runnablepatterns.facadepattern.InvoiceDetail;
import com.runnablepatterns.facadepattern.InvoiceDiscountDetail;
import com.runnablepatterns.facadepattern.InvoiceFacade;
import com.runnablepatterns.facadepattern.InvoiceTaxDetail;
import com.runnablepatterns.facadepattern.Store;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Class to demonstrate Facade pattern
 *
 */
public class FacadePatternDemo {

	public static void main(String[] args) {
		// create the customer
		Customer customer = new Customer("John Dale", "San Jose");

		// create the store
		Store store = new Store("StoreABC", "506-1234-5678");
		
		// create the invoice
		Invoice invoice = new Invoice("INV-001");
		
		// store taxes list
		ArrayList<InvoiceTaxDetail> taxes = new ArrayList();
		
		// create tax and add it to taxes
		taxes.add(new InvoiceTaxDetail("Sales Tax", 13.0));
		taxes.add(new InvoiceTaxDetail("Service Tax", 2.0));
		
		// store discounts
		ArrayList<InvoiceDiscountDetail> discounts = new ArrayList();
		
		// create discount and add it to discounts
		discounts.add(new InvoiceDiscountDetail("DiscountA", 10.0));
		discounts.add(new InvoiceDiscountDetail("DiscountB", 5.0));
		
		// store details
		ArrayList<InvoiceDetail> details = new ArrayList();
		
		// create detail and add it to details
		details.add(new InvoiceDetail(1, "ProductA", 3000));
		details.add(new InvoiceDetail(2, "ProductB", 5000));
		details.add(new InvoiceDetail(3, "ProductC", 1000));
		
		// create Invoice faced using all required objects
		InvoiceFacade invoiceFacade = new InvoiceFacade(customer, store, invoice, taxes, discounts, details);
		
		// save the invoice
		invoiceFacade.saveInvoice();
		
		System.out.println("Process completed!");
	}

}
