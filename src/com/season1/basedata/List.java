package com.season1.basedata;
/**
 * 定义基本的List接口方法，主要是如下的五个基本方法
 * @author fengbincao
 */
public interface List {

	public void add(Object o);
	
	public void add(int index, Object o);
	
	public Object get(int index);
	
	public Object remove(int index);
	
	public int size();

}
