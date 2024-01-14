package Alignement;

import java.util.List;

public class Alignment implements Observer {
    private Algorithme algorithme;
    Data data;


    @Override
    public void update() {

    }
    // Méthode pour changer l'algorithme d'alignement à la volée
    public void setAlgorithme(Algorithme algorithme) {
        this.algorithme = algorithme;
    }
}
