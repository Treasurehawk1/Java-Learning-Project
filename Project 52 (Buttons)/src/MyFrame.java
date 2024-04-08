import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener{
	JButton button;
	JLabel label;
	MyFrame(){
		
		ImageIcon icon = new ImageIcon("qicon.png");
		
		label = new JLabel();
		label.setIcon(icon);
		label.setBounds(450, 200, 300, 300);
		label.setVisible(false);
		
		button = new JButton();
		button.setBounds(400,200,200,100);
		button.addActionListener(this);
		button.setText("I'm a button");
		button.setFocusable(false);
		button.setIcon(icon);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont(new Font("Comic Sans", Font.BOLD, 25));
		button.setIconTextGap(-15);
		button.setForeground(Color.cyan);
		button.setBackground(Color.lightGray);
		button.setBorder(BorderFactory.createEtchedBorder());		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(1000, 1000);
		this.setVisible(true);
		this.add(button);
		this.add(label);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button) {
			System.out.println("Pee");
			//button.setEnabled(false);
			label.setVisible(true);
		}
	}
	
}
