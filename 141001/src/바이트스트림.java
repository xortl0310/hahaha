import java.io.FileInputStream;
import java.io.FileOutputStream;


public class ����Ʈ��Ʈ�� {

	public static void main(String[] args) {
	try{	
		FileInputStream fis = new FileInputStream("c:\\imsi\\test.txt");
		FileOutputStream fos = new FileOutputStream("c:\\imsi\\test1.txt");
		while(true)
		{
			
			int a = fis.read();
			if(a<0) break;
			System.out.println(a);
			fos.write(a);
		}
		fos.flush();
		fos.close();
		fis.close();
	} catch (Exception err) {
		System.err.println(err);
	}
	}
}
