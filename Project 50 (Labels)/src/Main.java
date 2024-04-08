import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// JLabel = a GUI display area for a string of text, an image, or both
		
		ImageIcon image = new ImageIcon("qicon.png");
		Border border = BorderFactory.createLineBorder(Color.green, 3);
		
		JLabel label = new JLabel(); //create a label
		label.setText("Bro, do you even code?"); // set text of label
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT, CENTER, RIGHT of imageicon
		label.setVerticalTextPosition(JLabel.TOP); // set text TOP, CENTER, BOTTOM of imageicon
		label.setForeground(new Color(0x00FF00)); // set color of text
		label.setFont(new Font("MV Boli", Font.PLAIN, 20)); // set font of text
		label.setIconTextGap(100); // set gap of text to image
		label.setBackground(Color.black); // set background color
		label.setOpaque(true); // display background color
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.TOP); // set vertical position of icon+text within label
		label.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of icon+text within label
		//label.setBounds(100,100,250,250); // set x,y position within frame as well as dimensions
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
		//frame.setSize(1440,2650); //sets the x-dimension and y-dimension of frame
		//frame.setLayout(null);
		frame.setVisible(true); // make frame visible
		frame.add(label);
		frame.pack();
		
		
	}

}
