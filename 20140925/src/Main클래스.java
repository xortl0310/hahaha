public class MainŬ���� {
	
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
		System.out.println(Math.ceil(11.5)); // �ø�
		System.out.println(Math.floor(11.92232424)); // ����

		System.out.println(Math.round(11.94)); // ����&�ø�
		System.out.println(Math.abs(-10)); //���밪
		System.out.println(Math.max(10,20)); // �ִ밪
		System.out.println(MainŬ����.maxMany(100000000,12321412,1241)); // �ִ밪
		System.out.println(Math.min(10,20)); // �ּҰ�
	}

}
