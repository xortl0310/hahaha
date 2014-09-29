
public class Forechtest {

	public static void main(String[] args) {
		
		int[] arrs ={10,20,40,50,90,70};
		for(int i=0; i<arrs.length; i++)
		{
			System.out.print( arrs[i]+ " ");
			
		}
		System.out.println();
		
		for(int i : arrs )
		{
			System.out.println(i+ " ");
		}
	}

}
