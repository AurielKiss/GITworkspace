package First;


import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class Bandymas implements ActionListener {

	
	JButton button;
	public static void main(String[] args) {
		
		new Bandymas().go();
	}
	
		public void go() {
			
		JFrame frame = new JFrame("Valio");
		JPanel panel = new JPanel();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setBounds(100, 100, 500, 400);
		
		JMenuBar menu = new JMenuBar();
		//menu.setOpaque(true);
		menu.setPreferredSize(new Dimension(200,50));

		button = new JButton();
		//button.setOpaque(true);
		button.setPreferredSize(new Dimension(200,100));
		//button.setBounds(1000,1000,200,200);
		button.addActionListener(this);
		
		
		frame.setJMenuBar(menu);
		
		panel.add(button);
		//frame.add(button);
		
		frame.add(panel);
		frame.pack();
		
	}

		@Override
		public void actionPerformed(ActionEvent e) {
		button.setEnabled(false);
			
		}
}
