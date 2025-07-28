package Day7Overriding;

public class V1Square extends V1Shape {
	private double side;

	// Constructor for Square
	public V1Square(double side) {
		this.side = side;
	}

	// Override draw method for Square
	@Override
	public void draw() {
		System.out.println("Drawing a square with side " + side);
	}

	// Override erase method for Square
	@Override
	public void erase() {
		System.out.println("Erasing a square with side " + side);
	}

}
