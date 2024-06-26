import java.awt.*;
import java.awt.event.*;
import java.io.File;

import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{

	JButton button;
	JLabel label;
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton("Pick a color");
		
		label = new JLabel();
		label.setBackground(Color.white);
		label.setText("This is some text");
		label.setFont(new Font("MV Boli", Font.PLAIN, 100));
		label.setOpaque(true);
		button.addActionListener(this);
		
		
		this.add(button);
		this.add(label);
		this.pack();
		this.setVisible(true);
		
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == button) {
			JColorChooser colorChooser = new JColorChooser();
			
			Color color = JColorChooser.showDialog(null,"Pick a color",Color.black);
			
			//label.setForeground(color);
			label.setBackground(color);
		}
		
	}

}
