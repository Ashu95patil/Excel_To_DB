package com.happytech.Product.services;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.happytech.Product.entity.Product;

/**
 * @author morek 
 * implementing encapsulation using interfaces
 *
 */
public interface ProductServiceI {

	public void save(MultipartFile file);
	
	public List<Product> getAllProducts();
	
}
