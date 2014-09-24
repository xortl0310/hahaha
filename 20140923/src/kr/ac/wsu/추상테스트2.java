package kr.ac.wsu;

interface Imovable{
	void move (int x, int y);
}

interface IAttackable{
	void attack(String u);
	
}
interface IFightable extends Imovable, IAttackable{
	
}
abstract class  Test2
{
	abstract void ViewValue();
}
public class 추상테스트2 extends Test2 implements Imovable, IAttackable{

	public static void main(String[] args) {


	}

	@Override
	void ViewValue() {
		
		
	}

	@Override
	public void attack(String u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}

}
