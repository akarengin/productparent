package com.enginakar.product.dao;

import java.util.HashMap;
import java.util.Map;

import com.enginakar.product.dto.Product;

public class ProductDaoImpl implements ProductDao {
	
	Map<Integer, Product> products = new HashMap<>();

	@Override
	public void create(Product product) {
		products.put(product.getId(), product);
	}

	@Override
	public Product read(int id) {
		return products.get(id);
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub

	}

}
