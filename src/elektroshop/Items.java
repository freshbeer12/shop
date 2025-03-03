package elektroshop;

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
            //nacti od uzivatele míru spotreby a rok výroby ledničky
            //pridej lednicku do pole lednicek
            System.out.println("Zadej míru spotřeby");
            char spotreba =scanner.next().charAt(0);
            System.out.print("Zadej rok výroby ledniky ");
            int rokVyroby = scanner.nextInt();

        }

    }


    /**
     * Tato metoda vypise informace o lednickach. Na prvnim rádku bude text "-----INFO O LEDNICKACH----- ",
     * na dalsich radkach bude vzdy rok vyroby lednick, dvojtecka a popis spotreby. (Vyuzijte metodu printInfo() tridy Fridge.)
     * Na poslednim radku bude text "-----".
     */
    public void printInfo(){
        System.out.println("-----INFO O LEDNICKACH-----");
        printInfo();
        System.out.println("-----");
    }

    public void nenarocneLednicky(){
        if (char spotreba = char A){
            System.out.println(Fridge);
        }
    }
}
