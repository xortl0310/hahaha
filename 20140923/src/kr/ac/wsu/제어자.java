package kr.ac.wsu;

class TastA{
	private int len = 100;
	
	public int getLen()
	{
		return len;
	}
	
	public void setLen(int len)
	{
		this.len = len;
	}
	
}
public class 제어자 {

	public static void main(String[] args) {
		TastA ta = new TastA();
		ta.getLen();
		TestB tb = new TestB();
		tb.getMoney();
		
		TestB tc = tb;
		
		String str = "aaaa";
		System.out.println(ta.hashCode());		
		System.out.println(tb.hashCode());		
		System.out.println(tc.hashCode());		
		System.out.println(str.hashCode());		

	}

}
