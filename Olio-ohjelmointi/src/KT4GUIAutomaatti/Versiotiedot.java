package KT4GUIAutomaatti;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;

// sis�lt�� koodin, joka m��ritt��� uuden ikkunan ulkon��n
@SuppressWarnings("serial")
public class Versiotiedot  extends JFrame {
	
	public Versiotiedot() {
		
		// luodaan label, jossa teksi keskitettyn� k�ytt�en html:��, jonka j�lkee muokataan tekstin ulkon�k��
		JLabel lblautomaatti = new JLabel("<html><div style='text-align: center;'>JUOMA-AUTOMAATTI V. 1.0<br>TEKIJ�: SUSANNA H�M�L�INEN<div/></html>");
		lblautomaatti.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		// T�m� koodi p�tk� n�ytt�� teksti-ikkunan
		JOptionPane.showOptionDialog(null, lblautomaatti,"Kahviautomaatti GUI v. 1.0", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, null, null);
	}
	
	

}
