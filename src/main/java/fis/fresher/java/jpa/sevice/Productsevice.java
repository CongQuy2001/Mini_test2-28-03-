package fis.fresher.java.jpa.sevice;

import java.util.List;

import fis.fresher.java.jpa.entity.Customer;
import fis.fresher.java.jpa.entity.OrderRow;
import fis.fresher.java.jpa.entity.Product;

public interface Productsevice {
	Product addProduct(Product product);
	Product updateProduct(Product product);
	String deleteProduct(Long productId);
	Product findById(Long productId);
}
