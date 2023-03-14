package com.enginakar.product.dao;

import com.enginakar.product.dto.Product;

public interface ProductDao {
	
	void create(Product product);
	
	Product read (int id);
	
	void update(Product product);
	
	void delete(Product product);

}
