package aster;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI extends JFrame {
	JPanel p_listeAbteilungen;
	JPanel p_listeMitarbeiter;
	JPanel p_anzeigenMitarbeiter;
	JPanel p_bearbeitenMitarbeiter;

	JLabel l_firmaManagementSystem;

	public GUI() {
		l_firmaManagementSystem = new JLabel("Firma KiSaHo Management System");

		p_listeAbteilungen = new JPanel(new BorderLayout());
		p_listeMitarbeiter = new JPanel();
		p_anzeigenMitarbeiter = new JPanel();
		p_bearbeitenMitarbeiter = new JPanel();

		add(l_firmaManagementSystem);
		add(p_listeAbteilungen);
		add(p_listeMitarbeiter);
		add(p_anzeigenMitarbeiter);
		add(p_bearbeitenMitarbeiter);

		setSize(new Dimension(800, 600));
		setVisible(true);
		setLayout(new BorderLayout());
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new GUI();
	}
}
