package com.xwm.vehicles;



public class Car extends Vehicles{
	private int seats;
	
	
	public Car(String brand, String color, int seats) {
		super(brand, color);
		this.seats = seats;
	}


	public void showCar() {
		System.out.println(brand+" "+color+" "+seats);
	}

}
