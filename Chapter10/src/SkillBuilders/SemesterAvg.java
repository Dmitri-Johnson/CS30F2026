package SkillBuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class SemesterAvg {

	private JFrame frame;
	private JTextField gr1;
	private JTextField gr2;
	private JTextField gr3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SemesterAvg window = new SemesterAvg();
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
	public SemesterAvg() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 448, 453);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		gr1 = new JTextField();
		gr1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) 
			{
				if(gr1.getText().equals("Enter The First Grade:"))
				{
					gr1.setText("");
				}
			}
		});
		gr1.setToolTipText("Amazing");
		gr1.setText("Enter The First Grade:");
		gr1.setBounds(10, 30, 237, 33);
		panel.add(gr1);
		gr1.setColumns(10);
		
		gr2 = new JTextField();
		gr2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) 
			{
				if(gr2.getText().equals("Enter The Second Grade:"))
				{
					gr2.setText("");
				}
			}
		});
		
		JLabel Display = new JLabel("");
		Display.setBounds(129, 264, 193, 92);
		panel.add(Display);
		
		
		gr2.setText("Enter The Second Grade:");
		gr2.setColumns(10);
		gr2.setBounds(10, 120, 237, 33);
		panel.add(gr2);
		
		gr3 = new JTextField();
		gr3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) 
			{
				if(gr3.getText().equals("Enter The Third Grade:"))
				{
					gr3.setText("");
				}
			}
		});
		gr3.setText("Enter The Third Grade:");
		gr3.setColumns(10);
		gr3.setBounds(10, 200, 237, 33);
		panel.add(gr3);
		
		JButton avgButton = new JButton("Average");
		avgButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String g1 = gr1.getText();
				String g2 = gr2.getText();
				String g3 = gr3.getText();
				
				double g11 = Double.parseDouble(g1);
				double g12 = Double.parseDouble(g2);
				double g13 = Double.parseDouble(g3);
				
				double avg = (g11 + g12 + g13)/3;
				
				DecimalFormat dc = new DecimalFormat("0.0");
				
				
				
				Display.setText("Average: "+ dc.format(avg));
			}
		});
		
		
		avgButton.setBounds(299, 11, 108, 176);
		panel.add(avgButton);
		
		
	}
}
