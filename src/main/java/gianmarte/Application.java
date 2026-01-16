package gianmarte;

import gianmarte.entitles.CollezioneGiochi;
import gianmarte.entitles.subclasses.Genere;
import gianmarte.entitles.subclasses.GiocoDaTavolo;
import gianmarte.entitles.subclasses.Videogioco;

import java.util.Scanner;


public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CollezioneGiochi collezione = new CollezioneGiochi();

        while (true) {
            stampaMenu();

            try {
                int scelta = Integer.parseInt(sc.nextLine());

                switch (scelta) {

                    case 1 -> aggiungiVideogioco(sc, collezione);
                    case 2 -> aggiungiGiocoDaTavolo(sc, collezione);
                    case 3 -> System.out.println(collezione);
                    case 0 -> {
                        System.out.println("chisurua dal programma.");
                        return;
                    }

                    default -> System.out.println("scelta non valida.");
                }

            } catch (Exception e) {
                System.out.println("errore: " + e.getMessage());
            }
        }
    }

    private static void aggiungiVideogioco(Scanner sc, CollezioneGiochi c) {

        System.out.print("id: ");
        int id = Integer.parseInt(sc.nextLine());

        System.out.print("ttolo: ");
        String titolo = sc.nextLine();

        System.out.print("anno: ");
        int anno = Integer.parseInt(sc.nextLine());

        System.out.print("prezzo: ");
        double prezzo = Double.parseDouble(sc.nextLine());

        System.out.print("piattaforma: ");
        String piattaforma = sc.nextLine();

        System.out.print("ore di gioco: ");
        int ore = Integer.parseInt(sc.nextLine());

        System.out.print("genere (MMORPG, FPS, RPG...): ");
        Genere genere = Genere.valueOf(sc.nextLine()
                                         .toUpperCase());

        c.aggiungi(new Videogioco(id, titolo, anno, prezzo, piattaforma, ore, genere));

        System.out.println("videogioco aggiunto");
    }

    private static void aggiungiGiocoDaTavolo(Scanner sc, CollezioneGiochi c) {
        System.out.print("id: ");
        int id = Integer.parseInt(sc.nextLine());

        System.out.print("ttolo: ");
        String titolo = sc.nextLine();

        System.out.print("anno: ");
        int anno = Integer.parseInt(sc.nextLine());

        System.out.print("prezzo: ");
        double prezzo = Double.parseDouble(sc.nextLine());

        System.out.print("min giocatori:");
        int minG = Integer.parseInt(sc.nextLine());

        System.out.print("max giocatori:");
        int maxG = Integer.parseInt(sc.nextLine());

        System.out.printf("durata media partita: ");
        int durataMPartita = Integer.parseInt(sc.nextLine());

        c.aggiungi(new GiocoDaTavolo(id, titolo, anno, prezzo, minG, maxG, durataMPartita));

        System.out.println("gioco da tavola aggiunto");
    }

    private static void stampaMenu() {
        System.out.println("""
                
                1) aggiungi videogioco
                2) aggiungi gioco da tavolo
                3) cerca per id
                4) cerca per prezzo
                5) cerca per numero giocatori
                6) rimuovi per id
                7) statistiche
                0) esci
                """);
    }
}
