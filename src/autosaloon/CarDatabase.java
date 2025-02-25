package autosaloon;

import java.util.Scanner;

public class CarDatabase {

    static Scanner sc = new Scanner(System.in);

    private String owner;
    private Car[] cars;
    private int rok;
    private int km;
    private String barva;

    public CarDatabase(String owner, int rok, int km, String barva){
        this.owner = owner;
        this.cars = cars;
        this.rok = rok;
        this.km = km;
        this.barva = barva;
    }


    /**
     * Metoda se zepta uzivatele na informace k pozadovanemu poctu aut. A ty prida do pole aut.
     * @param count - pozadovany pocet aut
     */
    public void addCars(int count) {
        for (int i=0; i<count; i++){
            System.out.println("Jaký je rok výroby auta?");
            int rok = sc.nextInt();
            System.out.println("Kolik má auto najetých km?");
            int km = sc.nextInt();
            sc.nextLine();
            System.out.println("Jaká je barva auta?");
            String barva = sc.nextLine();
            //nacti od uzivatele rok vyroby, pocet najetych km, barvu a stav auta
            //vytvor instanci auta - nutno upravit i tridu Car, chceme instanci nastavit atributy na nactene hodnoty od uzivatele
            //pridej auto do pole aut
            cars[i] = new Car();
        }

    }

    /**
     * Vypise vsechna auta, jejijz stav je "good". Vypis bude ve formatu: Na prvnim radku bude vypis: Dobra auta jsou: .
     * Na kazdem dalsim radku bude vypis informaci o jednom aute - pouzij metodu printInfo() tridy Car
     */
    public void printCarInGoodCondition(){
        for (Car car : cars){
            if (car.getStav = Condition.good){
                System.out.println("Dobrá auta jsou:");
            }
        }
    }
}
