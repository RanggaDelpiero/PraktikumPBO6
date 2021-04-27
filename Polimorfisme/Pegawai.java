package Polimorfisme;

public class Pegawai {

    private String nama;
    private String noKTP;
    private double pendapatan;

    public Pegawai(String nama, String noKTP) {
        this.nama = nama;
        this.noKTP = noKTP;
    }

    Pegawai() {}

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNoKTP() {
        return noKTP;
    }

    public void setNoKTP(String noKTP) {
        this.noKTP = noKTP;
    }

    public Double getPendapatan() {return pendapatan;}

    public void setPendapatan(double pendapatan) {this.pendapatan = pendapatan;}

    public double gaji() {
        return pendapatan;
    }

    @Override
    public String toString() {
        return nama + "\n" +
                "No.KTP              :  " + noKTP;
    }
}
