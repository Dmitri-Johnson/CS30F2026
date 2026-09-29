package SkillBuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ClassDemo {

	private JFrame frame;
	private JTextField FN;
	private JTextField LN;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClassDemo window = new ClassDemo();
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
	public ClassDemo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		FN = new JTextField();
		FN.addKeyListener(new KeyAdapter()
		{
			@Override
			public void keyTyped(KeyEvent e)
			{
				if(FN.getText().equals("Enter Your First Name"))
				{
					FN.setText("");
				}
				
				
			}
		});
		FN.setText("Enter Your First Name");
		FN.setBounds(10, 26, 351, 31);
		panel.add(FN);
		FN.setColumns(10);
		
		LN = new JTextField();
		LN.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyTyped(KeyEvent e)
			{
				if(LN.getText().equals("Enter Your Last Name"))
				{
					LN.setText("");
				}
				
				
			}
		});
		LN.setText("Enter Your Last Name");
		LN.setColumns(10);
		LN.setBounds(10, 68, 351, 31);
		panel.add(LN);
		
		JButton btnNewButton = new JButton("Click");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnNewButton.setBounds(138, 196, 161, 54);
		panel.add(btnNewButton);
	}
}
