package library;

import java.util.Scanner;

public class Magazine implements IItem {

        private String nazev;
        private String redakce;
        private int stranky;

        public Magazine() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Zadej název časopisu");
            String nazev = scanner.nextLine();
            System.out.println("Zadej název redakce");
            String redakce = scanner.nextLine();
            System.out.println("Zadej počet stránek");
            int stranky = Integer.parseInt(scanner.nextLine());
        }

        public void printInfo(){
            System.out.println("Magazine s názvem " + nazev + " má " + stranky + "stran a vydává ho redakce " + redakce);
        }

    public void printDelka(){
        System.out.println("Magazine má " + stranky + " stran");
    }

}
