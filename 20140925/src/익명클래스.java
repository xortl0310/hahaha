import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class �͸�Ŭ���� {
	
	public void startMain()
	{
		Frame f = new Frame("�͸�Ŭ����");
		f.setSize(400,300);
		f.setVisible(true);
		
		Button btn = new Button("��ư");
		f.add("North", btn);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("�޷ո޷�");
				
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
		new �͸�Ŭ����().startMain();
	}
}
