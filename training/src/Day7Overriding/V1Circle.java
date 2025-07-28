package Day7Overriding;

class Circle extends V1Shape {
	private double radius;

	// Constructor for Circle
	public Circle(double radius) {
		this.radius = radius;
	}

	// Override draw method for Circle
	
	public void draw() {
		System.out.println("Drawing a circle with radius " + radius);
	}
	

}
