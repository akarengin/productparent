package com.enginakar.product.bo;

import com.enginakar.product.dto.Product;

public interface ProductBO {
	
	void create(Product product);
	
	Product find (int id);

}
