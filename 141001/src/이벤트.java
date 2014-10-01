import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class 이벤트 extends Frame implements KeyListener{

	public void startMain()
	{
		TextField tf = new TextField();
		tf.addKeyListener(this);
		this.add(tf);
		this.setSize(400,300);
		this.setVisible(true);
		this.addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		new 이벤트().startMain();

	}

	@Override
	public void keyPressed(KeyEvent e) {
//		System.out.println("a"+e);
		if(e.getKeyChar() >='0'&& e.getKeyChar()<='9')
		{
			System.out.println("숫자");
		}
		if(e.getKeyChar() == KeyEvent.VK_ENTER)
		{
			System.out.println("엔터");
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
	
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

}
