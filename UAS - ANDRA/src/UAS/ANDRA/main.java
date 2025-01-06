package UAS.ANDRA;

public class main {
    public static void main(String[] args) {

        PegawaiTetap pegawaiTetap = new PegawaiTetap("Andra", 4000000);
        pegawaiTetap.Infopegawai();
        System.out.println("Gaji Lembur (2 jam): Rp" + pegawaiTetap.hitungGajiLembur(2));
        System.out.println("Gaji Bersih: Rp" + pegawaiTetap.hitungGajiBersih(2));
        System.out.println();


        
        PegawaiTidakTetap pegawaiTidakTetap = new PegawaiTidakTetap("Budi", 3000000);
        pegawaiTidakTetap.Infopegawai();
        System.out.println("Gaji Lembur (4 jam): Rp" + pegawaiTidakTetap.hitungGajiLembur(4));
        System.out.println("Gaji Bersih: Rp" + pegawaiTidakTetap.hitungGajiBersih(4));
    }
}
