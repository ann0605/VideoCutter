import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;
public class ListenerClass implements ActionListener {
	JTextField SaveField;
	public ListenerClass(JTextField txtfield){
		SaveField = txtfield;
		
	}
	
	public void actionPerformed(ActionEvent e){
		System.out.println("OK Button clicked");
		JButton clickedbtn;
		clickedbtn =(JButton) e.getSource();
		int num, sum;
		num = Integer.parseInt(clickedbtn.getText());
		num++;
		clickedbtn.setText(Integer.toString(num));
		clickedbtn.setBackground(Color.blue);
		clickedbtn.setForeground(Color.white);
		sum = Integer.parseInt(SaveField.getText());
		sum+= num;
		SaveField.setText(Integer.toString(sum));
		System.out.println(clickedbtn.getText());
	}

}
