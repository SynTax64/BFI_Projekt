package schachinger;

public class TestKlasse {

	public static void main(String[] args) {

	}

	public void init() {
		Mitarbeiter mitarbeiter_1 = new Angestellter(01, "Lisa Lachs", 3070, 24.50);
		Mitarbeiter mitarbeiter_2 = new Angestellter(02, "Karla Kranich", 3040, 24.07);
		Mitarbeiter mitarbeiter_3 = new Arbeiter(03, "Markus Mader", 17.94, 38., 62.24);
		Mitarbeiter mitarbeiter_4 = new Angestellter(04, "Sasan Scholle", 2970, 22.23);
		Mitarbeiter mitarbeiter_5 = new Arbeiter(05, "Hanelore Hase", 14.80, 25., 57.63);
		Mitarbeiter mitarbeiter_6 = new Arbeiter(06, "Tim Tauberich", 14.80, 12., 57.63);
		Mitarbeiter mitarbeiter_7 = new Arbeiter(07, "Gustav Gans", 14.80, 38., 57.63);
		Mitarbeiter mitarbeiter_8 = new Angestellter(8, "Noelani Nashorn", 2760, 20.70);
		Mitarbeiter mitarbeiter_9 = new Angestellter(9, "Anouk Adler", 2180, 14.50);
		Mitarbeiter mitarbeiter_10 = new Angestellter(10, "Paul Panda", 2180, 14.50);
		Mitarbeiter mitarbeiter_11 = new Arbeiter(11, "Ida Igelein", 14.80, 40., 57.630);
		Mitarbeiter mitarbeiter_12 = new Arbeiter(12, "Ruby Rotfuchs", 10.80, 15., 57.63);

		Mitarbeiter[] mitarbeiter_liste = new Mitarbeiter[12];

		mitarbeiter_liste[0] = mitarbeiter_1;
		mitarbeiter_liste[1] = mitarbeiter_2;
		mitarbeiter_liste[2] = mitarbeiter_3;
		mitarbeiter_liste[3] = mitarbeiter_4;
		mitarbeiter_liste[4] = mitarbeiter_5;
		mitarbeiter_liste[5] = mitarbeiter_6;
		mitarbeiter_liste[6] = mitarbeiter_7;
		mitarbeiter_liste[7] = mitarbeiter_8;
		mitarbeiter_liste[8] = mitarbeiter_9;
		mitarbeiter_liste[9] = mitarbeiter_10;
		mitarbeiter_liste[10] = mitarbeiter_11;
		mitarbeiter_liste[11] = mitarbeiter_12;

	}

	public void ausgabeMitarbeiterliste(Mitarbeiter[] mitarbeiter_liste) {
		System.out.println("Mitarbeiterliste:");
		for (int i = 0; i < mitarbeiter_liste.length; i++) {
			System.out.println(mitarbeiter_liste[i]);
		}
	}

	public int getAnzAngestellterGesamt(Mitarbeiter[] mitarbeiter_liste) {
		int anz = 0;
		for (int i = 0; i < mitarbeiter_liste.length; i++) {
			if (mitarbeiter_liste[i] instanceof Angestellter)
				anz++;
		}

		return anz;
	}

	public int getAnzArbeiterGesamt(Mitarbeiter[] mitarbeiter_liste) {
		int anz = 0;
		for (int i = 0; i < mitarbeiter_liste.length; i++) {
			if (mitarbeiter_liste[i] instanceof Arbeiter)
				anz++;
		}

		return anz;
	}

}
