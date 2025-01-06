package UAS.ANDRA;

 class PegawaiTidakTetap extends Pegawai {
    private double gajiPokok;

    public PegawaiTidakTetap(String nama, double gajiPokok) {
        super(nama);
        this.gajiPokok = gajiPokok;
    }

    public double hitungGajiLembur(int jamLembur) {
        return jamLembur * (0.05 * gajiPokok);
    }

    public double hitungGajiBersih(int jamLembur) {
        double gajiLembur = hitungGajiLembur(jamLembur);
        return gajiPokok + gajiLembur;
    }

    public void Infopegawai() {
        super.Infopegawai();
        System.out.println("Gaji Pokok: Rp" + gajiPokok);
    }
    
}
