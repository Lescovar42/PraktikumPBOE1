// Nama File    : Kucing.java
// NIM          : 24060124140166
// Nama         : Muhammad Farhan Abdul Azis
// Tanggal      : 2 Mei 2026

public class Kucing extends Anabul {
    protected double bobot;

    public Kucing(String nama, double bobot) {
        super(nama);
        this.bobot = bobot;
    }

    public double getBobot() {
        return bobot;
    }

    @Override
    public void gerak() {
        System.out.println("melata");
    }

    @Override
    public void bersuara() {
        System.out.println("meong");
    }
}
