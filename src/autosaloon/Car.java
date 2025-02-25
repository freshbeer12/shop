package autosaloon;

public class Car {
    private Condition stav;
    private CarDatabase rok;
    private CarDatabase km;
    private CarDatabase barva;

}

public class printInfo(){
    System.out.println("Rok výroby je " + rok);
    System.out.println("Auto má najeto " + km);
    System.out.println("Barva auta je " + barva);
}

