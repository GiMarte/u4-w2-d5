package gianmarte.entitles;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class CollezioneGiochi {


    private List<Gioco> giochi = new ArrayList<>();

    public void aggiungi(Gioco gioco) {
        if (giochi.stream()
                  .anyMatch(g -> g.getId() == gioco.getId()))
            throw new IllegalArgumentException("ud già esistente");

        giochi.add(gioco);
    }

    public Gioco cercaPerId(int id) {
        return giochi.stream()
                     .filter(g -> g.getId() == id)
                     .findFirst()
                     .orElseThrow(() -> new NoSuchElementException("id non trovato"));
    }

    public List<Gioco> cercaPerPrezzo(double maxPrezzo) {
        return giochi.stream()
                     .filter(g -> g.getPrezzo() < maxPrezzo)
                     .toList();
    }

    public void rimuovi(int id) {
        boolean removed = giochi.removeIf(g -> g.getId() == id);
        if (!removed)
            throw new NoSuchElementException("id non trovato");
    }

    public void aggiorna(int id, Gioco nuovo) {
        for (int i = 0; i < giochi.size(); i++) {
            if (giochi.get(i)
                      .getId() == id) {
                giochi.set(i, nuovo);
                return;
            }
        }
        throw new NoSuchElementException("id non trovato");
    }


}