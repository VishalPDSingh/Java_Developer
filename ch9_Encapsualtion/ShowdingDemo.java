package ch9_Encapsualtion;


class Customer1 {
	private int cId;
	private String cNameString;
	private long cNum;

	public void setData(int cId, String cNameString, long cNum) {
		this.cId = cId;
		this.cNameString = cNameString;
		this.cNum = cNum;
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



public class ShowdingDemo {
	public static void main(String[] args) {
		
		Customer1 c1 = new Customer1();
		c1.setData(1, "Arul", 66534);

		System.out.println(c1.getCid());
		System.out.println(c1.getNmae());
		System.out.println(c1.getNum());
	}
}
