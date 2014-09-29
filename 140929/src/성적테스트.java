import java.util.HashMap;
import java.util.Vector;

/**
 * 성적을 입력하려면
 * 학번
 * 이름
 * 국어
 * 영어
 * 수학
 * @author hong
 *
 */
//
//2036 홍길동 100 90 80 
//2025 홍길순 90 90 95
//7458 이순신 100 100 100
//3256 홍금보 85 80 85

class SungJuk
{
	public SungJuk()
	{
		
	}
	private String studentId;
	private String studentName;
	private int kor;
	private int eng;
	private int math;
	
	
	public SungJuk(String studuentId, String studentName, int kor, int eng, int math)
	{
		this.studentId = studuentId;
		this.studentName = studentName;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public void setSungJuk(String studuentId, String studentName, int kor, int eng, int math)
	{
		this.studentId = studentId;
		this.studentName = studentName;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public String getStudentName()
	{
		return this.studentName;
	}
	public String getStudentId()
	{
		return this.studentId;
	}
	public int getKor()
	{
		return this.kor;
	}
}

public class 성적테스트 {

	
	public static void main(String[] args) {
		
		HashMap<String, SungJuk> hm = new HashMap<String, SungJuk>();
		hm.put("2036", new SungJuk("2036","홍길동",100,90,80));		
		hm.put("2025", new SungJuk("2025","홍길순",90,90,70));		
		hm.put("7458", new SungJuk("7458","이순신",50,90,80));		
		hm.put("3256", new SungJuk("3256","유관순",20,70,50));
		
		
		for( String key : hm.keySet())
		{
			System.out.println( hm.get(key).getStudentName() );
		}
		for( String key : hm.keySet())
		{
			System.out.println( hm.get(key).getStudentId() );
		}
		for( String key : hm.keySet())
		{
			System.out.println( hm.get(key).getKor());
		}

		
		
		
		
		
		
		
		
//		Vector v = new Vector();
////		v.add(new SungJuk("2036","홍길동",100,90,80));
////		SungJuk sg = new SungJuk("2036","홍길동",100,90,80);
//		SungJuk sg = new SungJuk();
//		sg.setSungJuk("2036","홍길동",100,90,80);
//		
	}

}
