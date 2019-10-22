package Harjoitus25syyskuu;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Ikkuna {
	
	public static void main(String[] args) {

		JFrame ikkuna = new JFrame("Eka ikkuna");
		FlowLayout sijoittelija = new FlowLayout();  
		ikkuna.setLayout(sijoittelija);

		//ikkuna.setBackground(Color.GREEN); Ei toimi vielä, täytyy ehkä luoda sisältö sille, katso alla oleva koodi
		ikkuna.getContentPane().setBackground(Color.CYAN);
		ikkuna.setSize(300, 300);  
		ikkuna.setLocation(500, 200);
		ikkuna.setResizable(false); // ikkunna kokoa ei voi muuttaa
		
		JButton nappi1 = new JButton();
		JButton nappi2 = new JButton("Toka nappi");
		
		JTextArea tekstikenttä = new JTextArea("Toinen ikkuna");
		
		
		nappi1.setText("Eka nappi");	
		
		ikkuna.add(nappi1); // lisätään nappi1 "näkyväksi"
		ikkuna.add(nappi2); // napit lisätään ennenkuin ikkuna laitetaan näkyviin eli ennen ikkuna.setVisible koodia!!!	
		ikkuna.add(tekstikenttä);
		
		ikkuna.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ikkuna.setVisible(true);
	}
}

