package Lämpötilamuunnin;

import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Lämpötilamuunnin extends JFrame{
	
	private JPanel contentPane;
	private JLabel celcius;
	private JTextField degrees;
	private JButton btnConvert;
	private JTextField txtFahrenheit;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lämpötilamuunnin frame = new Lämpötilamuunnin();
					frame.setVisible(true);
					frame.setSize(300, 100);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Lämpötilamuunnin() {
		setTitle("Celcius converter");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder (5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout (2,2));
		
		celcius = new JLabel("Celcius");
		contentPane.add(celcius);
		
		degrees = new JTextField();
		contentPane.add(degrees);
		
		btnConvert = new JButton("Convert");
		contentPane.add(btnConvert);
		
		txtFahrenheit = new JTextField();
		contentPane.add(txtFahrenheit);
		txtFahrenheit.setEditable(false);
		txtFahrenheit.setColumns(10);
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				String input = degrees.getText();
				double d = Double.parseDouble(input);
				d = d * 9 / 5 + 32;
				txtFahrenheit.setText("Fahrenheit: " + d);
			}
		});
		
		
		
	}

}
