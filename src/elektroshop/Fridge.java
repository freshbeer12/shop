package elektroshop;

public class Fridge {
    Narocnost spotreba;
    String znacka;
    String model;
    int rokVyroby;

    public Narocnost getNarocnost(){
        return this.spotreba;
    }

    public Fridge(Narocnost spotreba, String znacka, String model, int rokVyroby){
        this.spotreba = spotreba;
        this.znacka = znacka;
        this.model = model;
        this.rokVyroby = rokVyroby;
    }
    public void printInfo(){
        System.out.println("rok výroby ledničky je " + rokVyroby + ": " + spotreba);
    }
}
