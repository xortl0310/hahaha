import java.util.ArrayList;


public class ArrayListŬ���� {

	public static void main(String[] args) {
		ArrayList<String> arraylist = new ArrayList<String>();
		arraylist.add("���");
		arraylist.add("�ٳ���");
		arraylist.add("����");
		arraylist.add("����");
		arraylist.add("���ξ���");
		arraylist.add("��");
		
		arraylist.add(1,"�޷�");
		arraylist.remove("����");
		for(int i=0; i<arraylist.size(); i++)
		{
			System.out.println(arraylist.get(i));
		}
		while(arraylist.contains("����"));
		{
			arraylist.remove("����");
		}
		
		
		
	}

}
