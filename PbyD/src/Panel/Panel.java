package Panel;

import java.awt.Container;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Panel {

	public static void main(String[] args) {
		Frame f = new Frame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}

}
class Frame extends JFrame{
	public Frame(){
		setTitle("It rocks!!");
		setSize(300,200);
		setLocation(100,200);
		Pane panele = new Pane();
		Container cp = getContentPane();
		cp.add(panele);
		
	}
}

class Pane extends JPanel{
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawString("Hi",75,100);
	}
}

