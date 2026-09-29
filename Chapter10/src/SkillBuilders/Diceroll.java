package SkillBuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;

public class Diceroll {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Diceroll window = new Diceroll();
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
	public Diceroll() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		ImageIcon image1 = new ImageIcon("../Chapter10/src/SkillBuilders/die1.gif");
		ImageIcon image2 = new ImageIcon("../Chapter10/src/SkillBuilders/die2.gif");
		ImageIcon image3 = new ImageIcon("../Chapter10/src/SkillBuilders/die3.gif");
		ImageIcon image4 = new ImageIcon("../Chapter10/src/SkillBuilders/die4.gif");
		ImageIcon image5 = new ImageIcon("../Chapter10/src/SkillBuilders/die5.gif");
		ImageIcon image6 = new ImageIcon("../Chapter10/src/SkillBuilders/die6.gif");
		

		
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 204, 255));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel Dice = new JLabel("");
		Dice.setVerticalAlignment(SwingConstants.TOP);
		Dice.setBounds(102, 55, 75, 75);
		panel.add(Dice);
		
		JLabel Dice_1 = new JLabel("");
		Dice_1.setVerticalAlignment(SwingConstants.TOP);
		Dice_1.setBounds(251, 55, 75, 75);
		panel.add(Dice_1);
		
		JButton RollButton = new JButton("Roll");
		RollButton.setToolTipText("Roll the dice");
		RollButton.setForeground(new Color(128, 0, 255));
		RollButton.setBackground(new Color(255, 255, 0));
		RollButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		RollButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Random rand = new Random();
				Random rand2 = new Random();
				int newRoll;
				int newRoll2;

				newRoll = rand.nextInt(6) + 1;
				newRoll2 = rand2.nextInt(6) + 1;
				if (newRoll2 == 1) {
				Dice_1.setIcon(image1);
				} else if (newRoll2 == 2) {
				Dice_1.setIcon(image2);
				} else if (newRoll2 == 3) {
				Dice_1.setIcon(image3);
				} else if (newRoll2 == 4) {
				Dice_1.setIcon(image4);
				} else if (newRoll2 == 5) {
				Dice_1.setIcon(image5);
				} else if (newRoll2== 6) {
				Dice_1.setIcon(image6);
				}
				if (newRoll == 1) {
				Dice.setIcon(image1);
				} else if (newRoll == 2) {
				Dice.setIcon(image2);
				} else if (newRoll == 3) {
				Dice.setIcon(image3);
				} else if (newRoll == 4) {
				Dice.setIcon(image4);
				} else if (newRoll == 5) {
				Dice.setIcon(image5);
				} else if (newRoll== 6) {
				Dice.setIcon(image6);
				}
				
				
			}
		});
		RollButton.setBounds(139, 180, 146, 70);
		panel.add(RollButton);
		
		
		
	}
}
