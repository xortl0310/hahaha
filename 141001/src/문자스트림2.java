import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.text.FieldPosition;

public class 문자스트림2 {

	public static void main(String[] args) throws Exception 
	{
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br =new BufferedReader(isr);
		
		
		File f = new File("c:\\imsi\\input.txt");
		FileOutputStream fos = new FileOutputStream(f);
		PrintWriter pw = new PrintWriter(fos);
		while(true)
		{
		String str = br.readLine();
		if(str.equals("q"))break;
		pw.println(str);
		pw.flush();
		}
		pw.close();
		fos.close();
		isr.close();
		is.close();
	}
}
