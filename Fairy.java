public class Fairy {
	private int age;

	public Fairy(int age) {
		// normally nothing is printed in constructor
		System.out.println("A new Fairy is born...");
		this.age = age;
	}

	public void voice() {
		System.out.println("Pling! I am " + age + " years old");
	}

	public static void main(String[] args) {
		System.out.println("Define the Fairy type variables...");
		Fairy Juniper, Trillium;
		System.out.println("Create the Fairy type objects...");

		Juniper = new Fairy(320);
		Trillium = new Fairy(230);

		System.out.println("Fairies are talking:");
		Trillium.voice();
		Juniper.voice();

		System.out.println("Dispense the reference to the fairy Trillium by using null");
		System.out.println("After this there are no references to fairies and");
		System.out.println("garbage collector will remove it at some point.");
		Trillium = null;

		System.out.println("Juniper still wants to say something:");
		Juniper.voice();
		System.out.println("Program has no references to objects any more.");
		System.out.println("No objects exist.");
	}
}
