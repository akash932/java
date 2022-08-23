package assignments.condiionals_loops.shapes;

public class Triangle {
	public static void main(String[] args) {
		Triangle triangle = new Triangle();
		
		
//		System.out.println(triangle.area(5));
		System.out.println(triangle.perimeter(5));
	}
	
//	double area( ) {
//		return Math.PI * radius * radius;
//	}
	
	double perimeter(double radius) {
		return Math.PI * 2 * radius;
	}
}
