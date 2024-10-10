package fr.diginamic.fichier;

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LireFichier {
    public static void main(String[] args) throws IOException {
        ArrayList<Ville> arrayCities = new ArrayList<>();

        Path pathfile = Paths.get("/home/cigale/IdeaProjects/approche-objet/src/main/java/fr/diginamic/fichier/recensement.csv");
        List<String> lines = Files.readAllLines(pathfile);

        for (int i=0; i<lines.size(); i++) {
//            System.out.println(lines.get(i));
            if(i > 0){
                String[] tokens = lines.get(i).split(";");
                String name= tokens[6];
                String zipCode = tokens[2];
                String regionName = tokens[1];
                String strPopulation = tokens[9].replaceAll(" ", "");
                int population = Integer.parseInt(strPopulation);

                arrayCities.add(new Ville(name, zipCode, regionName, population));
            }
        }

//        for(Ville ville : arrayCities){
//            System.out.println("Nom :" + ville.getName());
//            System.out.println("Code département : " + ville.getZipCode());
//            System.out.println("Région : " + ville.getRegion());
//            System.out.println("Population totale : " + ville.getTotalPopulation() + "\n");
//        }

        Path pathNewFile = Paths.get("/home/cigale/IdeaProjects/approche-objet/src/main/java/fr/diginamic/fichier/recensement-grandes-villes.csv");
        ArrayList<String> bigCities = new ArrayList<>();
        bigCities.add("Nom de la ville;Code département;Nom de la région;Population totale;");

        for(Ville ville : arrayCities){
            if(ville.getTotalPopulation() > 25000){
                String str = ville.getName() + ";" + ville.getZipCode() + ";" + ville.getRegion() + ";" + String.valueOf(ville.getTotalPopulation() + ";");
                bigCities.add(str);
            }
        }
        Files.write(pathNewFile, bigCities, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);

        ArrayList<String[]> zipCodesArr = new ArrayList<>();
        zipCodesArr.add(new String[]{"\n\nCode postal","Compteur"});

        for(int i=0; i<arrayCities.size(); i++){
            boolean zipCodeExists = false;
            for(int j=0; j<zipCodesArr.size(); j++){
                if(Objects.equals(zipCodesArr.get(j)[0], arrayCities.get(i).getZipCode())){
                    zipCodesArr.get(j)[1] = String.valueOf(Integer.parseInt(zipCodesArr.get(j)[1])+1);
                    zipCodeExists = true;
                }
            }
            if(!zipCodeExists){
                zipCodesArr.add(new String[]{arrayCities.get(i).getZipCode(), String.valueOf(1)});
            }
            zipCodeExists = false;
        }

        for(String[] zipCode : zipCodesArr) {
            System.out.println(zipCode[0] + " : " + zipCode[1]);
        }
    }
}
