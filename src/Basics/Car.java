package Basics;

public class Car {
		int speed;
		int gear;
		
		
		
	void changeGear(int newGear) {
		gear=newGear;
	}
	
	void speedUp(int incremen) {
		speed = speed + incremen;
	}
	
	void applyBrake(int decremen) {
		speed = speed - decremen;
	}
	
	int getSpeed() {
		return speed;
	}
}
