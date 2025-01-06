package UAS.ANDRA;

 class PegawaiTetap extends Pegawai {
    private double gajiTetap;
    private double tunjangan;

    // Constructor
    public PegawaiTetap(String nama, double gajiTetap) {
        super(nama);
        this.gajiTetap = gajiTetap;
        this.tunjangan = 0.7 * gajiTetap; 
    }

    public double hitungGajiLembur(int jamLembur) {
        return jamLembur * (0.1 * gajiTetap);
    }

    public double hitungGajiBersih(int jamLembur) {
        double gajiLembur = hitungGajiLembur(jamLembur);
        return gajiTetap + tunjangan + gajiLembur;
    }

    public void Infopegawai() {
        super.Infopegawai();
        System.out.println("Gaji Tetap: Rp" + gajiTetap);
        System.out.println("Tunjangan (70%): Rp" + tunjangan);
    }
    
}
