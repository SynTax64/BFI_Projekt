package aster.Controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import aster.model.Abteilung;
import aster.model.Angestellter;
import aster.model.Arbeiter;
import aster.model.Firma;
import aster.model.Mitarbeiter;
import aster.utility.Utility;
import aster.view.GUI;

public class Verwaltung implements Utility, Serializable {

	private static final long serialVersionUID = 7915345725448136676L;

	final public List<Mitarbeiter> mitarbeiter_Liste;
	final public List<Abteilung> abteilungen_Liste;
	Firma firma;

	public static void main(String[] args) {

		Verwaltung verwaltung = new Verwaltung();
		// die Datenausgabe der ganzen Firma und zwar alle Abteilungen und alle
		// Mitarbeiter, die der bestimmten Abteilung angeh�ren
		System.out.println(verwaltung.firma);
//		System.out.println("-------------------------------");
		// die Ausgabe, die den Wert aller Bruttog�halter zur�ckgibt
//		System.out.println("Brutto Gehalt alle Mitarbeiter: "
//				+ verwaltung.berechneSummeAlleGehaelter(verwaltung.getMitarbeiter_Liste()) + " EUR");
//		System.out.println("-------------------------------");
		// die Methode "sortMitarbeiterNachGehalt" sortiert alle Mitarbeiter aus der
		// Mitarbeiterliste nach Bruttogeh�lter der Mitarbeiter
//		verwaltung.sortMitarbeiterNachGehalt();
//		verwaltung.ausgabe(verwaltung.getMitarbeiter_Liste());
//		System.out.println("-------------------------------");
		// die Methode "sortMitarbeiterNachNamen" sortiert alle Mitarbeiter aus der
		// Mitarbeiterliste nach Namen der Mitarbeiter
//		verwaltung.sortMitarbeiterNachNamen();
//		verwaltung.ausgabe(verwaltung.getMitarbeiter_Liste());
		new GUI();

	}

	public Verwaltung() {
		mitarbeiter_Liste = new ArrayList<Mitarbeiter>();
		abteilungen_Liste = new ArrayList<Abteilung>();
		this.init();
		this.firma = new Firma(mitarbeiter_Liste, abteilungen_Liste);
	}

	// die Methode initialisiert die Testwerte in der Mitarbeiterliste
	public void init() {
		String[] namen = new String[] { "David", "Bojan", "Nika", "Joanne", "Ferius", "Demi", "Domen", "Vasja", "Franc",
				"Stefan", "Herbert", "Dane" };
		Random rnd = new Random();
		int idMitarbeiter = 1;

		for (int i = 0; i < namen.length; i++) {
			if (i < namen.length / 2) {
				// zuf�llig generiertes Gehalt (zwischen 1900 - 2500)
				int randomGrundGehalt = 1900 + (int) (Math.random() * (2500 - 1900));
				// zuf�llig generierte Zulage (zwischen 100 - 300)
				int randomZulage = 100 + (int) (Math.random() * (300 - 100));
				// zuf�llig generierter Ortszuschlag
				int ortszuschlag = 0 + (int) (Math.random() * (120 - 0));
				mitarbeiter_Liste.add(
						new Angestellter(idMitarbeiter++, namen[i], randomGrundGehalt, ortszuschlag, randomZulage));
			} else {
				// zuf�llig generiertes Lohn per Stunde (zwischen 12 - 18)
				int randomStundenLohn = 12 + (int) (Math.random() * (18 - 12));
				// zuf�llig generierte Arbeitsstunden (zwischen 160 - 174)
				int randomAnzahlStunden = 160 + (int) (Math.random() * (174 - 160));
				// zuf�llig generierter Ortszuschlag( zwischen 0 - 120)
				int ortszuschlag = 0 + (int) (Math.random() * (120 - 0));
				// zuf�llig generierte Zulage (zwischen 50 - 200)
				int randomSchichtZulage = 50 + (int) (Math.random() * (200 - 50));
				mitarbeiter_Liste.add(new Arbeiter(idMitarbeiter++, namen[i], randomStundenLohn, randomAnzahlStunden,
						ortszuschlag, randomSchichtZulage));
			}
		}

		// die Initialisierung der Mitarbeiter mit ID (1, 6, 7, 8) in die Abteilung PR.
		ArrayList<Mitarbeiter> mitarbeiterInAbteilung_PR = new ArrayList<Mitarbeiter>();
		mitarbeiterInAbteilung_PR.add(mitarbeiter_Liste.get(0));
		mitarbeiterInAbteilung_PR.add(mitarbeiter_Liste.get(5));
		mitarbeiterInAbteilung_PR.add(mitarbeiter_Liste.get(6));
		mitarbeiterInAbteilung_PR.add(mitarbeiter_Liste.get(7));
		abteilungen_Liste.add(new Abteilung(1, Utility.ABTEILUNG_PR, mitarbeiterInAbteilung_PR));

		// die Initialisierung der Mitarbeiter mit ID (2, 3, 9, 10, 11) in die Abteilung
		// SALES
		ArrayList<Mitarbeiter> mitarbeiterInAbteilung_SALES = new ArrayList<Mitarbeiter>();
		mitarbeiterInAbteilung_SALES.add(mitarbeiter_Liste.get(1));
		mitarbeiterInAbteilung_SALES.add(mitarbeiter_Liste.get(2));
		mitarbeiterInAbteilung_SALES.add(mitarbeiter_Liste.get(8));
		mitarbeiterInAbteilung_SALES.add(mitarbeiter_Liste.get(9));
		mitarbeiterInAbteilung_SALES.add(mitarbeiter_Liste.get(10));
		abteilungen_Liste.add(new Abteilung(2, Utility.ABTEILUNG_SALES, mitarbeiterInAbteilung_SALES));

		// die Initialisierung der Mitarbeiter mit ID (5, 6, 12) in die Abteilung IT.
		ArrayList<Mitarbeiter> mitarbeiterInAbteilung_IT = new ArrayList<Mitarbeiter>();
		mitarbeiterInAbteilung_IT.add(mitarbeiter_Liste.get(4));
		mitarbeiterInAbteilung_IT.add(mitarbeiter_Liste.get(5));
		mitarbeiterInAbteilung_IT.add(mitarbeiter_Liste.get(11));
		abteilungen_Liste.add(new Abteilung(3, Utility.ABTEILUNG_IT, mitarbeiterInAbteilung_IT));

		// die Initialisierung der Mitarbeiter mit ID (4) in die Abteilung HR.
		ArrayList<Mitarbeiter> mitarbeiterInAbteilung_HR = new ArrayList<Mitarbeiter>();
		mitarbeiterInAbteilung_HR.add(mitarbeiter_Liste.get(3));
		abteilungen_Liste.add(new Abteilung(4, Utility.ABTEILUNG_HR, mitarbeiterInAbteilung_HR));
	}

