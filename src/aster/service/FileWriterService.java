package aster.service;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import aster.model.Mitarbeiter;

public class FileWriterService {

	public static Path createFile(String fileName) throws IOException {
		Path newFile = Paths.get(".", fileName);
		Files.createFile(newFile);
		return newFile;
	}

	public static void writeNames(List<String> liste, Path path) throws IOException {
		BufferedWriter bWriter = Files.newBufferedWriter(path);
		for (String name : liste) {
			bWriter.write(String.format("%s\n", name));
		}
		bWriter.close();
	}

	public static void serialize(List<Mitarbeiter> mList, Path p) throws IOException {
		FileOutputStream fileWriter = new FileOutputStream(p.toString());
		ObjectOutputStream objectWriter = new ObjectOutputStream(fileWriter);
		objectWriter.writeObject(mList);
		fileWriter.close();
		objectWriter.close();
	}
}
