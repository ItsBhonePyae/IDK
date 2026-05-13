package Java_OOP;
import java.util.Scanner;
public class Rectangle {
	private int length;
	private int width;
	private boolean square = false;
	
	Rectangle(){
		length = 0;
		width = 0;
	}
	
	Rectangle(int length,int width){
		this.length = length;
		this.width = width;
	
	}
	boolean isSquare(){
		if(length==width) {
			square = true;
		}
		
		return square;
	}
	
	int area() {
		return length*width;
	}
	int perimeter() {
		return (2*length)+(2*width);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Rectangle r = new Rectangle();
		System.out.println("Enter length and width.");
		System.out.print("length: ");
		r.length = sc.nextInt();
		
		System.out.print("width: ");
		r.width = sc.nextInt();
		
		System.out.println("Area: " + r.area());
		System.out.println("Perimeter: " + r.perimeter());
		
		if(r.isSquare()) {
			System.out.println("It's a square.");
		}
	
	}

}
