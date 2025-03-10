package cinema;

public class People {
    Gender pohlavi;
    String jmeno;
    String mesto;

    public Gender getPohlavi() { return pohlavi; }

    public People(Gender pohlavi, String jmeno, String mesto) {
        this.pohlavi = pohlavi;
        this.jmeno = jmeno;
        this.mesto = mesto;
    }
}
    public void printInfo(){
    System.out.println(jmeno + " - " + pohlavi);
}

//neznámo proč se mi class People.java označilo jako "Final class" netuším co to je, ale kvůli tomu mám errory a kód mi nefunguje -_-
// nevím jak to vypnout, ale jsem si jist že pak bude kód z velké části funkční