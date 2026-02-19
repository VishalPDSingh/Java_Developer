package ch10_Constructor;


class DefaultConstrctorDemo1
{
	private int cId;
	private String cNameString;
	private long cNum;
	
	public DefaultConstrctorDemo1(int cId, String cNameString, long cNum)
	{
		this.cId = cId;
		this.cNameString = cNameString;
		this.cNum = cNum;
	}
	
	public DefaultConstrctorDemo1()
	{
		cId = 2;
		cNameString = "Vishal";
		cNum = 0000000;
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



public class ConstructorDemo2 {
	public static void main(String[] args) {
		
		
		DefaultConstrctorDemo1 c2 = new DefaultConstrctorDemo1();
		System.out.println(c2.getCid());
		System.out.println(c2.getNmae());
		System.out.println(c2.getNum());
		
		
		
		DefaultConstrctorDemo1 c1 = new DefaultConstrctorDemo1(101, "Ram", 9745358);
		
		System.out.println(c1.getCid());
		System.out.println(c1.getNmae());
		System.out.println(c1.getNum());
		
	}
}
