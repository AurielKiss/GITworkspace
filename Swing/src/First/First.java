package First;

import javax.swing.JFrame;

public class First extends Thread{

	public static void main(String[] args) {
		JFrame frame = new JFrame("Hi");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 300);
	}

}
