package COM.Tutorial;

public class Player {
    //Atribut
    private String name;

    //Atribut Static
    private static int jumlahplayer;

    //Konstruktor opsi 1
    Player (String name){
        Player.jumlahplayer++;
        this.name = name ;

    }

    //overloading Konstruktor opsi 2
    Player(){
        Player.jumlahplayer++;
        this.name = "Player" + Player.jumlahplayer++;
    }

    //cetak
    void cetak(){
        System.out.println("name :" + this.name );
    }
}
