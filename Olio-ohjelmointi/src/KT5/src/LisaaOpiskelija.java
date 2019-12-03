import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LisaaOpiskelija extends JFrame {
	
	private JPanel contentPane;
	private JTextField txtEtunimi;
	private JTextField txtSukunimi;
	private JTextField txtNumero;
	
	
	public LisaaOpiskelija() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(120, 120, 405, 235);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEtunimi = new JLabel("Etunimi:");
		lblEtunimi.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEtunimi.setBounds(10, 37, 89, 13);
		contentPane.add(lblEtunimi);
		
		JLabel lblSukunimi = new JLabel("Sukunimi:");
		lblSukunimi.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSukunimi.setBounds(10, 73, 74, 13);
		contentPane.add(lblSukunimi);
		
		JLabel lblNumero = new JLabel("Opiskelijanumero:");
		lblNumero.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNumero.setBounds(10, 110, 105, 13);
		contentPane.add(lblNumero);
		
		txtEtunimi = new JTextField();
		txtEtunimi.setText("");
		txtEtunimi.setBounds(139, 35, 96, 19);
		contentPane.add(txtEtunimi);
		txtEtunimi.setColumns(10);
		
		txtSukunimi = new JTextField();
		txtSukunimi.setText("");
		txtSukunimi.setBounds(139, 71, 96, 19);
		contentPane.add(txtSukunimi);
		txtSukunimi.setColumns(10);
		
		txtNumero = new JTextField();
		txtNumero.setText("");
		txtNumero.setBounds(139, 108, 96, 19);
		contentPane.add(txtNumero);
		txtNumero.setColumns(10);
		
		JButton btnTallenna = new JButton("Tallenna");
		btnTallenna.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tallenna();
			}
		});
		btnTallenna.setBounds(69, 167, 85, 21);
		contentPane.add(btnTallenna);
		
		JButton btnPeruuta = new JButton("Peruuta");
		btnPeruuta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				peruuta();
			}
		});
		btnPeruuta.setBounds(219, 167, 85, 21);
		contentPane.add(btnPeruuta);
		
	}
public void tallenna() {
	
		// M‰‰ritell‰‰n tietokannan yhteysosoite sek‰ tietokannan nimi
		String URL = "jdbc:mysql://localhost:3306/8rdc7qjrlq";
		// M‰‰ritell‰‰n k‰ytt‰j‰tiedot yhteyden luomista varten
		String USERID = "root";
		String PASSWORD = "";
		
		String uusiNimi = txtEtunimi.getText();
		String uusiSukunimi = txtSukunimi.getText();
		String uusiNumero = txtNumero.getText();
		
		// Luodaan yhteys k‰ytt‰en edell‰nmainittuja tietoja
		try {
			Connection con = DriverManager.getConnection(URL, USERID, PASSWORD);
			// Luodaan uusi kysely
			Statement stmt = con.createStatement();
			System.out.println("Yhteys tietokantaan on luotu.");
			
			// P‰ivitysoperaatio t‰ytyy tehd‰ executeUpdate -metodilla. 
			// K‰ytet‰‰n siisteyden vuoksi SQL lausetta joka on m‰‰ritelty muuttujaan	
			// Kerrotaan mihin muuttujiin halutaan laittaa tietoa
			String sql = "INSERT INTO OPISKELIJATIEDOT (etunimi, sukunimi, opiskelijanumero)" + " VALUES ( ?, ?, ?)";
			//int tuloksia = stmt.executeUpdate(SQL_lause);
			PreparedStatement preparedStmt = con.prepareStatement(sql);

			// T‰ydennet‰‰n SQL-lauseisiin puuttuvat muuttujat
			preparedStmt.setString(1, uusiNimi);
			preparedStmt.setString(2, uusiSukunimi);
			preparedStmt.setString(3, uusiNumero);

			// Suoritetaan SQL lause

			preparedStmt.execute();
			
			System.out.println("Tiedot Lis‰tty");

			 super.dispose();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void peruuta() {
		super.dispose();
	}
}
