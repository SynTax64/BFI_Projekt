package aster;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class GUI extends JFrame {

	JLabel l_firmaManagementSystem;
	JPanel p_hauptPannel = null;
	JPanel p_ersteSection = null;
	JPanel p_subErste1Section = null;
	JPanel p_subErste2Section = null;
	JPanel p_zweiteSection = null;
	JPanel p_dritteSection = null;
	JPanel p_dritteSub1Section = null;
	JPanel p_dritteSub2Section = null;
	JPanel p_dritteSub3Section = null;
	JPanel p_vierteSection = null;
	JPanel p_vierteSub1Section = null;
	JPanel p_vierteSub2Section = null;

	// die erste Section der Applikation (alle Abteilungen in der Firma
	// (tabelarisch) anzeigen
	JTable t_listeAbteilungen = null;
	JButton b_angestellterAnz = null;
	JScrollPane sc_listeAbteil = null;

	// die zweite Section der Applikation (alle Mitarbeiter, die in einer Abteilung
	// angehören)
	JTable t_listeMitarbeiter = null;
	JScrollPane sc_listeMitarbeiter = null;

	// die dritte Section der Applikation (Auswahl einen Angestellter, angezeigt,
	// bearbeitet oder angelegt wird)
	JLabel l_AngestellteID = null;
	JTextField t_AngestellteID = null;
	JButton b_AngestellterAnzeigenBearbeiten = null;
	JButton b_NeuAngestellteAnlegen = null;

	// die vierte Section der Applikation (detaillirte Datei eines Angestellters)
	JLabel l_AngestellteIDAkt = null;
	JTextField t_AngestellteIDAkt = null;
	JLabel l_AngestellteNameAkt = null;
	JTextField t_AngestellteNameAkt = null;
	JLabel l_AngestellteGrundgehaltAkt = null;
	JTextField t_AngestellteGrundgehaltAkt = null;
	JLabel l_AngestellteZulageAkt = null;
	JTextField t_AngestellteZulageAkt = null;
	JLabel l_AngestellteBruttoAkt = null;
	JTextField t_AngestellteBruttoAkt = null;
	JLabel l_AngestellteNettoAkt = null;
	JTextField t_AngestellteNettoAkt = null;
	JButton b_AngestellteAktualiezieren = null;
	JButton b_AngestellteLoeschen = null;
	JButton b_AngestelleteSpeichern = null;
	JButton b_AppClose = null;

	public GUI() {

		// Alle Panels der Applikation
		p_hauptPannel = new JPanel(new GridLayout(2, 2, 20, 20));
		p_ersteSection = new JPanel(new GridLayout(2, 1, 20, 20));
		p_subErste1Section = new JPanel(new GridLayout(1, 1));
		p_subErste2Section = new JPanel(new GridLayout(2, 2));
		p_zweiteSection = new JPanel(new GridLayout(1, 1, 20, 20));
		p_dritteSection = new JPanel(new GridLayout(3, 1, 30, 30));
		p_dritteSub1Section = new JPanel(new GridLayout(0, 2));
		p_dritteSub2Section = new JPanel(new GridLayout(0, 1));
		p_dritteSub3Section = new JPanel(new GridLayout(0, 1));
		p_vierteSection = new JPanel(new GridLayout(1, 2, 20, 20));
		p_vierteSub1Section = new JPanel(new GridLayout(6, 2, 0, 10));
		p_vierteSub2Section = new JPanel(new GridLayout(4, 1, 0, 10));

		l_firmaManagementSystem = new JLabel("Firma KiSaHo Management System", SwingConstants.CENTER);
		// -------- 1 -----------
		t_listeAbteilungen = new JTable(getAbteilungenTestData(), getAbteilungenHeaderData());
		t_listeAbteilungen.setRowHeight(30);

		sc_listeAbteil = new JScrollPane(t_listeAbteilungen);
		b_angestellterAnz = new JButton("Liste aller Angestellten anzeigen");

		// -------- 2 -----------
		t_listeMitarbeiter = new JTable(getMitarbeiterTestData(), getMitarbeiterHeaderData());
		sc_listeMitarbeiter = new JScrollPane(t_listeMitarbeiter);
		// -------- 3 -----------
		l_AngestellteID = new JLabel("Angestellter ID: ");
		t_AngestellteID = new JTextField();
		b_AngestellterAnzeigenBearbeiten = new JButton("Angestellter anzeigen und bearbeiten");
		b_NeuAngestellteAnlegen = new JButton("Neuen Angestellter anlegen");
		// -------- 4 -----------
		l_AngestellteIDAkt = new JLabel("Angestellter ID: ");
		t_AngestellteIDAkt = new JTextField();
		l_AngestellteNameAkt = new JLabel("Name: ");
		t_AngestellteNameAkt = new JTextField();
		l_AngestellteGrundgehaltAkt = new JLabel("Grundgehalt: ");
		t_AngestellteGrundgehaltAkt = new JTextField();
		l_AngestellteZulageAkt = new JLabel("Zulage: ");
		t_AngestellteZulageAkt = new JTextField();

		l_AngestellteBruttoAkt = new JLabel("Brutto: ");
		t_AngestellteBruttoAkt = new JTextField();
		t_AngestellteBruttoAkt.setEditable(false);

		l_AngestellteNettoAkt = new JLabel("Netto: ");
		t_AngestellteNettoAkt = new JTextField();
		t_AngestellteNettoAkt.setEditable(false);

		b_AngestellteAktualiezieren = new JButton("Angestellter aktualisieren");

		b_AngestellteLoeschen = new JButton("Angestellter löschen");
		b_AngestelleteSpeichern = new JButton("Angestellter speichern");
		b_AppClose = new JButton("Anwendung schließen");

		// -------------------
		getContentPane().add(l_firmaManagementSystem, BorderLayout.NORTH);

		p_hauptPannel.add(p_ersteSection);
		p_hauptPannel.add(p_zweiteSection);
		p_hauptPannel.add(p_dritteSection);
		p_hauptPannel.add(p_vierteSection);

		p_ersteSection.add(p_subErste1Section);
		p_ersteSection.add(p_subErste2Section);
		p_subErste1Section.add(sc_listeAbteil);
		p_subErste2Section.add(b_angestellterAnz);

		p_zweiteSection.add(sc_listeMitarbeiter);

		p_dritteSection.add(p_dritteSub1Section);
		p_dritteSection.add(p_dritteSub2Section);
		p_dritteSection.add(p_dritteSub3Section);
		p_dritteSub1Section.add(l_AngestellteID);
		p_dritteSub1Section.add(t_AngestellteID);
		p_dritteSub2Section.add(b_AngestellterAnzeigenBearbeiten);
		p_dritteSub3Section.add(b_NeuAngestellteAnlegen);

		p_vierteSection.add(p_vierteSub1Section);
		p_vierteSection.add(p_vierteSub2Section);

		p_vierteSub1Section.add(l_AngestellteIDAkt);
		p_vierteSub1Section.add(t_AngestellteIDAkt);
		p_vierteSub1Section.add(l_AngestellteNameAkt);
		p_vierteSub1Section.add(t_AngestellteNameAkt);
		p_vierteSub1Section.add(l_AngestellteGrundgehaltAkt);
		p_vierteSub1Section.add(t_AngestellteGrundgehaltAkt);
		p_vierteSub1Section.add(l_AngestellteZulageAkt);
		p_vierteSub1Section.add(t_AngestellteZulageAkt);
		p_vierteSub1Section.add(l_AngestellteNettoAkt);
		p_vierteSub1Section.add(t_AngestellteNettoAkt);
		p_vierteSub1Section.add(l_AngestellteBruttoAkt);
		p_vierteSub1Section.add(t_AngestellteBruttoAkt);

		p_vierteSub2Section.add(b_AngestellteAktualiezieren);
		p_vierteSub2Section.add(b_AngestellteLoeschen);
		p_vierteSub2Section.add(b_AngestelleteSpeichern);
		p_vierteSub2Section.add(b_AppClose);

		getContentPane().add(p_hauptPannel, BorderLayout.CENTER);

		setSize(new Dimension(1000, 550));
		setVisible(true);
		getContentPane().setLayout(new BorderLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static String[] getAbteilungenHeaderData() {
		String[] listeAbteilungen_headerData = { "Abt.ID", "Name", "MitAnz", "Leiter" };
		return listeAbteilungen_headerData;
	}

	public static String[][] getAbteilungenTestData() {
		String[][] listeAbteilungen_TestData = { { "1", "HR", "12", "null" }, { "2", "IT", "5", "null" },
				{ "3", "Service", "7", "null" }, { "1", "HR", "12", "null" }, { "2", "IT", "5", "null" },
				{ "3", "Service", "7", "null" }, { "1", "HR", "12", "null" }, { "2", "IT", "5", "null" },
				{ "3", "Service", "7", "null" } };
		return listeAbteilungen_TestData;
	}

	public static String[] getMitarbeiterHeaderData() {
		String[] listeMitarbeiter_headerData = { "Mit.ID", "Name", "Gehalt", "Zulage", "Brutto", "Netto" };
		return listeMitarbeiter_headerData;
	}

	public static String[][] getMitarbeiterTestData() {
		String[][] listeMitarbeiter_TestData = { { "101", "David", "50", "200", "3550", "3350" },
				{ "102", "Nika", "60", "250", "3600", "3450" }, { "103", "Eva", "50", "2050", "3000", "3660" },
				{ "104", "Joanne", "50", "200", "3550", "3350" }, { "105", "Denis", "50", "200", "3550", "3350" },
				{ "101", "David", "50", "200", "3550", "3350" }, { "102", "Nika", "60", "250", "3600", "3450" },
				{ "103", "Eva", "50", "2050", "3000", "3660" }, { "104", "Joanne", "50", "200", "3550", "3350" },
				{ "105", "Denis", "50", "200", "3550", "3350" }, { "101", "David", "50", "200", "3550", "3350" },
				{ "102", "Nika", "60", "250", "3600", "3450" }, { "103", "Eva", "50", "2050", "3000", "3660" },
				{ "104", "Joanne", "50", "200", "3550", "3350" }, { "105", "Denis", "50", "200", "3550", "3350" },
				{ "101", "David", "50", "200", "3550", "3350" }, { "102", "Nika", "60", "250", "3600", "3450" },
				{ "103", "Eva", "50", "2050", "3000", "3660" }, { "104", "Joanne", "50", "200", "3550", "3350" },
				{ "105", "Denis", "50", "200", "3550", "3350" }, { "101", "David", "50", "200", "3550", "3350" },
				{ "102", "Nika", "60", "250", "3600", "3450" }, { "103", "Eva", "50", "2050", "3000", "3660" },
				{ "104", "Joanne", "50", "200", "3550", "3350" }, { "105", "Denis", "50", "200", "3550", "3350" },
				{ "101", "David", "50", "200", "3550", "3350" }, { "102", "Nika", "60", "250", "3600", "3450" },
				{ "103", "Eva", "50", "2050", "3000", "3660" }, { "104", "Joanne", "50", "200", "3550", "3350" },
				{ "105", "Denis", "50", "200", "3550", "3350" } };
		return listeMitarbeiter_TestData;
	}

	public static void main(String[] args) {
		new GUI();
	}
}
