import java.awt.Button;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class 박스이동2 extends Frame {
	Button btn;
	int offsetX;
	int offsetY;

	public Dimension getdt() {
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		return dim;
		// return Toolkit.getDefaultToolkit().getScreenSize();
	}

	public void setFrameMiddle(Frame f, int A, int B, int C) {
		Dimension dim = getdt();
		f.setBounds((int) dim.getWidth() / 2 - A / 2, (int) dim.getHeight() / 2
				- B / 2 + C, A, B);

	}

	public void setButton(Component parent, Component f, int A, int B, int C) {
		Dimension dim = parent.getSize();
		f.setBounds((int) dim.getWidth() / 2 - A / 2, (int) dim.getHeight() / 2
				- B / 2 + C, A, B);

	}

	public void setButton1(Component parent, Component f, int A, int B, int C) {
		Dimension dim = parent.getSize();
		f.setBounds((int) dim.getWidth() / 2 - A / 2, (int) dim.getHeight() / 2
				- B / 2 + C, A, B);

	}

	public void starMain() {
		Dimension dim = getdt();
		// System.out.println(" "+dim);
		this.setLayout(null);
		btn = new Button("메롱");
		this.add(btn);
		btn.setVisible(true);
		btn.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(java.awt.event.MouseEvent e) {
				btn.setLocation(btn.getX() + e.getX() - offsetX,
						btn.getY() + e.getY() - offsetY);

			}

		}

		);

		btn.addMouseListener(new MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent e) {
				offsetX = e.getX();
				offsetY = e.getY();
			}

		});
		this.setFrameMiddle(this, 400, 300, -50);
		this.setVisible(true);
		this.setButton(this, btn, 60, 60, -30);

		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		new 박스이동2().starMain();

	}

}