import java.awt.Button;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import org.w3c.dom.events.MouseEvent;



public class 박스이동  extends Frame implements MouseMotionListener, MouseListener{

	
	public Dimension getdt()
	{
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		return dim;
//		return Toolkit.getDefaultToolkit().getScreenSize();
	}

	public void setFrameMiddle(Frame f, int A, int B, int C)
	{
		Dimension dim = getdt();
		f.setBounds((int)dim.getWidth()/2-A/2, (int)dim.getHeight()/2-B/2+C, A, B);
				
	}
	public void setButton(Component parent, Component f, int A, int B, int C)
	{
		Dimension dim = parent.getSize();
		f.setBounds((int)dim.getWidth()/2-A/2, (int)dim.getHeight()/2-B/2+C, A, B);
		
	}
	public void setButton1(Component parent, Component f, int A, int B, int C)
	{
		Dimension dim = parent.getSize();
		f.setBounds((int)dim.getWidth()/2-A/2, (int)dim.getHeight()/2-B/2+C, A, B);
		
	}
	Button btn;
	
	public void starMain()
	{
		Dimension dim = getdt();
//		System.out.println(" "+dim);	
		this.setLayout(null);
		Button btn = new Button("메롱");
		Button btn1 = new Button("뭐야?");
		this.add(btn);
		this.add(btn1);
		btn.setVisible(true);
		btn.addMouseMotionListener(this);
		btn.addMouseListener(this);
		this.setFrameMiddle(this,400, 300, -50);
		this.setVisible(true);
		this.setButton(this, btn, 60, 60, -30);
		this.setButton1(this, btn1, 60, 60, 30);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		new 박스이동().starMain();

	}

	@Override
	public void mouseDragged(java.awt.event.MouseEvent e) {
		btn.setLocation(btn.getX()+ e.getX(),btn.getY()+ e.getY());
		
	}

	@Override
	public void mouseMoved(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(java.awt.event.MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(java.awt.event.MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(java.awt.event.MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	int offsetX;
	int offsetY;
	@Override
	public void mousePressed(java.awt.event.MouseEvent e) {
		offsetX = e.getX();
		offsetY = e.getY();
		
	}

	@Override
	public void mouseReleased(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
