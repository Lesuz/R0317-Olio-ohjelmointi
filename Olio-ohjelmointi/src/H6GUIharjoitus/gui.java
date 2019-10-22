package H6GUIharjoitus;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

public class gui {
	
	public static void main(String args[]) {
	
		JFrame frame = new JFrame("Eka ikkuna");
		frame.getContentPane().setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		
		JMenuBar mb = new JMenuBar();
		JMenu m1 = new JMenu("Tietoja");
		JMenuItem m11 = new JMenuItem("Avaa ikkuna");
		
		m1.add(m11);
		mb.add(m1);
		frame.getContentPane().add(mb);
		
		JButton button2 = new JButton("Toka nappi!");
		//frame.add(button2);
		frame.getContentPane().add(button2);
		
		JButton button1 = new JButton("Paina!");
		//frame.add(button1);
		frame.getContentPane().add(button1);
		
		JButton button3 = new JButton("Kolmas nappi!");
		//frame.add(button2);
		frame.getContentPane().add(button3);
		
		JTextArea ta = new JTextArea(10,10);
		frame.getContentPane().add(ta);
		
		frame.setVisible(true);
		
		
	}

}
