package ch4_OperatorInJava;

public class Unary_Operator {
	public static void main(String[] args) {
		
		int a = 5;
		System.out.println(a); //5
		int b = ++a + a++;
		System.out.println(b); // 6 + 6
		
		int x = 10;
		System.out.println(x); // 10
		int y = ++x;
		System.out.println(x); // 11
		System.out.println(y); // 11
		y = x++;
		System.out.println(x); // 12
		System.out.println(y); // 11
		System.out.println("..........................................................");
		int z = 12;
		System.out.println(z); // 12;
		int p = ++z;
		System.out.println(p); // 13
		System.out.println(z); // 13
		
		p = z++;
		System.out.println(p); // 13
		System.out.println(z); // 14
		
		
		
	}
}
