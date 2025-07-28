package Day7Overriding;

public class V1ShapeDemo {
	public static void main(String[] args) {
		// Create an array of Shape objects
		V1Shape[] shapes = new V1Shape[3];

		// Instantiate objects of Circle, Triangle, and Square
		shapes[0] = new Circle(5.0);
		shapes[1] = new V1Triangle(4.0, 3.0);
		shapes[2] = new V1Square(6.0);

		// Demonstrate polymorphism by calling draw and erase methods
		for (V1Shape shape : shapes) {
			shape.draw();
			shape.erase();
			System.out.println("----------------------"); 
		}
	}
	

}
