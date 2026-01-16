package gianmarte.entitles;

public abstract class Gioco {
    protected int id;
    protected String titolo;
    protected int annoPubblicazione;
    protected double prezzo;

    public Gioco(int id, String titolo, int annoPubblicazione, double prezzo) {
        this.id = id;
        this.titolo = titolo;
        this.annoPubblicazione = annoPubblicazione;
        this.prezzo = prezzo;
    }

    public int getId() {
        return id;
    }

    public double getPrezzo() {
        return prezzo;
    }
}
