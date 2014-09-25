import java.util.Vector;


public class CopyOfCopyOfVector클래스1 {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		System.out.println("저장용량"+v.capacity());
		for(int i=0; i< 10; i++)
		{
			v.add(i);
		}
		
		System.out.println("저장용량"+v.capacity());
		for( int i =0; i< v.size(); i++)
		{
			
			int a = Integer.parseInt(v.get(i).toString());
			System.out.println(a);
//			System.out.println(v.get(i));
		}
		
		Vector<String> v1 = new Vector<String>();
		v1.add("AAA");
		v1.add("BBB");
		v1.add("CCC");
		
		String str3 = v1.get(0);
		String str4 = v1.get(1);
		String str5 = v1.get(2);
		System.out.println(str3+ str4+ str5);
		
//		Vector v = new Vector();
//		v.add("Hello");
//		v.add(100);
//		v.add(true);
//		v.add(new String("World"));
//		v.add(new Integer(300));
//		
//		Object obj1 = v.get(0);
//		String str1 = obj1.toString();
//		Object obj2 = v.get(1);
//		int a1 = Integer.parseInt(obj2.toString() );
//		Object obj3 = v.get(2);
//		boolean b1 = Boolean.parseBoolean(obj3.toString() );
//		Object obj4 = v.get(3);
//		String str2 = obj4.toString();
//		Object obj5 = v.get(4);
//		String a2 = Integer.parseInt(v.obj5.toString() );
	}

}
