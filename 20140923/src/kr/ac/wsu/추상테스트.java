package kr.ac.wsu;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Vector;

public class 추상테스트 extends Frame implements WindowListener, MouseListener,
		MouseMotionListener {

	
	
	int x1;
	int y1;
	int x2;
	int y2;
	Vector v = new Vector();

	public void stratMain() {
		v.add(new Point(0, 0));

		this.setSize(400, 300);
		this.setVisible(true);
		this.addWindowListener(this);
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		
		this.addWindowListener(new WindowAdapter()
		{ public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}

	@Override
	public void paint(Graphics g) {
		for (int i = 1; i < v.size(); i++) {
			g.drawLine(((Point) v.get(i)).x, ((Point) v.get(i)).y,
					((Point) v.get(i - 1)).x, ((Point) v.get(i - 1)).y);
		}
		// g.drawLine(x1, y1, x2, y2);

	}

	public static void main(String[] args) {

		// new 추상테스트().stratMain();
		추상테스트 c = new 추상테스트();
		c.stratMain();
			
	}

	@Override
	public void mouseClicked(MouseEvent e) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		x1 = e.getX();
		y1 = e.getY();
		v.add(new Point(x1, y1));
		System.out.println("x:" + e.getX() + "y:" + e.getY());
		// this.invalidate();
		this.repaint();

	}
	public void update(Graphics g){
		paint(g);
	}

}
