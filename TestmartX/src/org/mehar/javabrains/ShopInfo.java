package org.mehar.javabrains;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

// 

@WebService
public class ShopInfo {
	
	
	@WebMethod
	public String getShopInfo(String property)throws InvalidInputException
	{
		String response ="invalid";
		
		if("shopname".equals(property))
		{
			response ="Test Mart";
		}else if("since".equals(property)){
			response = "since 2012";
			
		}else{
			
			throw new InvalidInputException("Invalidinput", property+" is not a valid input");
		}
		
		return response;
	}

}
