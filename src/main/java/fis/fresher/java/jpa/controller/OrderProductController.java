package fis.fresher.java.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import fis.fresher.java.jpa.entity.OrderProduct;
import fis.fresher.java.jpa.sevice.Oderproductsevice;

@RestController
@RequestMapping("/order")
public class OrderProductController {
	@Autowired
	Oderproductsevice orderProductService;
	@PostMapping("/add")
	@ResponseBody
	public ResponseEntity<?> add(@RequestBody OrderProduct orderProduct){
		return  ResponseEntity.ok(orderProductService.addOrderProduct(orderProduct));
	}
	@PostMapping("/update")
	@ResponseBody
	public ResponseEntity<?> update(@RequestBody OrderProduct orderProduct){
		return  ResponseEntity.ok(orderProductService.updateOrderProduct(orderProduct));
	}
	@GetMapping("/delete/{orderId}")
	@ResponseBody
	public ResponseEntity<?> delete(@PathVariable Long orderId){
		orderProductService.deleteOrderProduct(orderId);
		return ResponseEntity.ok("Thanh Cong");
	}
	
}
