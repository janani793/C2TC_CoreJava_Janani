package Day8.interfaces.functionalinterfaces;

public interface FunctionalInterfaceDemo {
	public static void main(String[] args) {
		GreetClass g = new GreetClass();
		System.out.println(g.greet());

		//using Lambda Expression
		GreetInterface g1 = () -> {
			return "Good Afternoon";
		};

		System.out.println(g1.greet());

	}

}
