package ch4_OperatorInJava;

public class Assignment_Operator {
	public static void main(String[] args) {

		// Initialize variables
		int a = 10, b = 5;
		double x = 10.5, y = 4.2;

		// Simple Assignment (=)
		a = b; // a is assigned the value of b (a = 5)
		System.out.println("Simple Assignment: a = " + a); // Output: a = 5

		// Addition Assignment (+=)
		a += b; // a = a + b (5 + 5)
		System.out.println("Addition Assignment: a = " + a); // Output: a = 10

		// Subtraction Assignment (-=)
		a -= b; // a = a - b (10 - 5)
		System.out.println("Subtraction Assignment: a = " + a); // Output: a = 5

		// Multiplication Assignment (*=)
		a *= b; // a = a * b (5 * 5)
		System.out.println("Multiplication Assignment: a = " + a); // Output: a = 25

		// Division Assignment (/=)
		a /= b; // a = a / b (25 / 5)
		System.out.println("Division Assignment: a = " + a); // Output: a = 5

		// Modulus Assignment (%=)
		a %= b; // a = a % b (5 % 5)
		System.out.println("Modulus Assignment: a = " + a); // Output: a = 0

		// Using compound operators with double
		x += y; // x = x + y (10.5 + 4.2)
		System.out.println("Addition Assignment (double): x = " + x); // Output: x = 14.7

		int result = 100 + 200 / 10 - 3 * 10;
		// Verifying the result of the same expression
		System.out.println("Final Output: " + result);
	}
}
