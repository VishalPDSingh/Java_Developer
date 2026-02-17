package ch4_OperatorInJava;

public class Arithmetic_Operator {
	public static void main(String[] args) {

		int a = 10, b = 5;
		double x = 10.5, y = 4.2;

		// Addition
		System.out.println("Addition (int): " + (a + b)); // Output: 15
		System.out.println("Addition (double): " + (x + y)); // Output: 14.7

		// Subtraction
		System.out.println("Subtraction (int): " + (a - b)); // Output: 5
		System.out.println("Subtraction (double): " + (x - y)); // Output: 6.3

		// Multiplication
		System.out.println("Multiplication (int): " + (a * b)); // Output: 50
		System.out.println("Multiplication (double): " + (x * y)); // Output: 44.1

		// Division
		System.out.println("Division (int): " + (a / b)); // Output: 2 (integer division)
		System.out.println("Division (double): " + (x / y)); // Output: 2.5

		// Modulus
		System.out.println("Modulus (int): " + (a % b)); // Output: 0
		System.out.println("Modulus (double): " + (x % y)); // Output: 2.1
	}
}
