import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ImageIcon icon = new ImageIcon("qicon.png");
		
		
		JLabel label = new JLabel();
		label.setText("Hi");
		label.setIcon(icon);
		label.setVerticalAlignment(JLabel.BOTTOM);
		label.setHorizontalAlignment(JLabel.RIGHT);
		label.setBounds(0, 0, 75, 75);
		
		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.red);
		redPanel.setBounds(0,0,250,250);
		redPanel.setLayout(null);
		
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.blue);
		bluePanel.setBounds(250,0,250,250);
		bluePanel.setLayout(null);
		
		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.green);
		greenPanel.setBounds(0,250,500,250);
		greenPanel.setLayout(null);
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
		frame.setSize(750,750); //sets the x-dimension and y-dimension of frame
		frame.setLayout(null);
		frame.setVisible(true); // make frame visible
		greenPanel.add(label);
		frame.add(redPanel);
		frame.add(bluePanel);
		frame.add(greenPanel);

	}

}
