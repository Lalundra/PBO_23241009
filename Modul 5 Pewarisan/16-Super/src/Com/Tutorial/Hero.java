package Com.Tutorial;

public class Hero {
    //Atribut
    String nama = "class hero";

    //method
    void cetak(){
        System.out.println("Ini Adalah :" + this.nama);
        this.dummyMethod();
    }

   //Method
   void dummyMethod(){
    System.out.println("Ini Adalah Method Superclass");
   }
}
