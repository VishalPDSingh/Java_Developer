package ch4_OperatorInJava;

public class Logical_Operator {
	public static void main(String[] args) {

		// Initialize boolean variables
		boolean a = true, b = false, c = true;

		// Logical AND (&&)
		System.out.println("Logical AND (a && b): " + (a && b)); // Output: false
		System.out.println("Logical AND (a && c): " + (a && c)); // Output: true

		// Logical OR (||)
		System.out.println("Logical OR (a || b): " + (a || b)); // Output: true
		System.out.println("Logical OR (b || c): " + (b || c)); // Output: true

		// Logical NOT (!)
		System.out.println("Logical NOT (!a): " + !a); // Output: false
		System.out.println("Logical NOT (!b): " + !b); // Output: true

		// Using logical operators in a complex condition
		if ((a && b) || (c && !b)) {
			System.out.println("Condition is true");
		} else {
			System.out.println("Condition is false"); // Output: Condition is true
		}

		// Another example with short-circuit behavior
		if (a && b && (c || !b)) {
			System.out.println("All conditions met");
		} else {
			System.out.println("Not all conditions met"); // Output: Not all conditions met
		}
	}
}
