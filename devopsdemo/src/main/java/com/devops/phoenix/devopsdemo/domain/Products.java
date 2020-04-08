package com.devops.phoenix.devopsdemo.domain;

public class Products {

	private int productId;
	private String productName;
	private String productDesc;
	private int productRating;
	private String productImgSrc;
	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Products(int productId, String productName, String productDesc, int productRating, String productImgSrc) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDesc = productDesc;
		this.productRating = productRating;
		this.productImgSrc = productImgSrc;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	public int getProductRating() {
		return productRating;
	}
	public void setProductRating(int productRating) {
		this.productRating = productRating;
	}
	public String getProductImgSrc() {
		return productImgSrc;
	}
	public void setProductImgSrc(String productImgSrc) {
		this.productImgSrc = productImgSrc;
	}
	
	@Override
	public String toString() {
		return "Products [productId=" + productId + ", productName=" + productName + ", productDesc=" + productDesc
				+ ", productRating=" + productRating + ", productImgSrc=" + productImgSrc + "]";
	}
	
	
	
}
