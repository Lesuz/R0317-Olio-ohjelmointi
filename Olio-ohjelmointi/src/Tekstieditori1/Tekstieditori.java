package Tekstieditori1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JEditorPane;
import javax.swing.JFileChooser;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.awt.event.InputEvent;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tekstieditori extends JFrame {

	private JPanel contentPane;
	private JEditorPane editorPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tekstieditori frame = new Tekstieditori();
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
	public Tekstieditori() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnTiedosto = new JMenu("Tiedosto");
		menuBar.add(mnTiedosto);
		
		JMenuItem mntmAvaa = new JMenuItem("Avaa");
		mntmAvaa.setIcon(new ImageIcon(Tekstieditori.class.getResource("/Tekstieditori1/Icons/folder1.png")));
		mntmAvaa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Avaa();
			}
			
		});
		
		// https://www.flaticon.com/free-icon/folder_149334#term=folder&page=1&position=9
		mntmAvaa.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
		mnTiedosto.add(mntmAvaa);
		
		JMenuItem mntmTallenna = new JMenuItem("Tallenna");
		mntmTallenna.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Tallennusta hoitava koodi
				//Tiedoston tallennusikkuna
				
				Tallenna();
			}
		});
		mnTiedosto.add(mntmTallenna);
		
		JMenuItem mntmLopeta = new JMenuItem("Lopeta");
		mntmLopeta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		mnTiedosto.add(mntmLopeta);
		
		JMenuItem mntmSulje = new JMenuItem("Sulje");
		mnTiedosto.add(mntmSulje);
		
		JMenu mnMuokkaa = new JMenu("Muokkaa");
		menuBar.add(mnMuokkaa);
		
		JMenuItem mntmEtsi = new JMenuItem("Etsi");
		mntmEtsi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//etsi toiminnallisuus
				
				String sisalto = editorPane.getText();
				String txtEtsi = "";
				JTextField txtFind = new JTextField(10);
				sisalto = sisalto.toLowerCase();
				
				JPanel panel = new JPanel();
		        
		        // Adding the Find text panel
		        panel.add(new JLabel("Find text: "));
		        panel.setSize(20, 50);
		        panel.add(txtFind);
		        
		        int result = JOptionPane.showConfirmDialog(null,  panel, "Find text", JOptionPane.OK_CANCEL_OPTION);
		        
		        txtEtsi = txtFind.getText();
				
				String haettava = txtEtsi;
				int indeksi = sisalto.indexOf(haettava);
				System.out.println("Indeksi: " + indeksi);
				
				editorPane.setSelectionColor(Color.YELLOW);
				
				editorPane.setSelectionStart(indeksi);
				editorPane.setSelectionEnd(indeksi + haettava.length());
			}
		});
		mnMuokkaa.add(mntmEtsi);
		
		JMenuItem mntmKorvaa = new JMenuItem("Korvaa");
		mntmKorvaa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String txtEtsi = "";
				String txtKorvaa = "";
				String sisalto = editorPane.getText();
				
				JTextField txtFind = new JTextField(10);
		        JTextField txtReplaceAll = new JTextField(10);
		        JButton btnReplaceAll = new JButton("Replace All");
		        
		        JPanel panel = new JPanel();
		        
		        // Adding the Find text panel
		        panel.add(new JLabel("Find text: "));
		        panel.setSize(20, 50);
		        panel.add(txtFind);
		        
		        // Adding the Replace with panel
		        panel.add(new JLabel("Replace with: "));
		        panel.add(txtReplaceAll);
		        
		        
		        int result = JOptionPane.showConfirmDialog(null,  panel, "Find and replace", JOptionPane.OK_CANCEL_OPTION);
		        
		        txtEtsi = txtFind.getText();
		        txtKorvaa = txtReplaceAll.getText();
				
				sisalto = sisalto.replaceAll(txtEtsi, txtKorvaa);				
				editorPane.setText(sisalto);
				
			}
		});
		mnMuokkaa.add(mntmKorvaa);
		
		JMenu mnTietoja = new JMenu("Tietoja");
		menuBar.add(mnTietoja);
		
		JMenuItem mntmTietojaOhjelmasta = new JMenuItem("Tietoja ohjelmasta");
		mntmTietojaOhjelmasta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JPanel tiedot = new JPanel();
				
				JOptionPane.showOptionDialog(null, "Info about me: \n" + "I am Susanna and I made this barely working texteditor." ,"Info about me", JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE, null, new Object[]{}, null);
				
			}
		});
		mnTietoja.add(mntmTietojaOhjelmasta);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JToolBar toolBar = new JToolBar();
		contentPane.add(toolBar, BorderLayout.NORTH);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Avaa();
			//Ei osaa lukee ku txt fileja eikä näyttää ääkkösiä :'(
			}
		});
		button.setIcon(new ImageIcon(Tekstieditori.class.getResource("/Tekstieditori1/Icons/file1.png")));
		// https://www.flaticon.com/free-icon/file_149346#term=file&page=1&position=8
		toolBar.add(button);
		
		JButton button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Tallenna();
			}
		});
		button_1.setIcon(new ImageIcon(Tekstieditori.class.getResource("/Tekstieditori1/Icons/save1.png")));
		// https://www.flaticon.com/free-icon/save_148730#term=save%20file&page=1&position=3
		toolBar.add(button_1);
		
		JButton button_2 = new JButton("");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Cut
			}
		});
		button_2.setIcon(new ImageIcon(Tekstieditori.class.getResource("/Tekstieditori1/Icons/openned-scissors1.png")));
		// https://www.flaticon.com/free-icon/openned-scissors_17836#term=cut&page=1&position=7
		toolBar.add(button_2);
		
		editorPane = new JEditorPane();
		//editorPane.setContentType("charset=UTF-8");
		contentPane.add(editorPane, BorderLayout.CENTER);
		
	}

	public JEditorPane getEditorPane() {
		return editorPane;
	}
	public static JFrame createFrame(){
        JFrame frame = new JFrame("Notepad Frame");
        frame.setSize(600,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new JTextArea());
        return frame;
    }
	public void Avaa() {
		// Olettaa tiedoston olevan ASCII tiedosto
		JFileChooser valintaikkuna = new JFileChooser();
		valintaikkuna.setApproveButtonText("Avaa tiedosto");
		valintaikkuna.setDialogTitle("Tiedoston valinta");
		valintaikkuna.showOpenDialog(null);
		String rivi = "";
		String uusiTiedosto = valintaikkuna.getSelectedFile().getAbsolutePath();
		

		
		try {
			
			Scanner lukija = null;
			File tiedosto = new File(uusiTiedosto);
			
			lukija = new Scanner(tiedosto);
			
			while (lukija.hasNextLine()) {
				rivi += lukija.nextLine() + "\n";
				System.out.println(rivi);
			}
		} catch (FileNotFoundException e1) {
			System.out.println("Tiedostoa ei löydy..");
		}
		
		editorPane.setText(rivi);
	
	}
	public void Tallenna() {
		
		JFileChooser valintaikkuna = new JFileChooser();
		valintaikkuna.showSaveDialog(null);
		
		String uusiTiedosto = valintaikkuna.getSelectedFile().getAbsolutePath();
		
		System.out.println("Kirjoitettava tiedosto: " + uusiTiedosto);
		
		try {
			PrintWriter writer = new PrintWriter(uusiTiedosto);
			String sisalto = editorPane.getText();
			
			writer.println ( sisalto );
			
			writer.flush();
			writer.close();
			
		} catch (Exception e1) {
			
			System.out.println("Tiedoston tallennuksessa tapahtui virhe!");
			e1.printStackTrace();
		}
	}
}
	

