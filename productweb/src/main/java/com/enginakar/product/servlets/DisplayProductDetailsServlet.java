package com.enginakar.product.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.enginakar.product.bo.ProductBO;
import com.enginakar.product.bo.ProductBOImpl;
import com.enginakar.product.dto.Product;

/**
 * Servlet implementation class DisplayProductDetailsServlet
 */
public class DisplayProductDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		ProductBO bo = new ProductBOImpl();
		Product product = bo.find(Integer.parseInt(request.getParameter("id")));
		
		PrintWriter out = response.getWriter();
		out.println("Product Details");
		out.println("Product ID: " + product.getId());
		out.println("Product Name: " + product.getName());
		out.println("Product Description: " + product.getDescription());
		out.print("Product Price: " + product.getPrice());
	}

}
