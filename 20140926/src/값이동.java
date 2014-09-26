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



public class 값이동 extends Frame implements ActionListener{

	TextField tf;
	List leftList;
	List rightList;
	Button databtn;
	
	public void startMain()
	{
		tf = new TextField(20);
		tf.addActionListener(this);
		databtn = new Button("추가");
		databtn.setName("btnadd");
		databtn.addActionListener(this);
		
		Panel northp = new Panel();
		Panel mainp = new Panel();
		mainp.setLayout(null);
		northp.setBackground(Color.BLUE);
		mainp.setBackground(Color.RED);
		// p.setLayout(new BorderLayout());
		northp.add(tf);
		northp.add(databtn);
		
		leftList = new List();
		rightList = new List();
		
		leftList.setLocation(10,10);
		leftList.setSize(150,200);
		leftList.setMultipleMode(true);
//		rightList.setLocation(10,10);
//		rightList.setSize(150,200);
		rightList.setBounds(220, 10, 150, 200);
		rightList.setMultipleMode(true);
		
		
		Button btnRight = new Button(">>");
		Button btnLeft = new Button("<<");
		btnRight.addActionListener(this);
		btnLeft.addActionListener(this);
		btnRight.setName("btnrigth");
		btnLeft.setName("btnleft");
		
		btnRight.setBounds(164, 50, 50, 25);
		btnLeft.setBounds(164, 120, 50, 25);
		mainp.add(leftList);
		mainp.add(rightList);
		mainp.add(btnLeft);
		mainp.add(btnRight);
		
		
		this.add(mainp);
		this.add("North",northp);
		this.setSize(400,300);
		this.setVisible(true);
		this.addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent e){
				
				System.exit(0);
			}
		});
	}
	public static void main(String[] args) {
		new 값이동().startMain();
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Button btn = new Button();
		if( e.getSource() !=tf)
		{
			btn = (Button)e.getSource();
		}
//		System.out.println(e.getActionCommand());
		
//		if(e.getSource() == databtn)
//		{
//			System.out.println(btn.getLabel());
//		}
//		
//		System.out.println(btn.getLabel());
		
		if( btn.getName().equals("btnadd") || e.getSource() == tf)
		{
//			System.out.println(btn.getLabel());
			String input = tf.getText();
			if(input.trim().length()>0 )
			{
				leftList.add(input);
				tf.setText(null);
			}
			tf.requestFocus();
			
		}else if( btn.getName().equals("btnrigth")){
			
			if(leftList.getItemCount()>0)
			{	
//			int i = leftList.getSelectedIndex();
//			String ret = leftList.getItem(i);
//			rightList.add(ret);
//			leftList.remove(i);
			int[] indexes =leftList.getSelectedIndexes();
			for(int i=indexes.length-1; i>=0; i--)
			{
				rightList.add(leftList.getItem(indexes[i]));
				leftList.remove(indexes[i]);
		
			}
			
			}	
//			System.out.println(i);
		}else if( btn.getName().equals("btnleft")){
			String input = tf.getText();
			leftList.add(input);
			
			if(rightList.getItemCount()>0)
			{	
//			int i = leftList.getSelectedIndex();
//			String ret = leftList.getItem(i);
//			rightList.add(ret);
//			leftList.remove(i);
			int[] indexes =rightList.getSelectedIndexes();
			for(int i=indexes.length-1; i>=0; i--)
			{
				leftList.add(rightList.getItem(indexes[i]));
				rightList.remove(indexes[i]);
			}
			
			}	
//			System.out.println(btn.getLabel());
		}
		
	}
}
