package JuomaAutomaattiv2;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.awt.GridLayout;

public class GUI_Automaatti extends JFrame {

	// Luokkamuuttujat
	// Esitell‰‰n t‰‰ll‰ jotta komponentteihin voidaan viitata mist‰ tahansa luokan
	// sis‰lt‰

	JPanel contentPane;
	private JMenuItem mntmTallennaAutomaatinTila;
	private JMenuItem mntmLataaAutomaatti;

	/**
	 * Main-metodi, joka k‰ynnist‰‰ sovelluksen
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					// Luodaan ensmin uusi JuomaAutomaatti-olio
					JuomaAutomaatti ja = new JuomaAutomaatti();

					// K‰yttˆliittym‰ saa parametrina olion, jonka tiedot se n‰ytt‰‰
					GUI_Automaatti frame = new GUI_Automaatti(ja);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Konstruktorissa rakennetaan k‰yttˆliittym‰. Huomaa, ett‰ otetaan parametrina
	 * vastaan alussa luotu juoma-automaatti. T‰m‰ siksi, ett‰ voidaan n‰ytt‰‰ sen
	 * tiedot GUI:ssa
	 */
	public GUI_Automaatti(JuomaAutomaatti ja) {

		// Ikkunan otsikko ja koko

		setTitle("Kahviautomaatti GUI v. 1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 465, 705);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnYllpito = new JMenu("Yll\u00E4pito");
		menuBar.add(mnYllpito);
		
		JMenu mnTietojaOhjelmasta = new JMenu("Tietoja ohjelmasta");
		menuBar.add(mnTietojaOhjelmasta);

	 
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnKahvi = new JButton("");
		btnKahvi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Tilaa kahvin
			
			}
		});
		btnKahvi.setBounds(57, 57, 103, 68);
		btnKahvi.setIcon(new ImageIcon(GUI_Automaatti.class.getResource("/JuomaAutomaattiv2/Icons/coffee1.jpg")));
		contentPane.add(btnKahvi);
		
		JLabel lblKahvia = new JLabel("Kahvia: ");
		lblKahvia.setBounds(225, 5, 220, 212);
		lblKahvia.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(lblKahvia);
		
		JButton btnTee = new JButton("");
		btnTee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Tilaa teen
			}
		});
		btnTee.setBounds(57, 265, 103, 75);
		btnTee.setIcon(new ImageIcon(GUI_Automaatti.class.getResource("/JuomaAutomaattiv2/Icons/tea1.jpg")));
		contentPane.add(btnTee);
		
		JLabel lblTeet = new JLabel("Teet\u00E4: ");
		lblTeet.setBounds(225, 217, 220, 212);
		lblTeet.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(lblTeet);
		
		JButton btnKaakao = new JButton("");
		btnKaakao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Tilaa kaakao
			}
		});
		btnKaakao.setBounds(57, 478, 103, 68);
		btnKaakao.setIcon(new ImageIcon(GUI_Automaatti.class.getResource("/JuomaAutomaattiv2/Icons/kaakao1.jpg")));
		contentPane.add(btnKaakao);
		
		JLabel lblKaakaota = new JLabel("Kaakaota: ");
		lblKaakaota.setBounds(225, 429, 220, 212);
		lblKaakaota.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(lblKaakaota);
		
		JLabel lblKahvi = new JLabel("Kahvi");
		lblKahvi.setBounds(100, 147, 36, 14);
		contentPane.add(lblKahvi);
		
		JLabel lblTee = new JLabel("Tee");
		lblTee.setBounds(100, 372, 36, 14);
		contentPane.add(lblTee);
		
		JLabel lblKaakao = new JLabel("Kaakao");
		lblKaakao.setBounds(91, 580, 45, 14);
		contentPane.add(lblKaakao);
	}
}
