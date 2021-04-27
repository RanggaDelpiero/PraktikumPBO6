package Polimorfisme;

public class PegawaiHarian extends Pegawai{

    private double upahPerjam;
    private int totalJam;
    private double pendapatan;

    public PegawaiHarian(String nama, String noKTP, double upahPerjam, int totalJam) {
        super(nama, noKTP);
        this.upahPerjam = upahPerjam;
        this.totalJam = totalJam;
    }

    public double getUpahPerjam() {
        return upahPerjam;
    }

    public void setUpahPerjam(double upahPerjam) {
        this.upahPerjam = upahPerjam;
    }

    public int getTotalJam() {
        return totalJam;
    }

    public void setTotalJam(int totalJam) {
        this.totalJam = totalJam;
    }

    public double gaji() {
        return getTotalJam()*getUpahPerjam();
    }

    public String toString() {
        return  "========================================\n" +
                "Pegawai Harian      :   " + super.toString() + "\n" +
                "Upah/Jam            :   Rp" + String.format("%.0f", getUpahPerjam()) + "\n" +
                "Total Jam Kerja     :   " + totalJam + "\n" +
                "Pendapatan          :   Rp" + String.format("%.0f", gaji()) + "\n" +
                "========================================\n";
    }
}
