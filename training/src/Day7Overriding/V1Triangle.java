package Day7Overriding;

public class V1Triangle extends V1Shape {
	private double base;
	private double height;

	// Constructor for Triangle
	public V1Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	// Override draw method for Triangle

	public void draw() {
		System.out.println("Drawing a triangle with base " + base + " and height " + height);
	}

	// Override erase method for Triangle
	
	public void erase() {
		System.out.println("Erasing a triangle with base " + base + " and height " + height);
	}

}
