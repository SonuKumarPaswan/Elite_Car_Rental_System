package com.sp.carrentalSystem;


public class Car {
	private String carId;
	private String  brand;
	private String model;
	private double basePricePerDays;
	private boolean isAvailable;
	
	public Car(String carId,String brand, String model, double basePricePerDays) {
		this.carId=carId;
		this.brand=brand;
		this.model=model;
		this.basePricePerDays=basePricePerDays;
		this.isAvailable=true;
	}
	public String getCarId() {
		return carId;
	}
	public String getBrand() {
		return brand;
	}
	public String getModel() {
		return model;
	}
	public double calculatePrice(double rentalDays) {
		
		return basePricePerDays*rentalDays;
	}
	
	public boolean isAvailable() {
		return isAvailable;
	}
	public void rentCar() {
		isAvailable=false;
	}
	public void returnCar() {
		isAvailable=true;
	}
	
}