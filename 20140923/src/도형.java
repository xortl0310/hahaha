import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class 도형 extends Frame{
	
	public void StartMain()
	{
		this.setSize(800, 600);
		this.setVisible(true);
		
		this.addWindowListener(new WindowAdapter()
		{ public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}
	
	

	public void paint(Graphics g)
	{
		g.setColor(Color.blue);
		for (int i = 0; i < this.getWidth(); i+=2 )
		{
			g.drawLine(i, 0,this.getWidth()-i, this.getHeight());
		}
;//		g.drawLine(50, 50, 170, 170);
//		g.drawOval(150, 100, 100, 100);
	}
	
	public static void main(String[] args) {
//		도형 shape = new 도형();
//		shape.StartMain();
		
		new 도형().StartMain();
	}

}
