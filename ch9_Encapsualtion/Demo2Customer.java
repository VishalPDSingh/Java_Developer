package ch9_Encapsualtion;

class Customer {
	private int cId;
	private String cNameString;
	private long cNum;

	public void setData(int x, String name, long num) {
		cId = x;
		cNameString = name;
		cNum = num;
	}

	public int getCid() {
		return cId;
	}

	public String getNmae() {
		return cNameString;
	}

	public long getNum() {
		return cNum;
	}
}

public class Demo2Customer {
	public static void main(String[] args) {

		Customer c1 = new Customer();
		c1.setData(1, "Arul", 66534);

		System.out.println(c1.getCid());
		System.out.println(c1.getNmae());
		System.out.println(c1.getNum());

	}
}
