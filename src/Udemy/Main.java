package Udemy;


public class Main {
	
	public static Car createCar() {
		Car car=new Car();
		car.modelYear=2024;
		car.modelName="Tesla";
		
		return car;
	}
	
	public static int getModelYear(Car car) {
		return car.modelYear;
	}
	
	public static String getModelName(Car car) {
		return car.modelName;
	}
	
	public static void honk(Car car) {
		car.honk();
	}

}
