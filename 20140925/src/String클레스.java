import java.io.File;


public class StringŬ���� {

	public static void main(String[] args) {
		char[] ch = {'H', 'e','l','l','o'};
		String str = new String(ch);
		System.out.println(str);
		
		System.out.println(str.charAt(1));
		
		String Str1 = "World";
		str.concat(Str1);
		System.out.println(str);
		System.out.println(str.indexOf("l"));
		System.out.println(str.lastIndexOf("l"));
		str = str.replace("ll", "aa");
		System.out.println(str);
		
		String path ="C:\\Windows\\AppPatch\\AcGenral.dll";
		int file = path.lastIndexOf('\\');
		int filefix = path.lastIndexOf('.');
//		System.out.println(file);
//		System.out.println(filefix);
		String a = path.substring(file+1);
		String b = path.substring(filefix+1); 
		System.out.println("�����̸�"+ a);
		System.out.println("Ȯ����"+ b);
		
		File f = new File(path);
		System.out.println(f.getName());
		System.out.println(f.getAbsolutePath());
		
	}

}
