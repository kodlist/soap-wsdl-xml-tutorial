package org.mehar.javabrains;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.mehar.javabrains.business.ProductServiceImpl;
import org.mehar.javabrains.model.Product;

@WebService(name="TestMartCatalog", portName="TestMartCatalogPort", serviceName="TestMartCatalogService"
				, targetNamespace="http://testmart.com")
public class ProductCatalog implements ProductCatalogInterface {
	
	ProductServiceImpl productService = new ProductServiceImpl();
	
	/*
	 * opearation - getProductCategories
	 */
	/* (non-Javadoc)
	 * @see org.mehar.javabrains.ProductCatalogInterface#getProductCategories()
	 */
	@Override
	@WebMethod(action="fetch_categories", operationName="fetchCategories")
	public List<String> getProductCategories(){
		
		return productService.getProductCategories();
	}
	
	/*
	 * opearation - getProducts
	 */
	/* (non-Javadoc)
	 * @see org.mehar.javabrains.ProductCatalogInterface#getProducts(java.lang.String)
	 */
	@Override
	@WebMethod
	public List<String> getProducts(String category)
	{
		return productService.getProducts(category);
	}
	
	/* (non-Javadoc)
	 * @see org.mehar.javabrains.ProductCatalogInterface#getProductsv2(java.lang.String)
	 */
	@Override
	@WebMethod
	public List<Product> getProductsv2(String category)
	{
		return productService.getProductsv2(category);
	}
	/*
	 * opearation - addProduct
	 */
	/* (non-Javadoc)
	 * @see org.mehar.javabrains.ProductCatalogInterface#addProduct(java.lang.String, java.lang.String)
	 */
	@Override
	@WebMethod
	public boolean addProduct(String category, String product){
		return productService.addProduct(category, product);
	}
	

}
