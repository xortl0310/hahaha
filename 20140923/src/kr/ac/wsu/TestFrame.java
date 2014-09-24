package kr.ac.wsu;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.Button;
import java.awt.BorderLayout;
import java.awt.TextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class TestFrame {

	private JFrame frame;
	private TextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestFrame window = new TestFrame();
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
	public TestFrame() {
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
		
		Button btnOpen = new Button("open");
		btnOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//System.out.println("열기");
				try{
					File f = new File("c:\\imsi\\test.txt");
					FileInputStream fis = new FileInputStream(f);
					InputStreamReader isr = new InputStreamReader(fis);
					BufferedReader br = new BufferedReader(isr);
					String str = "";
					StringBuffer sb = new StringBuffer();
					while( (str = br.readLine()) != null )
					{
						sb.append(str+"\r\n");
					}
					textArea.setText(sb.toString());
					
					br.close();
					isr.close();
					fis.close();
				}catch(Exception err)
				{
					
				}
		
			}
			
		});
		btnOpen.setBounds(105, 45, 76, 23);
		frame.getContentPane().add(btnOpen);
		
		Button btnSave = new Button("save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("저장");
				System.out.println(textArea.getText());
				try{
				File f = new File("c:\\imsi\\test.txt");
				FileOutputStream fos = new FileOutputStream(f);
				PrintWriter Pw = new PrintWriter(fos);
				Pw.println(textArea.getText());
				Pw.flush();
				Pw.close();
				fos.close();
				}catch(Exception err)
				{
					
				}
			}
		});
		btnSave.setBounds(261, 45, 76, 23);
		frame.getContentPane().add(btnSave);
		
		textArea = new TextArea();
		textArea.setBounds(59, 90, 337, 147);
		frame.getContentPane().add(textArea);
	}
}
