package ch9_Encapsualtion;

class Student1 {
	String name;
	String fathername;
	String address;
	private long moblieNo;

	public void setMob(long mob) {
		if (mob < 0) {
			System.out.println("Moblie number cannot start with zero: ");
		} else {
			moblieNo = mob;
		}
	}

	public long getMobNumber() {
		return moblieNo;
	}
}

public class Demo1 {
	public static void main(String[] args) {

		Student1 student1 = new Student1();
		student1.name = "Ram";
		student1.fathername = "ABCD";
		student1.address = "ASDFG";
		student1.setMob(1676464614);

		System.out.println(student1.name);
		System.out.println(student1.fathername);
		System.out.println(student1.address);
		System.out.println(student1.getMobNumber());
	}
}
