package kassoume;

//import java.util.ArrayList;
import java.util.Arrays;
//import java.util.List;

public class Verwaltung {
	
	static //static ArrayList<Mitarbeiter> mitarbeiter;
	//static ArrayList<Angestellter> angestellter;
	
	Mitarbeiter[] mitarbeiter_liste = new Mitarbeiter[12];
	
	
		/* xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
		List<String> mitarbeiter_liste = new ArrayList<>(6); 
		
		mitarbeiter.add(0, "Hans Crocodil");
		mitarbeiter.add(1, "Helmut Schmidt");
		mitarbeiter.add(3, "Lucida Esperanto");
		mitarbeiter.add(4, null);
		mitarbeiter.add(5, "Zuza Maccaroni");
		
		List<String> angestellter = new ArrayList<>(6); 
			
		angestellter.add(6, "Peter Schnitzel");
		angestellter.add("Fero Novomatic");
		angestellter.add(8, "Jana Halabala");
		angestellter.add(9, "Monika Harmonika");
		angestellter.add(10, " ");
		angestellter.add(11, "Hello Kitty"); */
		
		/*
		for (int i = 0;i<mitarbeiter.size();i++){
		    System.out.println(mitarbeiter.get(i));
		}
		ausgabe(mitarbeiter ); */
	
	/*
	@Override
	public String toString() {
		return "Verwaltung [mitarbeiter=" + mitarbeiter + ", angestellter=" + angestellter + "]";
	} xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx */

	

	public static void main(String[] args) {

		
			System.out.println(mitarbeiter_liste[3]);
			System.out.println(" Suche nach Mitarbeiter: " + mitarbeiter_liste.length );
			System.out.println(Arrays.toString(mitarbeiter_liste));
	

			// Initialisierung der Mitarbeiter
			Mitarbeiter[] mitarbeiter = init(); {

			Mitarbeiter[] mitarbeiter_liste = new Mitarbeiter[12];
			for (int i = 0; i < mitarbeiter_liste.length; i++) {
			}
		
			mitarbeiter_liste[0] = new Angestellter(1, "Ilja", 3000, 300);
			mitarbeiter_liste[1] = new Angestellter(2, "Peter", 3800, 260);
			mitarbeiter_liste[2] = new Angestellter(103, "Sasha", 3500, 380);
			mitarbeiter_liste[3] = new Angestellter(104, "Monika", 4000, 450);
			mitarbeiter_liste[4] = new Angestellter(105, "Daniel", 3500, 350);
			mitarbeiter_liste[5] = new Angestellter(106, "Zita", 3400, 290);
			mitarbeiter_liste[6] = new Arbeiter(201, "Edo", 4400, 570, 200);
			mitarbeiter_liste[7] = new Arbeiter(202, "Maya", 4100, 480, 180);
			mitarbeiter_liste[8] = new Arbeiter(202, "Fero", 3900, 460, 190);
			mitarbeiter_liste[9] = new Arbeiter(203, "Gerhard", 4400, 350, 200);
			mitarbeiter_liste[10] = new Arbeiter(204, "Rudolf", 3700, 430, 180);
			mitarbeiter_liste[11] = new Arbeiter(205, "Christa", 4400,390, 190);		
			}
	}
	
	private static Mitarbeiter[] init() {
		for (int i = 0; i < mitarbeiter_liste.length; i++) {
			if (mitarbeiter_liste != null) {	
			}
		}
			return ( mitarbeiter_liste);
	}
	

	// Ausgabe auf der Konsole ( im Terminal )
	
	public void ausgabe(Mitarbeiter mitarbeiter_liste) {
		System.out.println(mitarbeiter_liste);
	}
	
	public void ausgabe(Mitarbeiter[] mitarbeiters) {
		for (Mitarbeiter mitarbeiter : mitarbeiters) {
			System.out.println(mitarbeiter);
		}
	}
	// end ?????????????????????????????????????????????????????????????????????
	
	
	// Suche nach einem Mitarbeiter 
	public Mitarbeiter suche(int id) {
		return ((isMitarbeiterIn(id) ? mitarbeiter_liste[getIndexVonMitarbeiter(id)] : null));
	}
	// end ---------------------------------------------------------------------
	

	// alle id von Mitarbeitern, die in der mitarbeiter_liste sind
	private boolean isMitarbeiterIn(int id) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < mitarbeiter_liste.length; i++) {
			if (id == mitarbeiter_liste[i].getId()) {
				return true;
			}
		}
		return false;
	}
	// end ---------------------------------------------------------------------
	

	// Position der Mitarbeiter im Array
	private int getIndexVonMitarbeiter(int id) {
		
		// TODO Auto-generated method stub
		for (int i = 0; i < mitarbeiter_liste.length; i++) {
			if (id == mitarbeiter_liste[i].getId()) {
				return i;
			}
		}
		return 0;
	}
	// end ----------------------------------------------------------------------
	
	
	// Anzahl der Angetellten
	public int getAnzAngestellterGesamt() {
		int anz_angestellter = 0;
		for (int i = 0; i < mitarbeiter_liste.length; i++) {
			if (mitarbeiter_liste[i] instanceof Angestellter) {
				anz_angestellter++;
			}
		}
		return anz_angestellter;
	}
	// end -----------------------------------------------------------------------
	
	
	// Anzahl der Arbeiter
	public int getAnzArbeiterGesamt() {
		int anz_arbeiter = 0;
		for (int i = 0; i < mitarbeiter_liste.length; i++) {
			if (mitarbeiter_liste[i] instanceof Arbeiter) {
				anz_arbeiter++;
			}
		}
		return anz_arbeiter;
	} 
	// end -------------------------------------------------------------------------

	
	@Override
	public String toString() {
		return "Verwaltung [mitarbeiter_liste=" + Arrays.toString(mitarbeiter_liste) 
		+ ", getAnzAngestellterGesamt()=" + getAnzAngestellterGesamt() 
		+ ", getAnzArbeiterGesamt()=" + getAnzArbeiterGesamt() + "]";
	}
	
	public Verwaltung ausgabe() {
		return this;
		
	
	}

}
