package com.season2.srp.good;

import java.util.List;

public class User {

	private String name;
	private String emailAddress;
	
	private List<Product> subscribeProducts;
	
	public String getName(){
		return name;
	}
	
	public String getEMailAddress() {		
		return emailAddress;
	}
	
	public List<Product> getSubscribedProducts(){
		return this.subscribedProducts;
	}
}
