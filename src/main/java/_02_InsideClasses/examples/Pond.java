package examples;


public class Pond {

	public static void main(String[] args) {

		examples.Duck mobyDuck = new examples.Duck("Moby", 90 / 3, "celery");
		examples.Duck wolfgangDuck = new examples.Duck("Wolfgang", 60 / 3, "cheeseburgers");

		mobyDuck.waddle();
		mobyDuck.waddle();
		mobyDuck.waddle();
		mobyDuck.waddle();
		mobyDuck.waddle();
		mobyDuck.waddle();
		mobyDuck.waddle();

		wolfgangDuck.waddle();

		System.out.println(mobyDuck);
		
		// Exercise: Make the Duck quack
		
	}

}
