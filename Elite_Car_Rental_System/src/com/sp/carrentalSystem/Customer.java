package com.sp.carrentalSystem;

public class Customer {
	private String customerId;
	private String name;
	private String email;
	
	public Customer(String customerId, String name,String email) {
		this.customerId=customerId;
		this.name=name;
		this.email=email;
	}

	public Customer(String customerId, String name) {
		this.customerId=customerId;
		this.name=name;
		
	}


	public String getCustomerId() {
		return customerId;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}
	
	

}
