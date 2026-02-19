package ch10_Constructor;


class DefaultConstrctorDemo
{
	private int cId;
	private String cNameString;
	private long cNum;
	
	public DefaultConstrctorDemo()
	{
		
		
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



public class DefaultConstractor {
	public static void main(String[] args) {
		
		DefaultConstrctorDemo c1 = new DefaultConstrctorDemo();
		
		System.out.println(c1.getCid());
		System.out.println(c1.getNmae());
		System.out.println(c1.getNum());
	}
}
