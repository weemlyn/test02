package com.xwm.vehicles;

public class Test {

	public static void main(String[] args) {
		Vehicles v=new Vehicles("auto", "red");
		v.showInfo();
		Car c=new Car("toyota", "black", 5);
		c.showCar();
		Truck t=new Truck("DF", "green", 10f);
		t.showTruck();

	}

}
