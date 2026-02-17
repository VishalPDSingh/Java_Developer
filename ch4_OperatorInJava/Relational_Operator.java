package ch4_OperatorInJava;

public class Relational_Operator {
	public static void main(String[] args) {

		// Initialize variables
		int a = 10, b = 20;
		double x = 15.5, y = 15.5;

		// Equal To (==)
		System.out.println("Equal To (a == b): " + (a == b)); // Output: false
		System.out.println("Equal To (x == y): " + (x == y)); // Output: true

		// Not Equal To (!=)
		System.out.println("Not Equal To (a != b): " + (a != b)); // Output: true
		System.out.println("Not Equal To (x != y): " + (x != y)); // Output: false

		// Less Than (<)
		System.out.println("Less Than (a < b): " + (a < b)); // Output: true
		System.out.println("Less Than (x < y): " + (x < y)); // Output: false

		// Greater Than (>)
		System.out.println("Greater Than (a > b): " + (a > b)); // Output: false
		System.out.println("Greater Than (x > y): " + (x > y)); // Output: false

		// Less Than or Equal To (<=)
		System.out.println("Less Than or Equal To (a <= b): " + (a <= b)); // Output: true
		System.out.println("Less Than or Equal To (x <= y): " + (x <= y)); // Output: true

		// Greater Than or Equal To (>=)
		System.out.println("Greater Than or Equal To (a >= b): " + (a >= b)); // Output: false
		System.out.println("Greater Than or Equal To (x >= y): " + (x >= y)); // Output: true
	}
}
