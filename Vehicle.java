package Java_OOP;
import java.util.ArrayList;
class car extends Vehicle{
	
	String vehicle = "Car";
	String action = "driving";

	
	void move(){
		
		Vehicle.vehicle.add("BMW");
		Vehicle.s.add("90 mph");
		super.move(vehicle, action,Vehicle.vehicle.get(0),Vehicle.s.get(0));
	}
}
class bicycle extends Vehicle{
	

	

	
	String vehicle = "Bicycle";
	String action = "pedaling";
	
	void move() {
		Vehicle.vehicle.add("Tsunami");
		Vehicle.s.add("15 mph");
		super.move(vehicle, action,Vehicle.vehicle.get(1),Vehicle.s.get(1));
	}
}




public class Vehicle {
	static ArrayList<String> vehicle = new ArrayList<>();
	static ArrayList<String> s = new ArrayList<>();
	
	
	
	String brand = "v";
	String speed  ="0mph";
	
	String vehicles="Vehicle";
	String action= "moving";
	
	
	void move(String vehicles,String action,String brand,String speed) {
		System.out.println("\nBrand: " + brand);
		System.out.println("Speed: " + speed);
		System.out.println(vehicles+" is "+action+".");
	}
	
	public static void main(String[] args) {
		
		car c = new car();
		bicycle b = new bicycle();
		
		
		
		c.move();
		b.move();
	}

}
