package kr.ac.wsu;

class Parents
{
	final int money = 1000;
	public void getMoney()
	{
		System.out.println("now money="+money);
	}
}

public class Child extends Parents {
	
	public void starMain()
	{
		System.out.println("now money="+money);
	}
	
	
	public static void main(String[] aa)
	{
		Child c = new Child();
		c.starMain();
		
		new Child().starMain();
	}
	
	
}
