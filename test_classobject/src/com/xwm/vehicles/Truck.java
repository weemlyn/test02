package com.xwm.vehicles;



public class Truck extends Vehicles{
	private float load;
	

	public Truck(String brand, String color, float load) {
		super(brand, color);
		this.load = load;
	}


	public void showTruck() {
		System.out.println(brand+" "+color+" "+load);
	}

}
