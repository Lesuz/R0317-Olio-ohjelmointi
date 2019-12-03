import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.sql.*;
import javax.swing.JMenuItem;

public class Opiskelijat extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private DefaultTableModel model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Opiskelijat frame = new Opiskelijat();
					frame.setTitle("Opiskelijat");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the frame.
	 */
	public Opiskelijat() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 489, 336);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnTietojaOhjelmasta = new JMenu("Tietoja");
		menuBar.add(mnTietojaOhjelmasta);
		
		JMenuItem mntmTietojaOhjelmasta = new JMenuItem("Tietoja Ohjelmasta");
		mntmTietojaOhjelmasta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel tiedot = new JPanel();
				JOptionPane.showOptionDialog(null, "T‰ss‰ sovelluksessa voidaan selailla opiskelijoiden tietoja, \n" + "poistaa ja lis‰t‰ niit‰. \n\n" +" T‰m‰n sovelluksen on tehnyt Susanna H‰m‰l‰inen.",
						"Mik‰ t‰m‰ sovellus on?", JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE, null, new Object[]{}, null);
			}
		});
		mnTietojaOhjelmasta.add(mntmTietojaOhjelmasta);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Luodaan nappi opiskeljoiden lis‰‰miselle
		JButton btnLisOpiskelija = new JButton("Lis\u00E4\u00E4 opiskelija");
		btnLisOpiskelija.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Nappia painamalla avautuu uusi ikkuna, johon voi t‰ytt‰‰ uuden opiskelijan tiedot
				try {
					LisaaOpiskelija frame = new LisaaOpiskelija();
					frame.setTitle("Lisaa Opiskelija");
					frame.setAlwaysOnTop(true);
					frame.setVisible(true);
				} catch (Exception e1) {
					System.out.print(e1);
				}
				
			}
		});
		btnLisOpiskelija.setBounds(59, 246, 154, 21);
		contentPane.add(btnLisOpiskelija);
		
		// Luodaan nappi joka avaa ikkunan josta voi poistaa opiskelijoita
		JButton btnPoistaOpiskelija = new JButton("Poista opiskelija");
		btnPoistaOpiskelija.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					PoistaOpiskelija frame = new PoistaOpiskelija();
					frame.setTitle("Poista Opiskelija");
					frame.setAlwaysOnTop(true);
					frame.setVisible(true);
				} catch (Exception e1) {
					System.out.print(e1);
				}
			}
		});
		btnPoistaOpiskelija.setBounds(272, 210, 151, 21);
		contentPane.add(btnPoistaOpiskelija);
		
		JButton btnMuokkaaTietoja = new JButton("Muokkaa tietoja");
		// Muokkaa nappi ei k‰ytˆss‰ viel‰, sill‰ sill‰ ei ole viel‰ toimintoa
		btnMuokkaaTietoja.setEnabled(false);
		
		btnMuokkaaTietoja.setBounds(272, 246, 151, 21);
		contentPane.add(btnMuokkaaTietoja);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 455, 189);
		contentPane.add(scrollPane);
		
		// Kolumnien nimet 
		String[] columNames = {"ID", "Etunimi", "Sukunimi", "Opiskelijanumero"};
		model = new DefaultTableModel();
		model.setColumnIdentifiers(columNames);
		
		table = new JTable();
		table.setModel(model);
		scrollPane.setViewportView(table);
		lataa();
		
		JButton btnLataaTiedotTietokannasta = new JButton("Lataa tiedot tietokannasta");
		btnLataaTiedotTietokannasta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Nappia painamalla haetaan tietokannassa olevat tiedot ja tulostetaan ne JTableen
				lataa();
				
			}
		});
		btnLataaTiedotTietokannasta.setBounds(62, 210, 151, 21);
		contentPane.add(btnLataaTiedotTietokannasta);
	}
	public void lataa() {
		ResultSet rs = null;
		String id = "";
		String etunimi = "";
		String sukunimi = "";
		String numero ="";
		int rows = model.getRowCount();
		
		
		// Varaudutaan poikkeuksiin; esim. jos tietokantaan ei saada yhteytt‰
		try {
			// Poistaa edelliset tiedot n‰ytˆlt‰, jotta samoja tietoja ei ole useampaa kertaan
			for(int i = rows - 1; i >= 0 ; i--) {
				model.removeRow(i);
			}
			// M‰‰ritell‰‰n tietokannan yhteysosoite sek‰ tietokannan nimi
			String URL = "jdbc:mysql://localhost:3306/8rdc7qjrlq";
			// M‰‰ritell‰‰n k‰ytt‰j‰tiedot yhteyden luomista varten
			String USERID = "root";
			String PASSWORD = "";
						
			// Luodaan yhteys k‰ytt‰en edell‰nmainittuja tietoja
			Connection con = DriverManager.getConnection(URL, USERID, PASSWORD);
						
			System.out.println("Yhteys tietokantaan on luotu.");
						
			// Luodaan uusi kysely
			Statement stmt = con.createStatement();
			// Suoritetaan kysely ja otetaan tulokset talteen
			rs = stmt.executeQuery("SELECT * FROM OPISKELIJATIEDOT");
							
			// Tulosjoukko on taulukko-tyyppinen rakenne, joka
			// voidaan k‰yd‰ l‰pi esim. while silmukalla
			
			// Tulostaa jokaisen rivin, jolla on tietoa
			while (rs.next()){
				id = Integer.toString(rs.getInt(1));
				etunimi = rs.getString(2);
				sukunimi = rs.getString(3);
				numero = rs.getString(4);
				
				model.addRow(new Object[] {id, etunimi, sukunimi, numero} );
			}
			rs.last();
			System.out.println("Tuloksia palautui: "+rs.getRow()+" rivi‰.");
					
			// Suljetaan yhteys
			con.close();
		} catch (SQLException e) {
			System.out.println("Virhe tietokannan k‰ytˆss‰!");
			System.out.println(e);
		} // catch
	}
}
