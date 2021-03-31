package aster;

import java.util.Random;

public class Verwaltung {

	public static final int TAX_ANG = 20;
	public static final int TAX_ARB = 20;

	public static void main(String[] args) {
		Mitarbeiter[] mitarbeiter_liste = new Mitarbeiter[Mitarbeiter.SIZE];
		mitarbeiter_liste = init();

		System.out.println("Die Gehaltsumme aller Mitarbeiter: " + berechneSummeAlleGehaelter(mitarbeiter_liste));
		ausgabe(mitarbeiter_liste);

	}

	// die Methode initialisiert die Testwerte in der Mitarbeiterliste
	public static Mitarbeiter[] init() {
		Mitarbeiter[] mitarbeiter = new Mitarbeiter[Mitarbeiter.SIZE];
		String[] namen = new String[] { "David", "Bojan", "Nika", "Joanne", "Ferius", "Demi", "Domen", "Vasja", "Franc",
				"Stefan", "Herbert", "Dane" };
		Random rnd = new Random();
		int idAngestellter = 100;
		int idArbeiter = 500;

		for (int i = 0; i < mitarbeiter.length; i++) {
			if (i < mitarbeiter.length / 2) {
				// zufällig generiertes Gehalt (zwischen 1900 - 2500)
				int randomGrundGehalt = 1900 + (int) (Math.random() * (2500 - 1900));
				// zufällig generierte Zulage (zwischen 100 - 300)
				int randomZulage = 100 + (int) (Math.random() * (300 - 100));
				// zufällig generierter Ortszuschlag
				int ortszuschlag = 0 + (int) (Math.random() * (120 - 0));
				mitarbeiter[i] = new Angestellter(++idAngestellter, namen[i], randomGrundGehalt, ortszuschlag,
						randomZulage);
			} else {
				// zufällig generiertes Lohn (zwischen 12 - 18)
				int randomStundenLohn = 12 + (int) (Math.random() * (18 - 12));
				// zufällig generierte Arbeitsstunden (zwischen 160 - 174)
				int randomAnzahlStunden = 160 + (int) (Math.random() * (174 - 160));
				// zufällig generierter Ortszuschlag( zwischen 0 - 120)
				int ortszuschlag = 0 + (int) (Math.random() * (120 - 0));
				// zufällig generierte Zulage (zwischen 50 - 200)
				int randomSchichtZulage = 50 + (int) (Math.random() * (200 - 50));
				mitarbeiter[i] = new Arbeiter(++idArbeiter, namen[i], randomStundenLohn, randomAnzahlStunden,
						ortszuschlag, randomSchichtZulage);
			}
		}
		return mitarbeiter;
	}

	// die Methode gibt ein Objekttype Mitarbeiter aus, falls es nicht gefunden
	// wird, gibt es den Wert null zurück
	public static Mitarbeiter suche(Mitarbeiter[] mitarbeiter, int id) {
		return ((isMitarbeiterIn(mitarbeiter, id) ? mitarbeiter[getIndexVonMitarbeiter(mitarbeiter, id)] : null));
	}

	// die Methode überpruft, ob ein Mitarbeiter mit einer bestimmten ID besteht,
	// und gibt einen logischen Wert zurück
	public static boolean isMitarbeiterIn(Mitarbeiter[] mitarbeiter, int id) {
		for (int i = 0; i < mitarbeiter.length; i++) {
			if (id == mitarbeiter[i].getId()) {
				return true;
			}
		}
		return false;
	}

	// die Methode gibt den Index des Mitarbeitobjektes zurück, falls es besteht,
	// falls nicht gibt den Wert -1 zurück
	public static int getIndexVonMitarbeiter(Mitarbeiter[] mitarbeiter, int id) {
		for (int i = 0; i < mitarbeiter.length; i++) {
			if (id == mitarbeiter[i].getId()) {
				return i;
			}
		}
		return -1;
	}

	// die Methode gibt den Inhalt des Mitarbeiterobjektes aus
	public static void ausgabe(Mitarbeiter mitarbeiter) {
		System.out.println(mitarbeiter + ", Netto= " + berechneNettoGehalt(mitarbeiter));
	}

	// die Methode gibt den Inhalt aller Mitarbeiterobjekte aus
	public static void ausgabe(Mitarbeiter[] mitarbeiters) {
		for (Mitarbeiter mitarbeiter : mitarbeiters) {
			ausgabe(mitarbeiter);
		}
	}

	// die Methode gibt die Anzahl der Angestellten aus der Mitarbeiterliste aus
	public static int getAnzAngestellterGesamt(Mitarbeiter[] mitarbeiter) {
		int anz_angestellter = 0;
		for (int i = 0; i < mitarbeiter.length; i++) {
			if (mitarbeiter[i] instanceof Angestellter) {
				anz_angestellter++;
			}
		}
		return anz_angestellter;
	}

	// die Methode gibt die Anzahl der Arbeiter aus der Mitarbeiterliste aus
	public static int getAnzArbeiterGesamt(Mitarbeiter[] mitarbeiter) {
		int anz_arbeiter = 0;
		for (int i = 0; i < mitarbeiter.length; i++) {
			if (mitarbeiter[i] instanceof Arbeiter) {
				anz_arbeiter++;
			}
		}
		return anz_arbeiter;
	}

	public static double berechneSummeAlleGehaelter(Mitarbeiter[] mitarbeiters) {
		double summe = 0;
		for (Mitarbeiter mitarbeiter : mitarbeiters) {
			summe += mitarbeiter.berechneBrutto();
		}
		return summe;
	}

	public static double berechneNettoGehalt(Mitarbeiter mitarbeiter) {
		double netto = 0;
		if (mitarbeiter instanceof Angestellter) {
			netto = mitarbeiter.berechneBrutto() - ((mitarbeiter.berechneBrutto() / 100) * Verwaltung.TAX_ANG);

		} else if (mitarbeiter instanceof Arbeiter) {

			netto = mitarbeiter.berechneBrutto() - ((mitarbeiter.berechneBrutto() / 100) * Verwaltung.TAX_ARB);
		}
		return netto;
	}
}
