package com.mystore;

import java.io.Serializable;

public class CustomersDTO implements Serializable{
	private String CustomersName;
	
	public Long getCustomersContactNum() {
		return CustomersContactNum;
	}
	public void setCustomersContactNum(Long customersContactNum) {
		CustomersContactNum = customersContactNum;
	}
	private Long CustomersContactNum;
	public CustomersDTO(String name,Long MobileNum ) {
		// TODO Auto-generated constructor stub
		this.CustomersContactNum=MobileNum;
		this.setCustomersName(name);
	}
	public String getCustomersName() {
		return CustomersName;
	}
	public void setCustomersName(String customersName) {
		CustomersName = customersName;
	}

}
