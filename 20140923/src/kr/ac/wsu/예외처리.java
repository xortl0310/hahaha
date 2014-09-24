package kr.ac.wsu;

public class 예외처리 {
	
	public static void main(String[] args){
		
		Object[] arr = {10,20,30,40};
		
		
		try{
			for(int i=0; i <5; i++)
			{
				//int a = Integer.parseInt(arr[i].toString());
				if( i>2)
				{	
					Exception e = new Exception();
					throw e;
				}
				System.out.println(arr[i]);
				
			}
//		catch(ArrayIndexOutOfBoundsException e)
//		{
//			System.out.println("예외가 발생했습니다."+e);
//			System.err.println(e.getMessage());
		}catch(Exception e)
		{
			System.err.println("예외가 발생햇습니다."+e.toString());
		}
		finally{
			System.out.println("End Program");
		}
	
	}
	
	
	
	
	
	
	
	

}
