package Polimorfisme;

public class PegawaiTetap extends Pegawai{

    private double upah;

    public PegawaiTetap(String nama, String noKTP, double upah) {
        super(nama, noKTP);
        this.upah = upah;
    }

    PegawaiTetap() {}

    public double getUpah() {
        return upah;
    }

    public void setUpah(double upah) {
        this.upah = upah;
    }

    public double gaji() {
        return getUpah();
    }

    @Override
    public String toString() {
        return  "========================================\n" +
                "Pegawai Tetap      :   " + super.toString() + "\n" +
                "Upah               :   Rp" + String.format("%.0f", getUpah()) + "\n" +
                "Pendapatan         :   Rp" + String.format("%.0f", gaji()) + "\n" +
                "========================================\n";
    }
}
