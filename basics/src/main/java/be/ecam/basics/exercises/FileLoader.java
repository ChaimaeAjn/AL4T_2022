package be.ecam.basics.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileLoader {
    public static String firstLine(Path path) throws IOException { // ajout de throws IOException
        BufferedReader br = null; // lecteur de fichier
        try {
            br = Files.newBufferedReader(path, StandardCharsets.UTF_8);
            return br.readLine(); // lecture de la 1ère ligne
        } finally {
            // ferme le fichier même en cas d'erreur
            if (br != null) {
                try { br.close(); } catch (IOException ignored) { }
            }
        }
    }
}
