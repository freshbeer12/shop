package elektroshop;

import autosaloon.Car;
import autosaloon.Condition;

import java.util.Scanner;

public class Items {
    private Fridge[] items;



    /**
     * Metoda se zepta uzivatele na informace k pozadovanemu poctu ledniček. A ty prida do pole items.
     * @param count - pozadovany pocet lednicek
     */
    public void addItems(int count) {
        Scanner scanner = new Scanner(System.in);
        items = new Fridge[count];
        for (int i=0; i<count; i++){
            System.out.println("Zadej značku ledničky");
            String znacka = scanner.nextLine();
            System.out.println("Zadej model ledničky");
            String model = scanner.nextLine();
            //nacti od uzivatele míru spotreby a rok výroby ledničky
            //pridej lednicku do pole lednicek
            System.out.println("Zadej míru spotřeby");
            String Narocnost = scanner.nextLine().toUpperCase();
            Narocnost narocnost = elektroshop.Narocnost.valueOf(Narocnost);
            System.out.print("Zadej rok výroby ledniky ");
            int rokVyroby = scanner.nextInt();
            scanner.nextLine();
            Fridge f = new Fridge(narocnost, znacka, model, rokVyroby);
            items[i] = f;
        }

    }


    /**
     * Tato metoda vypise informace o lednickach. Na prvnim rádku bude text "-----INFO O LEDNICKACH----- ",
     * na dalsich radkach bude vzdy rok vyroby lednick, dvojtecka a popis spotreby. (Vyuzijte metodu printInfo() tridy Fridge.)
     * Na poslednim radku bude text "-----".
     */
    public void printInfo(){
        System.out.println("-----INFO O LEDNICKACH-----");
        for(Fridge f : items){
            f.printInfo();
        }
        System.out.println("-----");
    }

    public void vypisPocet(){
        System.out.println("Počet ledniček je " + items.length);
    }
    public void pocetNarocnosti() {
        int A = 0;
        int B = 0;
        int C = 0;
        int D = 0;
        int E = 0;
        int F = 0;
        int G = 0;
        for (Fridge f : items) {
            if (f.getNarocnost() == Narocnost.A) {
                A++;
            }
            if (f.getNarocnost() == Narocnost.B) {
                B++;
            }
            if (f.getNarocnost() == Narocnost.C) {
                C++;
            }
            if (f.getNarocnost() == Narocnost.D) {
                D++;
            }
            if (f.getNarocnost() == Narocnost.E) {
                E++;
            }
            if (f.getNarocnost() == Narocnost.F) {
                F++;
            }
            if (f.getNarocnost() == Narocnost.G) {
                G++;
            }
        }
        System.out.println("A: " + A + " B: " + B + " C: " + C + " D: " + D + " E: " + E);
    }
}
