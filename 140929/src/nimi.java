import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.BorderLayout;

import javax.swing.JTextField;

import java.awt.Graphics;
import java.awt.TextField;
import java.awt.Panel;
import java.awt.Label;
import java.awt.Font;
import java.util.Calendar;


public class nimi extends Thread {

	private JFrame frame;
	private Label lbl_time;
	private Label lbl_date;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					nimi window = new nimi();
					window.frame.setVisible(true);
					window.start();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	@Override
	public void run() {
		while(true)
		{
			
//			Graphics g = frame.getGraphics();
//			g.fillOval(100,100,50,50);
//			
			String date = getdate();
			String time = gettime();
			lbl_date.setText(date);
			lbl_time.setText(time);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	public String getdate()
	{
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		
		return year + "년"+(month +1)+"월"+day+"일";
	}
	public String gettime()
	{
		Calendar cal = Calendar.getInstance();
		int ampm = cal.get(Calendar.AM_PM);
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		String ap = ampm == 0? " 오전" :"오후" ;
		return ap + " "+hour+"시"+minute+"분"+second+"초";
	}
	
	/**
	 * Create the application.
	 */
	public nimi() {
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
		
		lbl_date = new Label("2014\uB144 9\uC6D4 29\uC77C");
		lbl_date.setAlignment(Label.CENTER);
		lbl_date.setFont(new Font("Dialog", Font.PLAIN, 28));
		lbl_date.setBounds(10, 10, 414, 106);
		frame.getContentPane().add(lbl_date);
		
		lbl_time = new Label("\uC624\uD6C4 4\uC2DC 57\uBD84 30\uCD08\r\n");
		lbl_time.setAlignment(Label.CENTER);
		lbl_time.setFont(new Font("Dialog", Font.PLAIN, 29));
		lbl_time.setBounds(10, 149, 414, 84);
		frame.getContentPane().add(lbl_time);
	}
}
