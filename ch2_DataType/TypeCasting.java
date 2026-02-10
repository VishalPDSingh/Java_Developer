package ch2_DataType;

public class TypeCasting {
	public static void main(String[] args) {
		
		// Implicit type casting
		byte x = 12;
		short s = x;
		int i = x;
		long l = x;
		float f = x;
		double d = x;
		
		System.out.println(x);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		
		
		// Explicit type casting
		double dd = (byte)123.58;
		System.out.println(dd);
		
		
	}
}
