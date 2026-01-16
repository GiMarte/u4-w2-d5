package gianmarte.entitles.subclasses;

import gianmarte.entitles.Gioco;

public class Videogioco extends Gioco {
    private String piattaforma;
    private int oreGioco;
    private Genere genere;

    public Videogioco(int id, String titolo, int anno, double prezzo,
                      String piattaforma, int oreGioco, Genere genere) {
        super(id, titolo, anno, prezzo);
        this.piattaforma = piattaforma;
        this.oreGioco = oreGioco;
        this.genere = genere;
    }
}
