package org.mehar.javabrains;

import java.util.List;

import javax.jws.WebMethod;

import org.mehar.javabrains.model.Product;

public interface ProductCatalogInterface {

	/*
	 * opearation - getProductCategories
	 */
	public abstract List<String> getProductCategories();

	/*
	 * opearation - getProducts
	 */
	public abstract List<String> getProducts(String category);

	public abstract List<Product> getProductsv2(String category);

	/*
	 * opearation - addProduct
	 */
	public abstract boolean addProduct(String category, String product);

}