package cinema;

import elektroshop.Fridge;
import elektroshop.Narocnost;

import java.util.Scanner;

public class Film {

    private String name;
    private int year;
    private People[] actors;

    private People director;


    public void filmicek(){
        String nazev;
        int rokVydani;
    }

    /**
     * Metoda se zepta uzivatele na informace k pozadovanemu poctu hercu. A ty prida do pole actors.
     * @param count - pozadovany pocet hercu
     */
    Scanner scanner = new Scanner(System.in);
    public void addActors(int count) {
        actors = new People[count];
        for (int i=0; i<count; i++){
            System.out.println("Zadej jméno herce");
            String jmeno = scanner.nextLine();
            System.out.println("Zadej rodné město herce");
            String mesto = scanner.nextLine();
            System.out.println("Zadej pohlaví herce");
            String Gender = scanner.nextLine().toLowerCase();
            Gender gender = cinema.Gender.valueOf(Gender);
            People p = new People(pohlavi, jmeno, mesto);
            actors[i] = p;
            //nacti od uzivatele jmeno, rodne mesto a pohlavi herce
            //pridej herce do pole hercu
        }

    }
    public void pocetHercu(){
        System.out.println("Počet herců je " + actors.length);
    }

    /**
     * Tato metoda vypise informace o filmu. Na prvnim rádku bude text "-----INFO O FILMU----- ", na druhem bude nazev, rok vydani filmu.
     * Na tretim radku bude text "herci" a následne budou vypsani vsichni herci oddeleni od sebe carkou a to ve formatu "jmeno - pohlavi" (Vyuzijte metodu printInfo() tridy People.)
     * Na poslednim radku bude text "-----".
     */
    public void printInfo(){
        System.out.println("-----INFO O FILMU-----");
        System.out.println("Nazev: " + name + "rok vydání: " + year);
        for(People p : actors){
            p.printInfo();
        }
        System.out.println("-----");
    }
}