	public void createFile() {

	}

	public void deleteFileIfExist() {

	}

	public void serialize() {

	}

	public void deserialize() {

	}

	public String getAngestellterNamen() {
		return "";
	}

	public void writeName() {

	}

	public void readName() {

	}

	public void sortAndSerialize() {

	}

	public Abteilung getMostWorker(Abteilung[] abteilungen) {
		return new Abteilung();
	}

	// die Methode gibt ein Objekttype Mitarbeiter aus, falls es nicht gefunden
	// wird, gibt es den Wert null zur�ck
	public Mitarbeiter searchMitarbeiterInFirma(ArrayList<Mitarbeiter> mitarbeiter, int id) {
		return ((isMitarbeiterIn(mitarbeiter, id) ? mitarbeiter.get(getIndexVonMitarbeiter(mitarbeiter, id)) : null));
	}

	// die Methode �berpruft, ob ein Mitarbeiter mit einer bestimmten ID besteht,
	// und gibt einen logischen Wert zur�ck
	public boolean isMitarbeiterIn(ArrayList<Mitarbeiter> mitarbeiter, int id) {
		for (int i = 0; i < mitarbeiter.size(); i++) {
			if (id == mitarbeiter.get(i).getId()) {
				return true;
			}
		}
		return false;
	}

	// die Methode gibt den Index des Mitarbeitobjektes zur�ck, falls es besteht,
	// falls nicht gibt es den Wert -1 zur�ck
	public int getIndexVonMitarbeiter(ArrayList<Mitarbeiter> mitarbeiter, int id) {
		for (int i = 0; i < mitarbeiter.size(); i++) {
			if (id == mitarbeiter.get(i).getId()) {
				return i;
			}
		}
		return -1;
	}

	// die Methode gibt den Inhalt des Mitarbeiterobjektes mit einem dazugeh�rigen
	// Nettogehalt aus
	public void ausgabe(Mitarbeiter mitarbeiter) {
		System.out.println(mitarbeiter + ", Netto= " + berechneNettoGehalt(mitarbeiter));
	}

	// die Methode gibt den Inhalt aller Mitarbeiterobjekte aus
	public void ausgabe(ArrayList<Mitarbeiter> mitarbeiters) {
		for (Mitarbeiter mitarbeiter : mitarbeiters) {
			ausgabe(mitarbeiter);
		}
	}

