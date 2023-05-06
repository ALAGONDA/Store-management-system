package com.mystore;
/*The product details are listed down here
 its characteristics like 
 ProductId,ProductName,ProductPrice & ItsType 
  */
public class Product {
	private Integer ProductId;
	private String ProductName;
	private Double ProductPrice;
	private Type ProductType;

	public Product(Integer id, String name, Double price, Type type) {
		super();
		this.ProductId = id;
		this.ProductName = name;
		this.ProductPrice = price;
		this.ProductType = type;
	}

     public double remove(double price) {
		
		return ProductPrice=price;
		
	}

	public Double getPrice() {
		return ProductPrice;
	}

	public double setPrice(Double price) {
		this.ProductPrice = price;
		return price;
	}


	@Override
	public String toString() {
		return "Product [id=" + ProductId + ", name=" + ProductName + ", price=" + ProductPrice + ", type=" + ProductType + "]";
	}


}
