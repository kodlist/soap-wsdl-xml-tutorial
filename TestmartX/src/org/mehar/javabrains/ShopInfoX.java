package org.mehar.javabrains;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;


@WebService
public class ShopInfoX {
	
	@WebMethod
	@WebResult(partName="lookupOutput") 
	public String getShopInfo(@WebParam(partName="lookupInput") String property)throws InvalidInputException
	{
		String response =null;
		
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
