class Mahasiswa {
    // data member atau atribut
    String nama;
    String nim;

    Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;

    }

    // method tanpa parameter dan return
    void cetak() {
        // mencetak nama dan nim
        System.out.println("Nama : " + this.nama);
        System.out.println("NIM : " + this.nim);
    }

    // method tanpa return dengan parameter
    void setNama(String nama) {
        this.nama = nam