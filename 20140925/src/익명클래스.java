import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class 익명클래스 {
	
	public void startMain()
	{
		Frame f = new Frame("익명클래스");
		f.setSize(400,300);
		f.setVisible(true);
		
		Button btn = new Button("버튼");
		f.add("North", btn);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("메롱메롱");
				
			}
		});
		
		f.addWindowListener(new WindowAdapter() 
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
			
		});
		
	}
	
	public static void main (String[] arg)
	{
		new 익명클래스().startMain();
	}
}
