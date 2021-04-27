package aster.service;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import aster.Controller.Verwaltung;
import aster.model.Abteilung;
import aster.model.Angestellter;
import aster.model.Mitarbeiter;

public class FileReaderService {

	public static List<String> getAngestelltenNamen(Verwaltung vervaltung) {
		List<String> namenListe = new ArrayList<>();

		for (Mitarbeiter angestellter : vervaltung.getAlleAngesteller(vervaltung.getAbteilungen_Liste())) {
			if (angestellter instanceof Angestellter) {
				namenListe.add(angestellter.getName());
			}
		}
		return namenListe;
	}

	public static String readNames(String fileName) throws IOException {
		return new String(Files.readString(Paths.get(fileName)));
	}

	public static String deserialize(Path path) throws IOException, ClassNotFoundException {
		FileInputStream fileReader = new FileInputStream(path.toString());
		ObjectInputStream objektReader = new ObjectInputStream(fileReader);
		String liste = objektReader.readObject().toString();
		objektReader.close();
		return liste;
	}
}
