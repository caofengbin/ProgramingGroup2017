package com.season1.basedata;
/**
 * 基本二叉树节点的定义
 * @author fengbincao
 */
public class BInaryTreeNode {

	private Object data;
	private BInaryTreeNode left;
	private BInaryTreeNode right;
	
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
	public BInaryTreeNode getLeft() {
		return left;
	}
	public void setLeft(BInaryTreeNode left) {
		this.left = left;
	}
	
	public BInaryTreeNode getRight() {
		return right;
	}
	public void setRight(BInaryTreeNode right) {
		this.right = right;
	}
	
	/**
	 * 自己实现插入节点的方法
	 * @param data
	 * @return
	 */
	public BInaryTreeNode insert(Object data) {
		return null;
	}
}
