import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class PoistaOpiskelija extends JFrame {
	private JTextField txtRivi;
	public PoistaOpiskelija() {
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(180, 80, 495, 165);
		
		JLabel lblMikRiviPoistetaan = new JLabel("Mik\u00E4 rivi poistetaan? Anna rivin ID:");
		lblMikRiviPoistetaan.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMikRiviPoistetaan.setBounds(10, 39, 226, 38);
		getContentPane().add(lblMikRiviPoistetaan);
		
		txtRivi = new JTextField();
		txtRivi.setText("");
		txtRivi.setBounds(246, 51, 102, 19);
		getContentPane().add(txtRivi);
		txtRivi.setColumns(10);
		
		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int id = Integer.parseInt(txtRivi.getText());
				poista(id);
			}
		});
		btnOk.setBounds(374, 39, 85, 21);
		getContentPane().add(btnOk);
		
		JButton btnPeruuta = new JButton("Peruuta");
		btnPeruuta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				peruuta();
			}
		});
		btnPeruuta.setBounds(374, 70, 85, 21);
		getContentPane().add(btnPeruuta);
	}
	void poista(int id) {
	
		try {
			// M��ritell��n tietokannan yhteysosoite sek� tietokannan nimi
			String URL = "jdbc:mysql://localhost:3306/8rdc7qjrlq";
			// M��ritell��n k�ytt�j�tiedot yhteyden luomista varten
			String USERID = "root";
			String PASSWORD = "";
			
			// Luodaan yhteys k�ytt�en edell�nmainittuja tietoja
			Connection con = DriverManager.getConnection(URL, USERID, PASSWORD);
			
			System.out.println("Yhteys tietokantaan on luotu.");
			
			String sql = "DELETE FROM OPISKELIJATIEDOT WHERE id_opiskelija = ?";
			
			PreparedStatement preparedStmt = con.prepareStatement(sql);

			// T�ydennet��n SQL-lauseisiin puuttuvat muuttujat
			preparedStmt.setInt(1, id);

			preparedStmt.execute();
		
			System.out.println("Tiedot poistettu");
			// Suljetaan yhteys
			con.close();

			super.dispose();
		} catch (SQLException e) {
			System.out.println("Virhe tietokannan k�yt�ss�!");
			System.out.println(e);
		} // catch
	} // main
	void peruuta() {
		super.dispose();
	}
} // class

