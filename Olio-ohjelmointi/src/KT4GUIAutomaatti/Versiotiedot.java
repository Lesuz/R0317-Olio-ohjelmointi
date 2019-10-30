package KT4GUIAutomaatti;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;

// sisältää koodin, joka määrittäää uuden ikkunan ulkonäön
@SuppressWarnings("serial")
public class Versiotiedot  extends JFrame {
	
	public Versiotiedot() {
		
		// luodaan label, jossa teksi keskitettynä käyttäen html:ää, jonka jälkee muokataan tekstin ulkonäköä
		JLabel lblautomaatti = new JLabel("<html><div style='text-align: center;'>JUOMA-AUTOMAATTI V. 1.0<br>TEKIJÄ: SUSANNA HÄMÄLÄINEN<div/></html>");
		lblautomaatti.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		// Tämä koodi pätkä näyttää teksti-ikkunan
		JOptionPane.showOptionDialog(null, lblautomaatti,"Kahviautomaatti GUI v. 1.0", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, null, null);
	}
	
	

}
