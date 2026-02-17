package ch8_ClassAndObject;

class Animal1 {
	// // Method to display a running message
	void run() {
		System.out.println("Aniaml Can Run");
	}
}

public class ClassDemo {
	// Main method - entry point of the program
	public static void main(String[] args) {

		// Create an instance (object) of the Animal1 class
		Animal1 animal1 = new Animal1();
		// Call the run method using the object
		animal1.run();
	}
}
