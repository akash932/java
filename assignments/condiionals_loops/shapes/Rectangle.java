package assignments.condiionals_loops.shapes;

public class Rectangle {
	
	double length;
	double breadth;
	
	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(5, 5);
		
		
		System.out.println(rectangle.area());
		System.out.println(rectangle.perimeter());
	}
	
	double area() {
		return length * breadth;
	}
	
	double perimeter() {
		return 2 * (length + breadth);
	}

}
