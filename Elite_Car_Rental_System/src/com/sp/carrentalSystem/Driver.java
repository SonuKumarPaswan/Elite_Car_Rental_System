package com.sp.carrentalSystem;

public class Driver {
	public static void main(String []args) {
		  CarRentalSystem carRentalSystem = new CarRentalSystem();
		  
		    Car car1 = new Car("C001", "Toyota", "Camry", 60.0); // Different base price per day for each car
	        Car car2 = new Car("C002", "Honda", "Accord", 70.0);
	        Car car3 = new Car("C003", "Mahindra", "Thar", 150.0);
	        Car car4 = new Car("C004", "Audi", "Thar", 140.0);

	      
			carRentalSystem.addCar(car1);
			carRentalSystem.addCar(car2);
			carRentalSystem.addCar(car3);
			carRentalSystem.addCar(car4);

			carRentalSystem.menu();
	}

}
