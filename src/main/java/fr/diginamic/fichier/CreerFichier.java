package fr.diginamic.fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CreerFichier {
    public static void main(String[] args) throws IOException {
        Path pathOrigin = Paths.get("/home/cigale/IdeaProjects/approche-objet/src/main/java/fr/diginamic/fichier/recensement.csv");
        Path pathDestination = Paths.get("/home/cigale/IdeaProjects/approche-objet/src/main/java/fr/diginamic/fichier/recensement2.csv");
        List<String> lines = Files.readAllLines(pathOrigin);
        List<String> lines100 = new ArrayList<>();

        for(int i=0; i<100; i++) {
            lines100.add(lines.get(i));
        }
        Files.write(pathDestination, lines100);
    }
}
