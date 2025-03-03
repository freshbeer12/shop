package elektroshop;

public class Fridge {
    char spotreba;
    String znacka;
    String model;
    int rokVyroby;

    public Fridge(char spotreba, String znacka, String model, int rokVyroby){
        this.spotreba = spotreba;
        this.znacka = znacka;
        this.model = model;
        this.rokVyroby = rokVyroby;
    }
    public void printInfo(){
        System.out.println("rok výroby ledničky je " + rokVyroby + ": " + spotreba);
    }
}
