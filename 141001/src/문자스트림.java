import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;


public class 문자스트림 {

	public static void main(String[] args) {
		try{
		File f = new File("c:\\imsi\\test.txt");
		FileInputStream fis = new FileInputStream(f);
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		while(true)
		{
		String str = br.readLine();
		if(str == null) break;
		System.out.println(str);
		}
		} catch (Exception err) {
			
		}
	}

}
