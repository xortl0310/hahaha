import java.io.FileInputStream;
import java.io.FileOutputStream;


public class 바이트스트림2 {

	public static void main(String[] args) {
	try{	
		FileInputStream fis = new FileInputStream("c:\\imsi\\Begin_Again_2013_720p_HDRip_x264_AAC-JYK.mp4");
		FileOutputStream fos = new FileOutputStream("c:\\imsi\\Begin_Again_2013_720p_HDRip_x264_AAC-JYK1.mp4");
		byte[] b = new byte[102004];
		while(true)
		{
			
			int a = fis.read(b);
			if(a<0) break;
			System.out.println(a);
			fos.write(b, 0, a);
		}
		fos.flush();
		fos.close();
		fis.close();
		System.out.println("완료");
	} catch (Exception err) {
		System.err.println(err);
	}
	}
}
