// Nama File    : Kembangtelon.java
// NIM          : 24060124140166
// Nama         : Muhammad Farhan Abdul Azis
// Tanggal      : 2 Mei 2026

public class Kembangtelon extends Kucing {
    public Kembangtelon(String nama, double bobot) {
        super(nama, bobot);
    }

    @Override
    public String toString() {
        return "Kembangtelon: " + this.getNama() + " (" + this.getBobot() + " kg)";
    }
}
