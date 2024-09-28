import java.util.Scanner;

public class kalkulator{
    public static void main(String[] args) {
        System.out.println("  _   _    _____    __      __       _____   ");
        System.out.println(" | | | |  |  ___|  |  |    |  |     |  _  |  ");
        System.out.println(" | |_| |  | |__    |  |    |  |     | | | |     ");
        System.out.println(" |  _  |  |  __|   |  |    |  |     | | | |         ");
        System.out.println(" | | | |  | |___   |  |__  |  |__   | |_| |   ");
        System.out.println(" |_| |_|  |_____|  |_____| |_____|  |_____|           ");
        System.out.println("                                                            ");
        System.out.println("SELAMAT DATANG DI PEMROGRAMAN KALKULATOR SEDERHANA");
        System.out.println("===================================================");
        Scanner input = new Scanner(System.in);
        char ulang;

        do{
            System.out.print("masukan bilangan pertama: ");
            double angka_pertama = input.nextDouble();

            System.out.print("ketik:  [ x  untuk perkalian] [ / untuk pembagian] [+ untuk penjumlahan] dan [- untuk pengurangan] : ");
            char operator = input.next().charAt(0);

            System.out.print("masukan bilangan kedua: ");
            double angka_kedua = input.nextDouble();
            double hasil = 0;
            boolean validOperator = true;

            switch (operator) {
                case '+':
                    hasil = angka_pertama + angka_kedua;
                    break;
                case '-':
                    hasil = angka_pertama - angka_kedua;
                    break;

                case 'x':
                    hasil = angka_pertama * angka_kedua;
                    break;

                case '/':
                    if (angka_kedua != 0) {
                    hasil = angka_pertama / angka_kedua;
                    } else {
                    System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                    validOperator = false;
                    }
                    break;

                default:
                System.out.println("Error: Operator tidak valid.");
                    validOperator = false;
                    break;
        }
        if (validOperator) {
            System.out.println("===================================================");
            System.out.println("Hasil dari: " + angka_pertama + " " + operator + " " + angka_kedua + " = " + hasil);
        }
        
        System.out.println("===================================================");
        System.out.print("Apakah Anda ingin menghitung lagi? silahkan ketik [y = untuk lanjut menggunakanya!] [n = untuk berhenti] ");
        ulang = input.next().charAt(0);

    } while (ulang == 'y' || ulang == 'Y');

    
    input.close();
    System.out.println("Okayyy kalkulator berhenti, klik run apabila ingin menggunakanya lagi!");

    }
}
