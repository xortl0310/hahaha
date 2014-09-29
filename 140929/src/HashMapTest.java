import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class HashMapTest {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(0, "Test");
		hmap.put(1, "Hello");
		hmap.put(10, "world");
		hmap.put(1234, "Car");
		hmap.put(0000, "hog");
		

		System.out.println(hmap.get(0));
		System.out.println(hmap.get(10));
		System.out.println(hmap.get(0));
		Set<Integer> s = hmap.keySet();
		Iterator<Integer> it = s.iterator();
		while( it.hasNext( ) )
		{
			int a = it.next();
			System.out.println("key="+a+"\tavlue="+hmap.get(a) );
		}
		
		for(int a : hmap.keySet() )

		{
			System.out.println(hmap.get(a) );
		}
	}

}
