package finalReview2;
import javax.swing.*;

public class SWINGquestion {
		public static void main(String[] args) {
			JFrame f = new JFrame("Final");
			JPanel mypanel = new JPanel();
			mypanel.setLayout(null);
			f. add(mypanel);
			f.setSize(300,300);
			f.setLocation(50,100);
			f.setTitle("NYU Frame");
			JLabel lbltitle  = new JLabel();//
			lbltitle.setText("0");		
			lbltitle.setBounds(0,200,100,50);
			mypanel.add(lbltitle);
//			OurListenerClass  b1Listener = new OurListenerClass(lbltitle);
			JButton b1;
			for (int i = 0 ; i<=2; i++) {
				for (int j =0; j<=2; j++) {
			      b1 = new JButton();
			      b1.setText(((i*3)+j + 1)+"");
			      b1.setBounds(i*50,j*50, 50,50);   // x, y, height, width
			      mypanel.add(b1);
				}
			}
			 f. setVisible(true);
			 f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	   }
}

