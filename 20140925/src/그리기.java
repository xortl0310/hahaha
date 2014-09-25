import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Vector;

class DrawP {
	int x;
	int y;
	boolean btrue;

	public DrawP(int x, int y, boolean btrue) {
		this.x = x;
		this.y = y;
		this.btrue = btrue;
	}
}

public class 그리기 extends Frame {
	Vector<DrawP> v = new Vector<DrawP>();
	boolean btrue = true;

	public static void main(String[] arg) {
		new 그리기().startMain(400, 300);
	}

	public void startMain(int width, int height) {

		v.add(new DrawP(0, 0, false));

		this.setSize(width, height);
		this.setVisible(true);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}

		});
		this.addMouseListener(new MouseAdapter() {
			
			public void mousePressed(MouseEvent e ){
				btrue = true;
			}
			
			public void mouseReleased(MouseEvent e ){
				btrue = false;
				v.add(new DrawP(e.getX(), e.getY(), btrue));
				repaint();
			}

			
		});
		
		this.addMouseMotionListener(new MouseAdapter() {

			public void mouseDragged(MouseEvent e) {
				v.add(new DrawP(e.getX(), e.getY(), btrue));
				repaint();
			}
		});
	}

	public void update(Graphics t) {
		paint(t);
	}

	public void paint(Graphics g) {
		for (int i = 1; i < v.size(); i++) {
			if (v.get(i-1).btrue) {
				g.drawLine(v.get(i-1).x, v.get(i-1).y, v.get(i).x,
						v.get(i).y);
			}
		}
	}

}
