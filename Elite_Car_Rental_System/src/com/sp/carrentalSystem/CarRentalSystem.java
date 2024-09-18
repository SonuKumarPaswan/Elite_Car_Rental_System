package com.sp.carrentalSystem;

import java.util.*;

public class CarRentalSystem {
	private List<Car>cars;
	private List<Customer>customers;
	private List<RentCar> rentcars;
	
	public CarRentalSystem() {
		cars=new ArrayList<>();
		customers=new ArrayList<>();
		rentcars=new ArrayList<>();
	}

	public void addCar(Car car) {
		cars.add(car);
	}
	public void addCustomer(Customer customer) {
		customers.add(customer);
	}
	public void addRentCar(RentCar rentcar) {
		rentcars.add(rentcar);
	}
	public void rentCar(Car car, Customer customer,int days) {
		if(car.isAvailable()) {
			car.rentCar();
			rentcars.add(new RentCar(car,customer, days));
		}else {
			System.out.println("Car is not available for Rent !!!");
		}
	}
	
	public void returnCar(Car car) {
		RentCar rentCarToRemove=null;
		for(RentCar rentcar:rentcars) {
			if(rentcar.getCar()==car) {
				rentCarToRemove=rentcar;
				break;
			}
		}
		if(rentCarToRemove!=null) {
			rentcars.remove(rentCarToRemove);
		}else {
			System.out.println("Car was not rented.!!");
		}
		car.returnCar();
	}
	
	public void menu() {
		Scanner sc= new Scanner(System.in);
		
		while(true) {
			
			System.out.println("---------------Car Rental System Using OOP's concept -----------");
			System.out.println("1. Rent for Car ");
			System.out.println("2. Return for Car");
			System.out.println("3. Exist  for car rental System....");
			System.out.println("-----------Please enter your choise------------");
			
			
			int choice=sc.nextInt();
			sc.nextLine(); // Consume newline 
			
			
			if(choice==1) {
				System.out.println("\n ---------- Welcome !!----- \n -----Rent for Car -------- \n ");
				System.out.println("Please enter your name");
				String customerName=sc.nextLine();
				// Display  Available car
				
				System.out.println("-----------Available Car--------------");
				
				for(Car car: cars) {
					if(car.isAvailable()) {
						System.out.println(car.getCarId()+ "--"+car.getBrand() +" "+car.getModel());
					}
					
				}
				
				
				System.out.println("\n Please fill this form You want to rent for car..\n ");
				
				System.out.println("\n Please enter carId which want to Car.. \n");
				String carId= sc.nextLine();
				
				System.out.println("Enter the number of Days for rental..");
				int rentalDays=sc.nextInt();
				 sc.nextLine();// consume newline
				 
				 
				 Customer newCustomer= new Customer("CUS"+(customers.size()+1), customerName);
				 
				 Car selectedCar =null;
				 for(Car car:cars) {
					 if(car.getCarId().endsWith(carId) && car.isAvailable()) {
						 selectedCar=car;
						 break;	 
					 }
				 }
				
				 if(selectedCar!=null) {
					 double totalPrice=selectedCar.calculatePrice(rentalDays);
					 
					 System.out.println("\n -----------Rental Information -----------------\n");
					 System.out.println("Customer ID :"+ newCustomer.getCustomerId());
					 System.out.println("Customer Name : "+newCustomer.getName());
					 System.out.print("Car : "+selectedCar.getBrand()+" "+selectedCar.getModel());
					 System.out.println("Rental Days : "+rentalDays);
					 System.out.println("Total price : "+ totalPrice);
					 
					 
					 System.out.println("Confirm rental (Y/N) : ");
					 String confirm=sc.nextLine();
					 
					 if(confirm.equalsIgnoreCase("Y")){
						 rentCar(selectedCar,newCustomer,rentalDays);
						 System.out.println("Car rented successfully!!");
					 }else {
						 System.out.print("\n Rental car canceled..");	 
					 }		 
					 
				 }else {
					 System.out.println("\nInvalid car selection or car not available for rent.");
				 }
				 
				 
			}else if(choice==2) {
				System.out.println("hhh");
			}else if(choice==3) {
				break;
				
			}else {
				System.out.println("Invalid");
			}
			
			
			
			
			
			
		}
	}

}
