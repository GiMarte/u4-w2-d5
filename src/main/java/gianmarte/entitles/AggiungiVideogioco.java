import gianmarte.entitles.subclasses.Genre;
import gianmarte.entitles.subclasses.Videogioco;

import java.util.Scanner;

private static void aggiungiVideogioco(Scanner sc, CollezioneGiochi c) {

    System.out.print("ID: ");
    int id = Integer.parseInt(sc.nextLine());

    System.out.print("Titolo: ");
    String titolo = sc.nextLine();

    System.out.print("Anno: ");
    int anno = Integer.parseInt(sc.nextLine());

    System.out.print("Prezzo: ");
    double prezzo = Double.parseDouble(sc.nextLine());

    System.out.print("Piattaforma: ");
    String piattaforma = sc.nextLine();

    System.out.print("Ore di gioco: ");
    int ore = Integer.parseInt(sc.nextLine());

    System.out.print("Genere (MMORPG, FPS, RPG...): ");
    Genre genre = Genre.valueOf(sc.nextLine()
                                  .toUpperCase());

    c.aggiungi(new Videogioco(id, titolo, anno, prezzo, piattaforma, ore, genre));

    System.out.println("videogioco aggiunto.");
}
