import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Moving extends Frame implements ActionListener{
	
public void startMain()
	{
	TextField tf = new TextField(20);
	Panel MainA = new Panel();
	Panel nothB = new Panel();
	MainA.setLayout(null);
	Button bt = new Button("½ÃÀÛ");
	Button bt1 = new Button(">>");
	Button bt2 = new Button("<<");
	bt.addActionListener(this);
	
	List l1 = new List();
	List l2 = new List();
	
	MainA.setBackground(Color. yellow);
	nothB.setBackground(Color. black);
	l1.setBounds(20, 30, 150, 150);
	l1.setMultipleMode(true);
	l2.setBounds(220, 30, 150, 150);
	l2.setMultipleMode(true);
	bt1.setBounds(180, 60, 30, 30);
	bt2.setBounds(180, 100, 30, 30);
	bt1.addActionListener(this);
	bt2.addActionListener(this);
	
	nothB.add(tf);
	nothB.add(bt);
	MainA.add(l1);
	MainA.add(l2);
	MainA.add(bt1);
	MainA.add(bt2);
	
	this.add(MainA);
	this.add("North",nothB);
	this.setSize(400, 300);
	this.setVisible(true);
	
	this.addWindowListener(new WindowAdapter() 
	{
		public void windowClosing (WindowEvent e){
			
				System.exit(0);
		}
	});
	
	}
	


	public static void main(String[] arg){
		Moving hong = new Moving();
		hong.startMain();
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		Button btn = new Button();
		
	}

}
