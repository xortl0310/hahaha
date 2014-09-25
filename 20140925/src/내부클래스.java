class C{
	private int a = 100;
	
	public void PrintBA()
	{
		B b = new B();
		b.PrintA();
	}

	class B{
	
		public void PrintA()
		{
		System.out.println(a);
		}
	}
}

public class 내부클래스 {

	public static void main(String[] args) {
		C aa = new C();
		aa.PrintBA();
		
//		A.B b = aa.getBClass();
//		b.PrintA();
	}

}
