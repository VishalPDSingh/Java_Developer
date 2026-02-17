package ch8_ClassAndObject;


class Animal2
{
	void run()
	{
		System.out.println("Animal Can Run");
	}
	void eat()
	{
		System.out.println("Aniaml can eat");
	}
}




public class ClassDemo2 {
	public static void main(String[] args) {
		
		Animal2 animal2 = new Animal2();
		animal2.run();
		animal2.eat();
	}
}
