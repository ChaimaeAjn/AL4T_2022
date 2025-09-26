package be.ecam.basics.exercises;

public class Counter {
    // On retourne un int car byte ne peut pas contenir de grandes valeurs
    public static int count(int start, int steps) {
        int c = start;
        // La boucle va s'exécuter (steps + start) fois
        steps = steps + start;
        for (int i = 0; i < steps; i++) {
            c++;
        }
        return c;
    }
}
