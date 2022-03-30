package fis.fresher.java.jpa.sevice;

import java.util.List;

import fis.fresher.java.jpa.entity.OrderProduct;
import fis.fresher.java.jpa.entity.OrderRow;

public interface Ordersevice {
	void create(OrderRow oder);
	OrderRow update(OrderRow oder);
	List<OrderRow> getAllAccounts();
	OrderRow getAccountByID(Long id);
	OrderRow save(OrderRow oder);
	void  deleteById(Long id);
	OrderRow getById(Long orderRowId);
	
}
