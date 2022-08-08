package com.yedam.product;

public class Product {
	/*
	 * product_id varchar2(100) primary key,
	 * product_name varchar2(100) not null,
	 * product_price number not null,
	 * product_explain varchar2(4000),
	 * product_sales number default 0,
	 * stores varchar2(100)
	 */

	private String productId;
	private String productName;
	private int productPrice;
	private String productExplain;
	private int productSales;
	private String stores;

	public String getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public String getProductExplain() {
		return productExplain;
	}

	public int getProductSales() {
		return productSales;
	}

	public String getStores() {
		return stores;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public void setProductExplain(String productExplain) {
		this.productExplain = productExplain;
	}

	public void setProductSales(int productSales) {
		this.productSales = productSales;
	}

	public void setStores(String stores) {
		this.stores = stores;
	}
}
