package KT4GUIAutomaatti;

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
import javax.swing.BoxLayout;
import java.awt.GridLayout;

public class GUI_Automaatti extends JFrame {

	// Luokkamuuttujat
	// Esitell‰‰n t‰‰ll‰ jotta komponentteihin voidaan viitata mist‰ tahansa luokan
	// sis‰lt‰

	JPanel contentPane;
	private JMenuItem mntmTallennaAutomaatinTila;
	private JMenuItem mntmLataaAutomaatti;
	// Lis‰t‰‰n kolme muuttujaa, jotka sis‰lt‰‰ nesteen m‰‰r‰n
	private JLabel labelkahvimaara;
	private JLabel labelteemaara;
	private JLabel labelkaakaomaara;

	/**
	 * Main-metodi, joka k‰ynnist‰‰ sovelluksen
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					// Luodaan ensin uusi JuomaAutomaatti-olio
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
		
		JMenuItem mntmAsetaKahvinMr = new JMenuItem("Aseta kahvin m\u00E4\u00E4r\u00E4");
		mntmAsetaKahvinMr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String uusiArvo = JOptionPane.showInputDialog(null, "Anna uusi arvo: ");
				int uusiKahvi = Integer.parseInt(uusiArvo);
				
				// p‰ivitet‰‰n arvo komponenttiin
				ja.setKahvi(uusiKahvi);
				paivitaKahvimaara(ja);
				
			}
		});
		mnYllpito.add(mntmAsetaKahvinMr);
		
		JMenuItem mntmAsetaTeenMr = new JMenuItem("Aseta teen m\u00E4\u00E4r\u00E4");
		mntmAsetaTeenMr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String uusiArvo = JOptionPane.showInputDialog(null, "Anna uusi arvo: ");
				int uusiTee = Integer.parseInt(uusiArvo);
				
				// p‰ivitet‰‰n arvo komponenttiin
				ja.setTee(uusiTee);
				paivitaTeemaara(ja);
			}
		});
		mnYllpito.add(mntmAsetaTeenMr);
		
		JMenuItem mntmSetaKaakaonMr = new JMenuItem("Aseta kaakaon m\u00E4\u00E4r\u00E4");
		mntmSetaKaakaonMr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String uusiArvo = JOptionPane.showInputDialog(null, "Anna uusi arvo: ");
				int uusiKaakao = Integer.parseInt(uusiArvo);
				
				// p‰ivitet‰‰n arvo komponenttiin
				ja.setKaakao(uusiKaakao);
				paivitaKaakaomaara(ja);
			}
		});
		mnYllpito.add(mntmSetaKaakaonMr);
		
		JMenuItem mntmTallennaAutomaatinTila_1 = new JMenuItem("Tallenna automaatin tila");
		mntmTallennaAutomaatinTila_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Sarjallistamista.kirjoitaTiedostoon(ja);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		mnYllpito.add(mntmTallennaAutomaatinTila_1);
		
		JMenuItem mntmLataaAutomaatti_1 = new JMenuItem("Lataa automaatti");
		mntmLataaAutomaatti_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					JuomaAutomaatti uusi = Sarjallistamista.lueTiedostosta();
					// asetetan juoma-automaatille tiedostosta luetut arvot
					ja.setKahvi(uusi.getKahvi());
					paivitaKahvimaara(ja);
					
					ja.setTee(uusi.getTee());
					ja.setKaakao(uusi.getKaakao());
					
					
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		mnYllpito.add(mntmLataaAutomaatti_1);
		
		JMenuItem mntmLopeta = new JMenuItem("Lopeta");
		mntmLopeta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		mnYllpito.add(mntmLopeta);
		
		JMenu mnTietojaOhjelmasta = new JMenu("Tietoja ohjelmasta");
		menuBar.add(mnTietojaOhjelmasta);
		
		JMenuItem mntmVersiotiedot = new JMenuItem("Versiotiedot");
		mntmVersiotiedot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Koodi joka Avaa uuden ikkunna jossa on tietoja ohjelmasta
				new Versiotiedot();
				
			}
		});
		mnTietojaOhjelmasta.add(mntmVersiotiedot);
		
		JMenuItem mntmOhje = new JMenuItem("Ohje");
		mnTietojaOhjelmasta.add(mntmOhje);

	 
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Kahvi tilataan
				ja.valmistaKahvi();
				
				// kutsutaan metodia, joka p‰ivitt‰‰ kahvim‰‰r‰n n‰ytˆlle
				paivitaKahvimaara(ja);
			}
		});
		button.setIcon(new ImageIcon("C:\\Users\\lsusa\\eclipse-workspace\\GUI-JuomaAutomaatti\\Images\\coffee1.jpg"));
		button.setBounds(50, 42, 117, 96);
		contentPane.add(button);
		
		JButton button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Tilataan tee
				ja.valmistaTee();
				//p‰ivit‰ tee
				paivitaTeemaara(ja);
			}
		});
		button_1.setIcon(new ImageIcon("C:\\Users\\lsusa\\eclipse-workspace\\GUI-JuomaAutomaatti\\Images\\tea1.png"));
		button_1.setBounds(50, 206, 117, 113);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Tilataan kaakao
				ja.valmistaKaakao();
				// p‰ivit‰ kaakao
				paivitaKaakaomaara(ja);
			}
		});
		button_2.setIcon(new ImageIcon("C:\\Users\\lsusa\\eclipse-workspace\\GUI-JuomaAutomaatti\\Images\\hotchoco1.jpg"));
		button_2.setBounds(50, 405, 117, 109);
		contentPane.add(button_2);
		
		JLabel lblKahvia = new JLabel("Kahvia: ");
		lblKahvia.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblKahvia.setBounds(205, 89, 65, 14);
		contentPane.add(lblKahvia);
		
		JLabel lblTeet = new JLabel("Teet\u00E4: ");
		lblTeet.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTeet.setBounds(205, 260, 65, 14);
		contentPane.add(lblTeet);
		
		JLabel lblKaakaota = new JLabel("Kaakaota: ");
		lblKaakaota.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblKaakaota.setBounds(198, 455, 81, 14);
		contentPane.add(lblKaakaota);
		
		JLabel lblKahvi = new JLabel("Kahvi");
		lblKahvi.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblKahvi.setBounds(95, 149, 40, 14);
		contentPane.add(lblKahvi);
		
		JLabel lblTee = new JLabel("Tee");
		lblTee.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTee.setBounds(95, 344, 40, 14);
		contentPane.add(lblTee);
		
		JLabel lblKaakao = new JLabel("Kaakao");
		lblKaakao.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblKaakao.setBounds(86, 539, 81, 14);
		contentPane.add(lblKaakao);
		
		labelkahvimaara = new JLabel("50");
		labelkahvimaara.setFont(new Font("Tahoma", Font.PLAIN, 16));
		labelkahvimaara.setBounds(269, 91, 49, 14);
		contentPane.add(labelkahvimaara);
		
		labelteemaara = new JLabel("50");
		labelteemaara.setFont(new Font("Tahoma", Font.PLAIN, 16));
		labelteemaara.setBounds(269, 262, 49, 14);
		contentPane.add(labelteemaara);
		
		labelkaakaomaara = new JLabel("50");
		labelkaakaomaara.setFont(new Font("Tahoma", Font.PLAIN, 16));
		labelkaakaomaara.setBounds(289, 457, 49, 14);
		contentPane.add(labelkaakaomaara);
	}
	public void paivitaKahvimaara(JuomaAutomaatti ja) {
		
		// kahvi arvon p‰ivitys + muutetaan kahvi stringiksi + tehd‰‰n getKahville oma muuttuja
		int kahvimaara = ja.getKahvi();
		if ( kahvimaara < 20) {
			labelkahvimaara.setForeground(Color.RED);
		} else {
			labelkahvimaara.setForeground(Color.BLACK);
		}
		labelkahvimaara.setText(Integer.toString(ja.getKahvi()));
	}
	public void paivitaTeemaara(JuomaAutomaatti ja) {
		
		// teen arvon p‰ivitys + teen muutos stringiksi + getTee saa oman muuttujan
		int teemaara = ja.getTee();
		if ( teemaara < 20) {
			labelteemaara.setForeground(Color.RED);
		} else {
			labelteemaara.setForeground(Color.BLACK);
		}
		labelteemaara.setText(Integer.toString(ja.getTee()));
	}
	public void paivitaKaakaomaara(JuomaAutomaatti ja) {
		
		// kaakaon arvon p‰ivity + sen muuttaminen stringiksi + getKaakao saa oman muuttujan
		int kaakaomaara = ja.getKaakao();
		if( kaakaomaara < 20 ) {
			labelkaakaomaara.setForeground(Color.RED);
		} else {
			labelkaakaomaara.setForeground(Color.BLACK);
		}
		labelkaakaomaara.setText(Integer.toString(ja.getKaakao()));
	}
}
