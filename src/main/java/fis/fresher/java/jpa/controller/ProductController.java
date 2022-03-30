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

import fis.fresher.java.jpa.entity.Product;
import fis.fresher.java.jpa.sevice.Productsevice;

@RestController
@RequestMapping("/product")
public class ProductController {
		@Autowired
		Productsevice productService;
		
		@PostMapping("/add")
		@ResponseBody
		public ResponseEntity<?> add(@RequestBody Product product){
			return ResponseEntity.ok(productService.addProduct(product));
		}
		@PostMapping("/update")
		@ResponseBody
		public ResponseEntity<?> update(@RequestBody Product product){
			return ResponseEntity.ok(productService.updateProduct(product));
		}
		
		@GetMapping("/delete/{productId}")
		@ResponseBody
		public ResponseEntity<?> delete(@PathVariable Long productId){
			return ResponseEntity.ok(productService.deleteProduct(productId));
		}
		@GetMapping("/findById/{productId}")
		@ResponseBody
		public ResponseEntity<?> findById(@PathVariable Long productId){
			return ResponseEntity.ok(productService.findById(productId));
		}
	}

