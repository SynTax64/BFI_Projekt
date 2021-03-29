package demir;

public class TestKlasse {

	public static void main(String[] args) {
		ausgabe(14);

	}

	static Mitarbeiter[] mitarbeiter_liste = new Mitarbeiter[12];

	void init() {

		mitarbeiter_liste[0] = new Angestellter(1, "Markus", 1_381, 212);
		mitarbeiter_liste[1] = new Angestellter(2, "Anna", 1_424, 189);
		mitarbeiter_liste[2] = new Angestellter(3, "Sofia", 1_356, 173);
		mitarbeiter_liste[3] = new Angestellter(4, "Ali", 1_511, 139);
		mitarbeiter_liste[4] = new Angestellter(5, "Eva", 1_408, 224);
		mitarbeiter_liste[5] = new Angestellter(6, "David", 1_317, 251);
		mitarbeiter_liste[6] = new Arbeiter(7, "Tim", 8.5, 166, 134);
		mitarbeiter_liste[7] = new Arbeiter(8, "Lisa", 7.7, 172, 198);
		mitarbeiter_liste[8] = new Arbeiter(9, "Richard", 7_7, 97, 219);
		mitarbeiter_liste[9] = new Arbeiter(10, "Adam", 8_1, 180, 231);
		mitarbeiter_liste[10] = new Arbeiter(11, "Michael", 8.5, 101, 257);
		mitarbeiter_liste[11] = new Arbeiter(12, "Maria", 8_1, 79, 236);

	}
	
	public static boolean searchMitarbeiterId(int searchId) {
		for (int i = 0; i < mitarbeiter_liste.length; i++) {
			if (mitarbeiter_liste[i].getId() == searchId)
				return true;			
		} return false;
	}

	
	public static void ausgabe(int id) {
		
			System.out.println("Die Zahl " + id +" ist vorhanden und sie ist auf dem Index " + ".");
		
	}

}
