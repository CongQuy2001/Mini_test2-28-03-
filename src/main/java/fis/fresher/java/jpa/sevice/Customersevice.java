package fis.fresher.java.jpa.sevice;

import java.util.List;

import fis.fresher.java.jpa.entity.Customer;
import fis.fresher.java.jpa.entity.OrderRow;

public interface Customersevice {
	Customer addCustomer(Customer customer);
	Customer updateCustomer(Customer customer);
	String deleteCustomer(Long customerId);
	Customer findById(Long customerId);
}
