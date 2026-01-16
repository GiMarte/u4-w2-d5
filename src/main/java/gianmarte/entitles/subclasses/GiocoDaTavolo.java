package gianmarte.entitles.subclasses;

import gianmarte.entitles.Gioco;

public class GiocoDaTavolo extends Gioco {
    private int minGiocatori;
    private int maxGiocatori;
    private int durataMediaMinuti;

    public GiocoDaTavolo(int id, String titolo, int anno, double prezzo,
                         int minGiocatori, int maxGiocatori, int durataMediaMinuti) {
        super(id, titolo, anno, prezzo);

        if (minGiocatori < 2 || maxGiocatori > 10 || minGiocatori > maxGiocatori)
            throw new IllegalArgumentException("range giocatori non valido");

        this.minGiocatori = minGiocatori;
        this.maxGiocatori = maxGiocatori;
        this.durataMediaMinuti = durataMediaMinuti;
    }

    public boolean supportaGiocatori(int n) {
        return n >= minGiocatori && n <= maxGiocatori;
    }
}
