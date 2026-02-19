package ch9_Encapsualtion;

// pure encapsulation



// Encapsulation provide the security to the data.
// Encapsulation two step:
// provide security to most important data
// provide controlled access

class BankAccount {
	private int bal; // private member of class do not access outside the class
	// setter and getter method to give controlled access

	public void setData(int x) {
		if (x < 0) {
			System.out.println("Amount is not negative");
			System.exit(0); // shut down the program, next line not executed
		} else {
			bal = x;
		}
	}

	public int getData() {
		return bal;
	}

}

public class DemoEncapsulation {
	public static void main(String[] args) {

		BankAccount ba = new BankAccount();
		// direct access
		// ba.bal = 10000;
		// ba.bal = -10000;
		// System.out.println(ba.bal);

		// prevent direct access
		ba.setData(20315);
		System.out.println(ba.getData());
	}
}
