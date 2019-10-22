package H6GUIharjoitus;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class GuiHarjoitus extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiHarjoitus frame = new GuiHarjoitus();
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
	public GuiHarjoitus() {
		setTitle("Chat Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnHelp = new JMenu("File");
		menuBar.add(mnHelp);
		
		JMenuItem mntmOpen = new JMenuItem("Open");
		mnHelp.add(mntmOpen);
		
		JMenuItem mntmSaveAs = new JMenuItem("Save as");
		mnHelp.add(mntmSaveAs);
		
		JMenu mnHelp_1 = new JMenu("Help");
		menuBar.add(mnHelp_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		JLabel lblEnterText = new JLabel("Enter text:");
		panel.add(lblEnterText);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnSend = new JButton("Send");
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("Hoi Maailma");
			}
		});
		panel.add(btnSend);
		
		JButton btnCancel = new JButton("Cancel");
		panel.add(btnCancel);
		
		textArea = new JTextArea();
		contentPane.add(textArea, BorderLayout.CENTER);
	}

}