	// die Methode gibt die Anzahl der Angestellten aus der Mitarbeiterliste aus
	public int getAnzAngestellterGesamt(ArrayList<Mitarbeiter> mitarbeiter) {
		int anz_angestellter = 0;
		for (int i = 0; i < mitarbeiter.size(); i++) {
			if (mitarbeiter.get(i) instanceof Angestellter) {
				anz_angestellter++;
			}
		}
		return anz_angestellter;
	}

	// die Methode gibt die Anzahl der Arbeiter aus der Mitarbeiterliste aus
	public int getAnzArbeiterGesamt(ArrayList<Mitarbeiter> mitarbeiter) {
		int anz_arbeiter = 0;
		for (int i = 0; i < mitarbeiter.size(); i++) {
			if (mitarbeiter.get(i) instanceof Arbeiter) {
				anz_arbeiter++;
			}
		}
		return anz_arbeiter;
	}

	// berechnet die Bruttosumme aller Mitarbeiter
	public double berechneSummeAlleGehaelter(List<Mitarbeiter> list) {
		double summe = 0;
		for (Mitarbeiter mitarbeiter : list) {
			summe += mitarbeiter.berechneBrutto();
		}
		return summe;
	}

	// berechnet das Nettogehalt eines Mitarbeiters
	public double berechneNettoGehalt(Mitarbeiter mitarbeiter) {
		double netto = 0;
		if (mitarbeiter instanceof Angestellter) {
			netto = mitarbeiter.berechneBrutto() - ((mitarbeiter.berechneBrutto() / 100) * Utility.TAX_ANG);

		} else if (mitarbeiter instanceof Arbeiter) {

			netto = mitarbeiter.berechneBrutto() - ((mitarbeiter.berechneBrutto() / 100) * Utility.TAX_ARB);
		}
		return netto;
	}

	// die Ausgabe aller Abteilungen
	public ArrayList<Abteilung> ausgabe_AlleAbteilungen(ArrayList<Abteilung> abteilungen) {
		for (int i = 0; i < abteilungen.size(); i++) {
			System.out.println(abteilungen.get(i));
		}
		return abteilungen;
	}

	// gibt einen logischen Wert aus, wenn eine Abteilung mit einem bestimmten ID
	// besteht oder nicht
	public boolean searchAbteilung(ArrayList<Abteilung> abteilungen, int id) {
		for (int i = 0; i < abteilungen.size(); i++) {
			if (abteilungen.get(i).getId() == id) {
				return true;
			}
		}
		return false;
	}

	// die Methode gibt die Arrayliste der Mitarbeiter in einer bestimmten Abteilung
	// aus
	public ArrayList<Mitarbeiter> getMitarbeiterListeVonAbteilung(ArrayList<Abteilung> abteilungen, int abt_id) {
		if (searchAbteilung(abteilungen, abt_id)) {
			for (int l = 0; l < abteilungen.size(); l++) {
				if (abteilungen.get(l).getId() == abt_id) {
					return abteilungen.get(l).getMitarbeiter_liste();
				}
			}
		}
		return null;
	}

// die Methode sucht nach einem Mitarbeiter aus allen Abteilungen, wenn er besteht, dann gibt das Mitarbeiterobjekt zur�ck
	public Mitarbeiter searchMitarbeiterAusAlleAbteilungen(ArrayList<Abteilung> abteilungen, int mitarbeiter_id) {
		for (Abteilung abteilung : abteilungen) {
			for (Mitarbeiter mitarbeiter : abteilung.getMitarbeiter_liste()) {
				if (mitarbeiter.getId() == mitarbeiter_id) {
					return mitarbeiter;
				}
			}
		}
		return null;
	}

	// die Methode macht eine Sortierung der Mitarbeiter nach Namen
	public void sortMitarbeiterNachNamen() {

		Collections.sort(mitarbeiter_Liste, new Comparator<Mitarbeiter>() {

			@Override
			public int compare(Mitarbeiter o1, Mitarbeiter o2) {
				return o1.getName().compareToIgnoreCase(o2.getName());
			}
		});
	}

	// die Methode macht eine Sortierung der Mitarbeiter nach BruttoGehalt
	public void sortMitarbeiterNachGehalt() {

		Collections.sort(mitarbeiter_Liste, new Comparator<Mitarbeiter>() {

			@Override
			public int compare(Mitarbeiter o1, Mitarbeiter o2) {
				return Double.compare(o1.berechneBrutto(), o2.berechneBrutto());
			}
		});
	}
}