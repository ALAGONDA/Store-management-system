package com.mystore;
/* Here all the Customer demanded products are detailed like which products and how much of the Quantities etc.... */
public class CustomerProductsDTO {
	private Integer productId;
	private String productName;
	private Type productType;
	private Double ProductPrice;
	private Double QuantityOfProduct;

	public CustomerProductsDTO(Integer productId, String productName,double quantity , Type productType,double price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productType = productType;
		this.ProductPrice = price;
		this.QuantityOfProduct=quantity;
	
	}

	
	public Integer getProductId() {
		return productId;
	}



	public void setProductId(Integer productId) {
		this.productId = productId;
	}



	public String getProductName() {
		return productName;
	}



	public void setProductName(String productName) {
		this.productName = productName;
	}



	public Type getProductTye() {
		return productType;
	}



	public void setProductTye(Type productTye) {
		this.productType = productTye;
	}



	public Double getQuantity() {
		return QuantityOfProduct;
	}



	public void setQuantity(Double quantity) {
		this.QuantityOfProduct = quantity;
	}



	public Double getPrice() {
		return ProductPrice;
	}

	public void setPrice(Double price) {
		this.ProductPrice= price;
	}

	@Override
	public String toString() {
		
		return "CustomerProductsDTO [productId=" + productId + ", productName=" + productName + ", quantity="
				+QuantityOfProduct  + ", ProductType=" +productType  + ", price=" + ProductPrice+ "]";
	}



}
