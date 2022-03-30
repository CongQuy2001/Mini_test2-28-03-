package fis.fresher.java.sevice.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import fis.fresher.java.jpa.entity.OrderProduct;
import fis.fresher.java.jpa.entity.OrderRow;
import fis.fresher.java.jpa.sevice.Oderproductsevice;
import fis.fresher.java.jpa.sevice.Ordersevice;
import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class Oderseviceimpl implements Ordersevice {@Override
	public void create(OrderRow oder) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public OrderRow update(OrderRow oder) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderRow> getAllAccounts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderRow getAccountByID(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderRow save(OrderRow oder) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public OrderRow getById(Long orderRowId) {
		// TODO Auto-generated method stub
		return null;
	}





}
