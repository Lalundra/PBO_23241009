package Com.tutorial;


//sub class Child class
class herostrengt extends Hero{

} 

//Pewarisan adalah hubungan is-a
public class Main {
    public static void main(String[] args) {
        //membuat objek hiro
        Hero hero1 = new Hero();
        hero1.nama = "Goku";
        hero1.cetak();

        herostrengt hero2 = new herostrengt();
        hero2.nama = "Aldous";
        hero2.cetak();
        
    }
    
}
