import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainClass {
	public static void main(String[] args){
		JFrame frame = new JFrame("Test1 Frame");
		frame.setSize(400, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p = new JPanel();
		frame.add(p);
		p.setLayout(null);
		JTaxtField t1 = new JTextField();
		t1.setSize(100, 50);
		t1.setLication(0,0);
		p.add(t1);
		t1.setText("0");
		
		p.setLayout(null);
		ListenerClass l  = new ListenerClass();
		Random r = new Random(233);
		JButton b = new JButton();
		for(int i = 1; i<=9;i++){
			for (int j = 1; j<=9; j++){
				//looking at row i, column j
				b = new JButton();
				b.setText(Integer.toString(r.nextInt(9)+1));
				b.setSize(20,20);
				b.setLocation(i*50, j*50);
				b.addActionListener((ActionListener) l);
				p.add(b);
			}
		}
	}

}