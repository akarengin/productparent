package com.enginakar.product.bo;

import com.enginakar.product.dao.ProductDao;
import com.enginakar.product.dao.ProductDaoImpl;
import com.enginakar.product.dto.Product;

public class ProductBOImpl implements ProductBO {

	private static ProductDao dao = new ProductDaoImpl();
	
	@Override
	public void create(Product product) {
		dao.create(product);
	}

	@Override
	public Product find(int id) {
		return dao.read(id);
	}

}
