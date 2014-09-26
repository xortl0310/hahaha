import java.util.ArrayList;


public class ArrayList클래스 {

	public static void main(String[] args) {
		ArrayList<String> arraylist = new ArrayList<String>();
		arraylist.add("사과");
		arraylist.add("바나나");
		arraylist.add("포도");
		arraylist.add("수박");
		arraylist.add("파인애플");
		arraylist.add("배");
		
		arraylist.add(1,"메론");
		arraylist.remove("포도");
		for(int i=0; i<arraylist.size(); i++)
		{
			System.out.println(arraylist.get(i));
		}
		while(arraylist.contains("포도"));
		{
			arraylist.remove("포도");
		}
		
		
		
	}

}
