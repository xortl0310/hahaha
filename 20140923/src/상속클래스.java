class Parents{
	int money = 1000;
	
	public void outMoney()
	{
		System.out.println("남은돈1 ="+money);
	}
	public void outMoney(int money)
	{
		System.out.println("남은돈2 ="+money);
	}
}

class Child extends Parents{
	int money = 500;
	public Child()
	{
		this.money = this.money - 200;
		System.out.println("자식:"+this.money);
		System.out.println("부모:"+super.money);
		outMoney();
		outMoney(money);
	}
	// 오버라이딩
	public void outMoney()
	{
		System.out.println("남은돈3 ="+this.money);
	}
}

public class 상속클래스 {

	
	public static void main(String[] args){
		Child ch = new Child();
	}
}
