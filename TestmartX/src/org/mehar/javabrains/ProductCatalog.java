package org.mehar.javabrains;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.mehar.javabrains.business.ProductServiceImpl;
import org.mehar.javabrains.model.Product;

@WebService(endpointInterface="org.mehar.javabrains.ProductCatalogInterface", portName="TestMartCatalogPort", serviceName="TestMartCatalogService")
public class ProductCatalog implements ProductCatalogInterface {
	
	ProductServiceImpl productService = new ProductServiceImpl();
	
	
	
	public List<String> getProductCategories(){
		
		return productService.getProductCategories();
	}
	
	
	
	public List<String> getProducts(String category)
	{
		return productService.getProducts(category);
	}
	
	
	public List<Product> getProductsv2(String category)
	{
		return productService.getProductsv2(category);
	}
	
	public boolean addProduct(String category, String product){
		return productService.addProduct(category, product);
	}
	

}
