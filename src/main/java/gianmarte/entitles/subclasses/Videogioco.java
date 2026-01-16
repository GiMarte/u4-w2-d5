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

    @Override public String toString() {
    return super.toString() + "Videogioco {" +
            "piattaforma='" + piattaforma + ' ' +
            ", oreGioco=" + oreGioco +
            ", genere=" + genere +
            '}';
}}
