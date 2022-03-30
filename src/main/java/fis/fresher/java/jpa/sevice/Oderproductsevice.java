package fis.fresher.java.jpa.sevice;

import java.util.List;

import fis.fresher.java.jpa.entity.Customer;
import fis.fresher.java.jpa.entity.OrderProduct;
import fis.fresher.java.jpa.entity.OrderRow;
import fis.fresher.java.jpa.entity.Product;

public interface Oderproductsevice {
	OrderProduct addOrderProduct(OrderProduct orderProduct);
	OrderProduct updateOrderProduct(OrderProduct orderProduct);
	void deleteOrderProduct(Long orderProductId);
	
}
