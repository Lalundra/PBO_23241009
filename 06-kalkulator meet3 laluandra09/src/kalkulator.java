import java.util.Scanner;  // Mengimpor kelas Scanner untuk membaca input dari pengguna

public class kalkulator {  // Deklarasi kelas utama kalkulator
    public static void main(String[] args) {  // Metode main, program dimulai dari sini
        // Menampilkan judul kalkulator dengan gambar teks ASCII
        System.out.println("  _   _    _____    __      __       _____   ");
        System.out.println(" | | | |  |  ___|  |  |    |  |     |  _  |  ");
        System.out.println(" | |_| |  | |__    |  |    |  |     | | | |     ");
        System.out.println(" |  _  |  |  __|   |  |    |  |     | | | |         ");
        System.out.println(" | | | |  | |___   |  |__  |  |__   | |_| |   ");
        System.out.println(" |_| |_|  |_____|  |_____| |_____|  |_____|           ");
        System.out.println("                                                            ");
        System.out.println("SELAMAT DATANG DI PEMROGRAMAN KALKULATOR SEDERHANA");  // Menampilkan ucapan selamat datang
        System.out.println("===================================================");  // Menampilkan garis pemisah

        Scanner input = new Scanner(System.in);  // Membuat objek Scanner untuk membaca input dari pengguna
        char ulang;  // Deklarasi variabel untuk pilihan melanjutkan atau tidak

        do {  // Mulai loop do-while
            // Membaca bilangan pertama dari pengguna
            System.out.print("masukan bilangan pertama: ");
            double angka_pertama = input.nextDouble();  // Membaca input bilangan pertama

            // Membaca operator dari pengguna (perkalian, pembagian, penjumlahan, pengurangan)
            System.out.print("ketik:  [ x  untuk perkalian] [ / untuk pembagian] [+ untuk penjumlahan] dan [- untuk pengurangan] : ");
            char operator = input.next().charAt(0);  // Membaca input operator

            // Membaca bilangan kedua dari pengguna
            System.out.print("masukan bilangan kedua: ");
            double angka_kedua = input.nextDouble();  // Membaca input bilangan kedua
            double hasil = 0;  // Variabel untuk menyimpan hasil operasi
            boolean validOperator = true;  // Flag untuk memeriksa apakah operator valid

            // Switch case untuk memilih operasi berdasarkan input operator
            switch (operator) {
                case '+':  // Jika operator adalah penjumlahan
                    hasil = angka_pertama + angka_kedua;  // Penjumlahan
                    break;
                case '-':  // Jika operator adalah pengurangan
                    hasil = angka_pertama - angka_kedua;  // Pengurangan
                    break;
                case 'x':  // Jika operator adalah perkalian
                    hasil = angka_pertama * angka_kedua;  // Perkalian
                    break;
                case '/':  // Jika operator adalah pembagian
                    if (angka_kedua != 0) {  // Pengecekan untuk pembagian dengan nol
                        hasil = angka_pertama / angka_kedua;  // Pembagian
                    } else {
                        // Pesan error jika pembagian dengan nol
                        System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                        validOperator = false;  // Menandai operator tidak valid
                    }
                    break;
                default:  // Jika operator tidak valid
                    System.out.println("Error: Operator tidak valid.");  // Menampilkan pesan error
                    validOperator = false;  // Menandai operator tidak valid
                    break;
            }

            // Jika operator valid, tampilkan hasil operasi
            if (validOperator) {
                System.out.println("===================================================");
                System.out.println("Hasil dari: " + angka_pertama + " " + operator + " " + angka_kedua + " = " + hasil);
            }

            // Menampilkan pilihan untuk melanjutkan atau tidak
            System.out.println("===================================================");
            System.out.print("Apakah Anda ingin menghitung lagi? silahkan ketik [y = untuk lanjut menggunakanya!] [n = untuk berhenti] ");
            ulang = input.next().charAt(0);  // Membaca input apakah pengguna ingin menghitung lagi

        } while (ulang == 'y' || ulang == 'Y');  // Loop akan diulang jika pengguna mengetik 'y' atau 'Y'

        input.close();  // Menutup scanner
        System.out.println("Okayyy kalkulator berhenti, klik run apabila ingin menggunakanya lagi!");  // Pesan akhir saat program selesai
    }
}
