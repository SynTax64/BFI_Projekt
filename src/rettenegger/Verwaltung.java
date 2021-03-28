package rettenegger;

public class Verwaltung {

	public static void main(String[] args) {
		
		Mitarbeiter[] meine_mitarbeiter = init();
		
//		System.out.println("Liste "+meine_mitarbeiter.length+" Personen");
//		
//		Mitarbeiter einMa=suche(4,meine_mitarbeiter);
//		einMa.ausgabe();
//		
//		ausgabe(einMa);
//		
//		
//		
		System.out.println("Arbeiter Anz="+ getAnzArbeiterGesamt(meine_mitarbeiter));
		System.out.println("Angestellte Anz="+getAnzAngestellterGesamt(meine_mitarbeiter));
		System.out.println("--------Personal----------");
		ausgabe(meine_mitarbeiter);
	}
	
	
	
	public static Mitarbeiter[] init() {
		
		Mitarbeiter[] mitarbeiter_liste = new Mitarbeiter[12];
		
		mitarbeiter_liste[0]=new Arbeiter(1,"Alex", 12.5, 40, 1.5);
		mitarbeiter_liste[1]=new Arbeiter(2,"Bert", 9.4, 38, 1.5);
		mitarbeiter_liste[2]=new Arbeiter(3,"Caro", 10, 38, 1.5);
		mitarbeiter_liste[3]=new Arbeiter(4,"Dani", 12.5, 38, 1.5);
		mitarbeiter_liste[4]=new Arbeiter(5,"Erna", 9.4, 40, 1.5);
		mitarbeiter_liste[5]=new Arbeiter(6,"Fritz", 8.5, 25, 1.5);
		
		mitarbeiter_liste[6]=new Angestellter(7,"Antonio", 2400, 100);
		mitarbeiter_liste[7]=new Angestellter(8,"Maria", 2500, 150);
		mitarbeiter_liste[8]=new Angestellter(9,"Elvis", 2400, 100);
		mitarbeiter_liste[9]=new Angestellter(10,"Julius", 2400, 100);
		mitarbeiter_liste[10]=new Angestellter(11,"Emma", 2400, 100);
		mitarbeiter_liste[11]=new Angestellter(12,"Sarah", 2400, 100);
		
		return mitarbeiter_liste;
	}

	
	
	public static int getAnzAngestellterGesamt(Mitarbeiter[] ma_liste) {
		int anz=0;
		for (Mitarbeiter m : ma_liste) {
			if (m instanceof Angestellter) {
				anz++;
			}
		}
		return anz;
	}
	
	public static int getAnzArbeiterGesamt(Mitarbeiter[] ma_liste) {
		int anz=0;
		for (Mitarbeiter m : ma_liste) {
			if (m instanceof Arbeiter) {
				anz++;
			}
		}
		return anz;
	}
	
	public static void ausgabe(Mitarbeiter m) {
		if (m instanceof Arbeiter) {
			System.out.print("Arbeiter: ");
			m.ausgabe();
		} else 
		if (m instanceof Angestellter){
			System.out.print("Angestellter: ");
			m.ausgabe();
		}
	}
	
	
	public static void ausgabe(Mitarbeiter[] m_liste) {
		for (Mitarbeiter m : m_liste) {
			ausgabe(m);
		}
	}
		
		
	
	
	
	public static Mitarbeiter suche(int id, Mitarbeiter[] maListe ) throws NullPointerException{
		Mitarbeiter treffer=null;
		for (Mitarbeiter m : maListe) {
			if (m.id==id) {
				treffer=m;
				break;
			}
		}
		
		return treffer;
	}
	
	
}
