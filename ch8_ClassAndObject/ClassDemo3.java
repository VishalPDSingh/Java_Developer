package ch8_ClassAndObject;

class Animal3 {
	void run() {
		System.out.println("Animal Can Run");
	}

	void eat() {
		System.out.println("Aniaml can eat");
	}
}

public class ClassDemo3 {
	public static void main(String[] args) {

		Animal3 animal3 = new Animal3();
		animal3.eat();
		animal3.run();

		Animal3 animal32 = new Animal3();
		animal32.run();
		animal32.eat();
	}
}
