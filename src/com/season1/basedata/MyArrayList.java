package com.season1.basedata;
/**
 * 自己实现的数组结构-ArrayList
 * @author fengbincao
 */
public class MyArrayList implements List {

	private Object[] elementDatas = new Object[10];
	
	public void add(Object o) {
		
	}
	
	public void add(int index, Object o) {
		
	}
	
	public Object get(int index) {
		return null;
	}
	
	/**
	 * remove ordered element
	 * @param index		the sequence of elements to be removed
	 */
	public Object remove(int index) {
		return null;
	}
	
	/**
	 * return the size of current ArralList;
	 * @return
	 */
	public int size() {
		return -1;
	}
	
	public Iterator iterator() {
		return new ArrayListIterrator(this);
	}
	
	private class ArrayListIterrator implements Iterator {

		MyArrayList arrayList = null;
		
		private ArrayListIterrator(MyArrayList arrayList) {
			this.arrayList = arrayList;
		}
		
		@Override
		public boolean hasNest() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
}
