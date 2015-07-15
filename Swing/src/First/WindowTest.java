package First;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class WindowTest extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowTest frame = new WindowTest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public WindowTest() {
		
		setTitle("ghhhhhhhhh");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 420);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new LineBorder(Color.GREEN));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(60, 159, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(168, 159, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(282, 159, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(60, 217, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setBounds(168, 217, 89, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("New button");
		btnNewButton_5.setBounds(282, 217, 89, 23);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("New button");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_6.setText("Valio");
			}
		});
		btnNewButton_6.setBackground(Color.BLACK);
		btnNewButton_6.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton_6.setForeground(Color.YELLOW);
		btnNewButton_6.setBounds(60, 125, 89, 23);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("New button");
		btnNewButton_7.addActionListener(new ActionListener() {
			int x1 = 5;
			public void actionPerformed(ActionEvent e) {
				
				btnNewButton_7.setText("adaasd");
				btnNewButton_7.setBounds(168+x1, 125, 89, 23);
				x1+=10;
			}
		});
		btnNewButton_7.setBounds(168, 125, 89, 23);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("New button");
		btnNewButton_8.setBounds(282, 125, 89, 23);
		contentPane.add(btnNewButton_8);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(60, 267, 310, 20);
		contentPane.add(passwordField);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(60, 76, 311, 20);
		contentPane.add(textPane);
		
		JLabel lblErwrwerwerwer = DefaultComponentFactory.getInstance().createTitle("AurielKiss program");
		lblErwrwerwerwer.setHorizontalAlignment(SwingConstants.CENTER);
		lblErwrwerwerwer.setToolTipText("");
		lblErwrwerwerwer.setBounds(108, 30, 198, 14);
		contentPane.add(lblErwrwerwerwer);
	}
}
