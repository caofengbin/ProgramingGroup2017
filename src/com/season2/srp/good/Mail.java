package com.season2.srp.good;

public class Mail {

	private User user;
	
	//针对一个用户发送邮件，所以需要传入用户的信息
	public Mail(User user) {
		this.user = user;
	}
	
	public String getAddress(){
		return user.getEMailAddress();
	}
	
	public String getSubject(){
		return "您关注的产品降价了";
	}
	
	public String getBody(){
		
		return "尊敬的 "+user.getName()+", 您关注的产品 " + this.buildProductDescList() + " 降价了，欢迎购买!" ;		
	}
	
	private String buildProductDescList() {
		List<Product> products = user.getSubscribedProducts();
		//.... 实现略...
		return null;
	}
}
