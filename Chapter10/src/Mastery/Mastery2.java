package Mastery;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;

public class Mastery2 {

	private JFrame frame;
	private JTextField FirstName;
	private JTextField LastName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mastery2 window = new Mastery2();
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
	public Mastery2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		ImageIcon image1 = new ImageIcon("../Chapter10/src/Mastery/CHHS.jpg");
		ImageIcon image2 = new ImageIcon("../Chapter10/src/Mastery/NORTH TRAIL.png");
		ImageIcon image3 = new ImageIcon("../Chapter10/src/Mastery/churchill.jpg");
		ImageIcon image4 = new ImageIcon("../Chapter10/src/Mastery/deif.png");
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 629, 465);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel SchoolDisplay = new JLabel("");
		SchoolDisplay.setBounds(142, 232, 331, 183);
		panel.add(SchoolDisplay);
		
		JComboBox Grade = new JComboBox();
		Grade.setModel(new DefaultComboBoxModel(new String[] {"10", "11", "12"}));
		Grade.setBounds(23, 77, 98, 43);
		panel.add(Grade);
		
		JComboBox School = new JComboBox();
		School.setModel(new DefaultComboBoxModel(new String[] {"Crescent Heights", "Sir Winston Churchill", "John G. Diefenbaker", "North Trail"}));
		School.setBounds(142, 77, 192, 43);
		panel.add(School);
		
		FirstName = new JTextField();
		FirstName.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) 
			{
				if(FirstName.getText().equals("First Name:"))
				{
					FirstName.setText("");
				}
			}
		});
		FirstName.setText("First Name:");
		FirstName.setBounds(23, 27, 128, 20);
		panel.add(FirstName);
		FirstName.setColumns(10);
		
		LastName = new JTextField();
		LastName.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) 
			{
				if(LastName.getText().equals("Last Name:"))
				{
					LastName.setText("");
				}
			}
		});
		LastName.setText("Last Name:");
		LastName.setBounds(190, 27, 156, 20);
		panel.add(LastName);
		LastName.setColumns(10);
		
		
		JTextArea InfoDisplay = new JTextArea();
		InfoDisplay.setWrapStyleWord(true);
		InfoDisplay.setLineWrap(true);
		InfoDisplay.setBounds(33, 131, 331, 101);
		panel.add(InfoDisplay);
		
		JButton Submit = new JButton("Submit");
		Submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String F = FirstName.getText();
				String L = LastName.getText();
				
				
				InfoDisplay.setText(F + " " + L + " is in grade: " + Grade.getSelectedItem() + " and goes to " + School.getSelectedItem() + " high school");

				
				if(School.getSelectedItem().equals("Crescent Heights"))
				{
					SchoolDisplay.setIcon(image1);
				}
				else if(School.getSelectedItem().equals("Sir Winston Churchill"))
				{
					SchoolDisplay.setIcon(image3);
				}
				else if(School.getSelectedItem().equals("John G. Diefenbaker"))
				{
					SchoolDisplay.setIcon(image4);
				}
				else if(School.getSelectedItem().equals("North Trail"))
				{
					SchoolDisplay.setIcon(image2);
				}
			}
		});
		Submit.setBounds(417, 27, 162, 186);
		panel.add(Submit);
		
		
		
		
	}
}
