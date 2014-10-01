import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Scrollbar;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Color;
import java.awt.TextField;
import java.awt.Button;
import java.awt.event.AdjustmentListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.TextListener;
import java.awt.event.TextEvent;


public class 스크롤바 {

	private JFrame frame;
	private Scrollbar scrollR;
	private Scrollbar scrollG;
	private Scrollbar scrollB;
	private Panel panel;
	private TextField tfR;
	private TextField tfG;
	private TextField tfB;
	
	private int red;
	private int green;
	private int blue;
	
	private int[] color = new int[3];
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					스크롤바 window = new 스크롤바();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public 스크롤바() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		scrollR = new Scrollbar();
		scrollR.setMaximum(265);
		scrollR.addAdjustmentListener(new AdjustmentListener() {
			public void adjustmentValueChanged(AdjustmentEvent e) {
//				System.out.println(e);
//				red = e.getValue();
				color[0] = e.getValue();
				setTextField();
				setBackGroundPanel();
			}
		});
		scrollR.setOrientation(Scrollbar.HORIZONTAL);
		scrollR.setBounds(36, 37, 210, 22);
		frame.getContentPane().add(scrollR);
		
		scrollG = new Scrollbar();
		scrollG.addAdjustmentListener(new AdjustmentListener() {
			public void adjustmentValueChanged(AdjustmentEvent e) {
//				green = e.getValue();
				color[1] = e.getValue();
				setTextField();
				setBackGroundPanel();
			}
		});
		scrollG.setMaximum(265);
		scrollG.setOrientation(Scrollbar.HORIZONTAL);
		scrollG.setBounds(36, 80, 210, 22);
		frame.getContentPane().add(scrollG);
		
		scrollB = new Scrollbar();
		scrollB.addAdjustmentListener(new AdjustmentListener() {
			public void adjustmentValueChanged(AdjustmentEvent e) {
//				blue = e.getValue();
				color[2] = e.getValue();
				setTextField();
				setBackGroundPanel();

			}
		});
		scrollB.setMaximum(265);
		scrollB.setOrientation(Scrollbar.HORIZONTAL);
		scrollB.setBounds(36, 122, 210, 22);
		frame.getContentPane().add(scrollB);
		
		Label label = new Label("R");
		label.setBounds(7, 37, 23, 23);
		frame.getContentPane().add(label);
		
		Label label_1 = new Label("G");
		label_1.setBounds(7, 80, 23, 23);
		frame.getContentPane().add(label_1);
		
		Label label_2 = new Label("B");
		label_2.setBounds(7, 122, 23, 23);
		frame.getContentPane().add(label_2);
		
		panel = new Panel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(252, 37, 147, 107);
		frame.getContentPane().add(panel);
		
		tfR = new TextField();
		tfR.addTextListener(new TextListener() {
			public void textValueChanged(TextEvent e) {
				setChangeText(e.getSource());
			}
		});
		tfR.setText("0");
		tfR.setBounds(55, 166, 50, 23);
		frame.getContentPane().add(tfR);
		
		tfG = new TextField();
		tfG.addTextListener(new TextListener() {
			public void textValueChanged(TextEvent e) {
				setChangeText(e.getSource());
			}
		});
		tfG.setText("0");
		tfG.setBounds(111, 166, 50, 23);
		frame.getContentPane().add(tfG);
		
		tfB = new TextField();
		tfB.addTextListener(new TextListener() {
			public void textValueChanged(TextEvent e) {
				setChangeText(e.getSource());
			}
		});
		tfB.setText("0");
		tfB.setBounds(167, 166, 50, 23);
		frame.getContentPane().add(tfB);
	}
	protected void setData(TextField tf, int num, Scrollbar sb)
	{
		String txt = tf.getText();
		if( chkInteger(txt))
		{
			int value = Integer.parseInt(txt);
			if( value >= 0 && value <= 255){
				color[num] = value;
				sb.setValue(value);
			}
		}
	}
	protected void setChangeText(Object obj) {
		if(obj == tfR)
		{
//			System.out.println("RED");
			setData(tfR, 0, scrollR);
		}else if(obj == tfG)
		{
//			System.out.println("GREEN");
			setData(tfG, 1, scrollG);
		}else if(obj == tfB)
		{
//			System.out.println("BLUE");
			setData(tfB, 2, scrollB);
		}
		setBackGroundPanel();
	}

	/**
	 * 문자열을 받아서 숫자인지 문자가 포함되어있는지 확인
	 * true이면 숫자만 false일경우에는 문자가 포함
	 * @param txt
	 * @return
	 */
	public boolean chkInteger(String txt)
	{
		boolean btrue = true;
		char[] chs = txt.toCharArray();
		for(char ch : chs)
		{
			if( ch < '0' || ch > '9')
			{
				btrue = false;
				break;
			}
		}
		if(txt.length() > 0)
			return btrue;
		else
			return false;
	}
	/**
	 * 
	 */
	protected void setBackGroundPanel() {
		panel.setBackground(new Color(color[0], color[1], color[2]));
	}

	protected void setTextField() {
		tfR.setText(String.valueOf(color[0]));
		tfG.setText(String.valueOf(color[1]));
		tfB.setText(String.valueOf(color[2]));
	}
}





