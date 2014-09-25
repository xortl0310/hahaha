import java.util.Vector;


public class CopyOfVector≈¨∑°Ω∫1 {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		v.add("Hello");
		v.add(100);
		v.add(true);
		v.add(new String("World"));
		v.add(new Integer(300));
		
		Object obj1 = v.get(0);
		String str1 = obj1.toString();
		Object obj2 = v.get(1);
		int a1 = Integer.parseInt(obj2.toString() );
		Object obj3 = v.get(2);
		boolean bl = Boolean.parseBoolean(obj3.toString() );
		Object obj4 = v.get(3);
		String str2 = obj4.toString();
		Object obj5 = v.get(4);
		int a2 = Integer.parseInt( obj5.toString() );
	}

}
