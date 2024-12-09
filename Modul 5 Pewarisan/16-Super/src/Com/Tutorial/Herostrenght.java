package Com.Tutorial;

public class Herostrenght extends Hero{
    String nama = "Class herostrenght";

    //Overloading
    void cetak(){
        System.out.println("Ini Adalah :" + this.nama);
        this.dummyMethod();
        //super.dummyMethod();
    }

    //Overriding Method Dummy
    void dummyMethod(){
        System.out.println("Ini Adalah Method Subclass");
    }
    
}
