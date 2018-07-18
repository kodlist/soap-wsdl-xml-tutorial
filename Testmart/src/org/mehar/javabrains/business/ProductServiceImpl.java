package org.mehar.javabrains.business;

import java.util.ArrayList;
import java.util.List;

import org.mehar.javabrains.model.Product;

public class ProductServiceImpl {
	
	List<String> bookList = new ArrayList();
	List<String> musicList = new ArrayList();
	List<String> movieList = new ArrayList();
	

	/*
	 * this is hard coded.
	 */
	public ProductServiceImpl()
	{
		bookList.add("Inferno");bookList.add("Joyland");bookList.add("The President");
		musicList.add("Night Visions");musicList.add("unorthodox jukebox");musicList.add("random access memories");
		movieList.add("Incredibles two");movieList.add("sicario");movieList.add("The GodFather 2");
	}
	

	/*
	 * this is new business service method.
	 */
	public List<String> getProductCategories()
	{
		List<String> categories = new ArrayList();
		categories.add("Books");
		categories.add("Music");
		categories.add("Movies");
		return categories;
		
	}
	
	/*
	 * this is new business service method.
	 */
	public List<String> getProducts(String category){
		
		switch(category.toLowerCase())
		{		
		case "books": return bookList;
		case "music": return musicList;
		case "movies": return movieList;		
		}
		return null;
		
	}
	
	public List<Product> getProductsv2(String category)
	{
		List<Product> productList = new ArrayList<>();
		
		productList.add(new Product("Java Virtual Memory", "1234", 200.00));
		productList.add(new Product("concurrency in java", "4321", 300.00));
		return productList;		
		
	}
	
	/*
	 * this is new business service method.
	 */
	public boolean addProduct(String category, String product){
		
		switch(category.toLowerCase())
		{
		case "books": bookList.add(product); break;
		case "music": musicList.add(product); break;
		case "movies": movieList.add(product); break;
		default: return false;
		}
		
		return true;
	}
}
