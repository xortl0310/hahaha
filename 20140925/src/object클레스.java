class TestA
{
	
}
public class objectŬ���� {

	
		public static void main(String[] args){
			TestA ta1 = new TestA();
			TestA ta2 = new TestA();
			System.out.println(ta1);
			System.out.println(ta2);
			
			if( ta1 == ta2)
			{
				System.out.println("����");
			}else
			{
				System.out.println("Ʋ����");
			}
			
			String str = new String("Hello");
			String str1 = new String("Hello");
			if(str.equals(str1))
			{
				System.out.println("����");
			}else
			{
				System.out.println("Ʋ����");
			}
		}
}
