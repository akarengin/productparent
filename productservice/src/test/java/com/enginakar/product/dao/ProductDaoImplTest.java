package com.enginakar.product.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.enginakar.product.dto.Product;

public class ProductDaoImplTest {

	@Test
	public void createShouldCreateAProduct() {
		
		ProductDao dao = new ProductDaoImpl();
		Product product = new Product();
		product.setId(1);
		product.setName("IPhone");
		product.setDescription("Its Awesome!!");
		product.setPrice(800);
		dao.create(product);
		Product result = dao.read(1);
		
		assertNotNull(result);
		assertEquals("IPhone", result.getName());
		
	}

}
