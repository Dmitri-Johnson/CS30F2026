package Mastery;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class BreakAPlate {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BreakAPlate window = new BreakAPlate();
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
	public BreakAPlate() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		ImageIcon image1 = new ImageIcon("../Chapter10/src/Mastery/plates.gif");
		ImageIcon image2 = new ImageIcon("../Chapter10/src/Mastery/plates_two_broken.gif");
		ImageIcon image3 = new ImageIcon("../Chapter10/src/Mastery/plates_all_broken.gif");
		ImageIcon image4 = new ImageIcon("../Chapter10/src/Mastery/sticker.gif");
		ImageIcon image5 = new ImageIcon("../Chapter10/src/Mastery/tiger_plush.gif");
		
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 543, 423);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel PlateDisplay = new JLabel("");
		PlateDisplay.setIcon(image1);
		PlateDisplay.setBounds(123, 26, 306, 111);
		panel.add(PlateDisplay);
		
		JLabel PrizeDisplay = new JLabel("");
		PrizeDisplay.setBounds(209, 239, 196, 111);
		panel.add(PrizeDisplay);
		
		JButton PlayButton = new JButton("Play");
		PlayButton.setActionCommand("Play");
		PlayButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String eventName = e.getActionCommand();
				
				if (eventName.equals("Play")) {
					Random rand = new Random();
					Random rand2 = new Random();
					Random rand3 = new Random();
					int newRoll;
					int newRoll2;
					int newRoll3;
				
					newRoll = rand.nextInt(2);
					newRoll2 = rand2.nextInt(2);
					newRoll3 = rand3.nextInt(2);
				
					if (newRoll == 1 && newRoll2 == 1 && newRoll3 == 1) {
					PlateDisplay.setIcon(image3);
					PrizeDisplay.setIcon(image5);
					PlayButton.setText("Play Again");
		            PlayButton.setActionCommand("Play Again");
					} else {
		        	PlateDisplay.setIcon(image2);
		        	PrizeDisplay.setIcon(image4);
		        }
					
				} else if (eventName.equals("Play Again")) { 
		            
		            PlateDisplay.setIcon(image1);   
		            PrizeDisplay.setIcon(null);     
		            
		           
		            PlayButton.setText("Play");
		            PlayButton.setActionCommand("Play");
				}
			}
		}); 
		
		PlayButton.setBounds(167, 138, 196, 64);
		panel.add(PlayButton);
		
	}
} 