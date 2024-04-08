import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	
	MyFrame(){
		this.setTitle("JFrame title goes here"); // sets title of frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
		this.setResizable(false);// prevent frame from being resized
		this.setSize(1440,2650); //sets the x-dimension and y-dimension of frame
		this.setVisible(true); // make frame visible
		
		ImageIcon image = new ImageIcon("qicon.png"); //create an ImageIcon
		
		this.setIconImage(image.getImage()); // change icon of frame
		this.getContentPane().setBackground(new Color(0x000000)); // change color of background
		
	}

}
