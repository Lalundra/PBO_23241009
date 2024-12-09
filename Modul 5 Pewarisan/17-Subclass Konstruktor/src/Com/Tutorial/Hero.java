package Com.Tutorial;

public class Hero {
    //atribut
    String name;
    double defencepower;
    double attacpower;

    //Construktor
    Hero (String name, double defencepower, double attacpower){
        this.name = name;
        this.defencepower = defencepower;
        this.attacpower = attacpower;

    }

    //Method
    void cetak(){
        System.out.println("\nName Hero :" + this.name);
        System.out.println("Defence Power : " + this.defencepower);
        System.out.println("Attack Power : " + this.attacpower);
    }
    
}
