package fis.fresher.java.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Product {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long productId;
	
	private String name;
	private Double price;
	private String 	description ;


}
