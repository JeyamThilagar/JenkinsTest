package abstraction;

abstract class Myclass  {
	  // Abstract method (does not have a body)
	  public abstract void animalSound();
	  // Regular method
	  public void sleep() {
	    System.out.println("Zzz");
	  }
	}

	// Subclass (inherit from Animal)
	class Pig extends Myclass {
	  public void animalSound() {
	    // The body of animalSound() is provided here
	    System.out.println("The pig says: wee wee");
	  }
	}

	class Animal {
	  public static void main(String[] args) {
	    Pig myPig = new Pig(); // Create a Pig object
	    myPig.animalSound();
	    myPig.sleep();
	  }
}
