package SkillBuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;

public class MetricConversion {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MetricConversion window = new MetricConversion();
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
	public MetricConversion() {
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
		
		JLabel Conversion = new JLabel("");
		Conversion.setFont(new Font("Tahoma", Font.BOLD, 18));
		Conversion.setBounds(103, 158, 258, 92);
		panel.add(Conversion);
		
		
		JComboBox<?> Conversiontype = new JComboBox();
		Conversiontype.setModel(new DefaultComboBoxModel(new String[] {"Inch to centimeters", "Feet to meters", "Gallon to liters", "Pound to kilograms"}));
		 
		Conversiontype.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) 
			{
				if(Conversiontype.getSelectedItem().equals("Inch to centimeters"))
				{
					Conversion.setText("1 inch = 2.54 centimeters");
				}
				else if(Conversiontype.getSelectedItem().equals("Feet to meters"))
				{
					Conversion.setText("1 foot = 0.3048 meters");
				}
				else if(Conversiontype.getSelectedItem().equals("Gallon to liters"))
				{
					Conversion.setText("1 gallon = 4.5461 liters");
				}
				else if(Conversiontype.getSelectedItem().equals("Pound to kilograms"))
				{
					Conversion.setText("1 pound = 0.4536 kilograms");
				}

			}
		});
		Conversiontype.setBounds(135, 29, 166, 62);
		panel.add(Conversiontype);
		
		
		
		JLabel prompt = new JLabel("Select a conversion type:");
		prompt.setBounds(147, 11, 198, 14);
		panel.add(prompt);
		
		
	}
	
	
}
