package assignments.condiionals_loops.shapes;

public class Circle {
	
	double radius;
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public static void main(String[] args) {
		Circle circle = new Circle(5);
		
		
		System.out.println(circle.area());
		System.out.println(circle.perimeter());
	}
	
	double area() {
		return Math.PI * radius * radius;
	}
	
	double perimeter() {
		return Math.PI * 2 * radius;
	}
}
