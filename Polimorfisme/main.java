package Polimorfisme;

public class main {

    public static void main(String[] args) {
        Pegawai tetap1 = new PegawaiTetap("Bayu", "205150200111008", 2000000);
        Pegawai harian1 = new PegawaiHarian("Edo", "205150200111009", 8500, 40);
        Pegawai sales1 = new Sales("Tika", "205150200111006", 50, 50000);

        Pegawai tetap2 = new PegawaiTetap("Rangga", "3171070309020004", 15000000);
        Pegawai harian2 = new PegawaiHarian("Greg", "3171071801750005", 50000, 30);
        Pegawai sales2 = new Sales("Delpiero", "31710209030008", 100, 20000);

        Pegawai tetap3 = new PegawaiTetap("Abyan", "31711102770003", 10000000);
        Pegawai harian3 = new PegawaiHarian("Rafi", "31790583485943", 250000, 50);
        Pegawai sales3 = new Sales("Raihan", "93769204857289", 30, 15000);

        System.out.println(tetap1);
        System.out.println(harian1);
        System.out.println(sales1);
        System.out.println(tetap2);
        System.out.println(harian2);
        System.out.println(sales2);
        System.out.println(tetap3);
        System.out.println(harian3);
        System.out.println(sales3);



    }
}
