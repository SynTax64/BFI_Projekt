package aster;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestKlasse {
	Mitarbeiter[] mitarbeiter_liste = new Mitarbeiter[Mitarbeiter.SIZE];

	public static void main(String[] args) {
		TestKlasse tk = new TestKlasse();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		boolean beenden = false;
		while (!beenden) {
			tk.printMenu();
			System.out.print("Wählen Sie bitte eine Auswahl aus: ");
			int auswahl = 0;
			try {
				auswahl = reader.read();
				switch (auswahl) {
				case 1:
					tk.ausgabe(tk.mitarbeiter_liste);
					break;
				case 2:
					boolean sBeenden = false;
					while (!sBeenden) {
						System.out.print("Geben Sie bitte ID ein: ");
						try {
							int mSuche = reader.read();
							Mitarbeiter sMitarbeiter = tk.suche(mSuche);
							if (sMitarbeiter != null) {
								System.out.printf("Mitarbeiter mit ID %d wurde gerfunden!\n", mSuche);
								System.out.println(sMitarbeiter);
							} else {
								System.out.printf("Mitarbeiter mit ID %d wurde nicht gerfunden!", mSuche);
							}
							sBeenden = true;
						} catch (IOException e) {
							System.out.println("Sie müssen einen numerischen Wert eingeben!");
							continue;
						}
					}
					break;
				case 3:
					System.out.printf("Die Anzahl der Angelstellter: %d", tk.getAnzAngestellterGesamt());
					break;
				case 4:
					System.out.printf("Die Anzahl der Arbeiter: %d", tk.getAnzArbeiterGesamt());
					break;
				case 5:
					beenden = true;
					break;
				default:
					System.out.println("Sie müssen eine Auswahl zwischen 1 - 5 eingeben");
					boolean aBeenden = false;
					while (!aBeenden) {
						System.out.println("Wollen Sie beenden: (Y/N)");
						try {
							char sAuswahl = reader.readLine().charAt(0);
							if (sAuswahl == 'Y' || sAuswahl == 'y') {
								aBeenden = beenden = true;
							} else if (sAuswahl == 'N' || sAuswahl == 'n') {
								aBeenden = true;
							} else {
								System.out.println("Sie müssen mit \"Y\" oder \"N\"");
							}

						} catch (IOException e) {
							System.out.println("Etwas ist schief gegangen!");
							continue;
						}
					}
				}
			} catch (IOException e) {
				System.out.print("Sie müssen einen numerischen Wert eingeben: ");
				continue;
			}

		}
		try {
			reader.close();
		} catch (IOException e) {
			System.out.println("Buffered Read wurde nicht korrekt geschlossen");
			e.printStackTrace();
		}
	}

	// die Methode initialisiert die Testwerte in der Mitarbeiterliste
	public void init() {
		mitarbeiter_liste[0] = new Angestellter(101, "David", 2500, 400);
		mitarbeiter_liste[1] = new Angestellter(102, "Bojan", 3200, 800);
		mitarbeiter_liste[2] = new Angestellter(103, "Nika", 2900, 350);
		mitarbeiter_liste[3] = new Angestellter(104, "Joanne", 3100, 360);
		mitarbeiter_liste[4] = new Angestellter(105, "Ferius", 2360, 220);
		mitarbeiter_liste[5] = new Angestellter(106, "Demi", 2600, 500);
		mitarbeiter_liste[6] = new Arbeiter(201, "Domen", 1700, 168, 100);
		mitarbeiter_liste[7] = new Arbeiter(202, "Vasja", 1900, 174, 50);
		mitarbeiter_liste[8] = new Arbeiter(203, "Franc", 1500, 170, 200);
		mitarbeiter_liste[9] = new Arbeiter(204, "Stefan", 1200, 120, 80);
		mitarbeiter_liste[10] = new Arbeiter(205, "Herbert", 1680, 169, 90);
		mitarbeiter_liste[11] = new Arbeiter(206, "Dane", 2000, 165, 150);
	}

	// die Methode gibt das Menu der Applikation aus
	public void printMenu() {
		System.out.println("*****  Firma KiSaHo  ******");
		System.out.println("1. Print alle Mitarbeiter");
		System.out.println("2.Suche Mitarbeiter nach ID");
		System.out.println("3. Anzahl des Angelstellter");
		System.out.println("4. Anzahl des Arbeiter");
		System.out.println("5. Beenden");
		System.out.println("***************************");
	}

	// die Methode gibt ein Objekttype Mitarbeiter aus, falls es nicht gefunden
	// wird, gibt es den Wert null
	// zurück
	public Mitarbeiter suche(int id) {
		return ((isMitarbeiterIn(id) ? mitarbeiter_liste[getIndexVonMitarbeiter(id)] : null));
	}

	// die Methode überpruft, ob ein Mitarbeiter mit einer bestimmten ID besteht,
	// und gibt einen logischen Wert zurück
	public boolean isMitarbeiterIn(int id) {
		for (int i = 0; i < mitarbeiter_liste.length; i++) {
			if (id == mitarbeiter_liste[i].getId()) {
				return true;
			}
		}
		return false;
	}

	// die Methode gibt den Index des Mitarbeitobjektes zurück, falls es besteht
	public int getIndexVonMitarbeiter(int id) {
		for (int i = 0; i < mitarbeiter_liste.length; i++) {
			if (id == mitarbeiter_liste[i].getId()) {
				return i;
			}
		}
		return -1;
	}

	// die Methode gibt den Inhalt des Mitarbeiterobjektes aus
	public void ausgabe(Mitarbeiter mitarbeiter) {
		System.out.println(mitarbeiter);
	}

	// die Methode gibt den Inhalt aller Mitarbeiterobjekte aus
	public void ausgabe(Mitarbeiter[] mitarbeiters) {
		for (Mitarbeiter mitarbeiter : mitarbeiters) {
			System.out.println(mitarbeiter);
		}
	}

	// die Methode gibt die Anzahl der Angestellten aus der Mitarbeiterliste aus
	public int getAnzAngestellterGesamt() {
		int anz_angestellter = 0;
		for (int i = 0; i < mitarbeiter_liste.length; i++) {
			if (mitarbeiter_liste[i] instanceof Angestellter) {
				anz_angestellter++;
			}
		}
		return anz_angestellter;
	}

	// die Methode gibt die Anzahl der Arbeiter aus der Mitarbeiterliste aus
	public int getAnzArbeiterGesamt() {
		int anz_arbeiter = 0;
		for (int i = 0; i < mitarbeiter_liste.length; i++) {
			if (mitarbeiter_liste[i] instanceof Arbeiter) {
				anz_arbeiter++;
			}
		}
		return anz_arbeiter;
	}
}
