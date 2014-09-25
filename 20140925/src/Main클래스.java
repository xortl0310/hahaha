public class Main클래스 {
	
	public static int maxMany(Integer...arg)
	{
		int max = arg[0];
		for(int i=1; i< arg.length; i++)
		{
			max = Math.max(max, arg[i]);
		}
		return max;
	}
	public static void main(String[] args) {
		System.out.println(Math.PI);
		System.out.println(Math.ceil(11.5)); // 올림
		System.out.println(Math.floor(11.92232424)); // 내림

		System.out.println(Math.round(11.94)); // 내림&올림
		System.out.println(Math.abs(-10)); //절대값
		System.out.println(Math.max(10,20)); // 최대값
		System.out.println(Main클래스.maxMany(100000000,12321412,1241)); // 최대값
		System.out.println(Math.min(10,20)); // 최소값
	}

}
