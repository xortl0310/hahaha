import java.io.File;

public class 파일 {

	public static void main(String[] args) {
		File f = new File("c:\\");
		if (!f.exists()) {
			f.mkdir();
		}
		if (f.isDirectory()) {
			System.out.println("디렉토리");
		}
		File[] files = f.listFiles();
		for (File f1 : files) {
			if (!f1.isHidden()) {
				if (f1.isDirectory()) {
					System.out.println("DIR:" + f1.getName());

				} else {
					System.out.println("File:" + f1.getName());
				}
			}
		}
	}

}
