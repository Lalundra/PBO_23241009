package Com.Tutorial;

public class Herostrenght extends Hero {
    String atribut = "Strenght";

    // subclass konstruktor
    Herostrenght(String name, double defence, double attack ){
        super(name, defence,attack);
    }
    //overriding cetak
    void cetak(){
        System.out.println("Hero :" + this.atribut);
        super.cetak();
    }


}
