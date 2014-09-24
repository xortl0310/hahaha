package kr.ac.osu;

public class B {
	private String color = "bule";
	
	public String getColor(String str)
	{
		if(str.equals("id"))
			return color;
		else
			return null;
	}

	public void setColor(String color){
		this.color = color;
	}
}
