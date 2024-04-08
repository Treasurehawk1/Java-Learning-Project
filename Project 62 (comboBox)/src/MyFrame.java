import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{

	
	JComboBox comboBox;
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		
		String[] animals = {"dog", "cat", "bird"};
		comboBox = new JComboBox(animals); // must be a reference type
		comboBox.addActionListener(this);
		
		//comboBox.setEditable(true);
		System.out.println(comboBox.getItemCount());
		comboBox.addItem("Horse");
		comboBox.insertItemAt("pig", 0);
		comboBox.setSelectedIndex(0);
		comboBox.removeItemAt(0);
		comboBox.removeAllItems();
		
		this.add(comboBox);
		this.pack();
		this.setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == comboBox) {
			System.out.println(comboBox.getSelectedItem());
		}
		
	}


}
