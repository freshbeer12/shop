package library;

import cinema.Gender;

import java.util.Scanner;

public class Book implements IItem {

    private String nazev;
    private String jmeno;
    private int stranky;

    public Book() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadej název knihy");
        String nazev = scanner.nextLine();
        System.out.println("Zadej jméno autora");
        String jmeno = scanner.nextLine();
        System.out.println("Zadej počet stránek");
        int stranky = Integer.parseInt(scanner.nextLine());
    }

        public void printInfo(){
                System.out.println("Kniha s názvem " + nazev + " má " + stranky + "stran a napsal jí " + jmeno);
            }

            public void printDelka(){
                System.out.println("Kniha má " + stranky + " stran");
            }
}
