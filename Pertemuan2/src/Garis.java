/* Nama File    : Garis.java
 * Deskripsi    : berisi atribut dan method dalam class Garis
 * Pembuat      : Muhammad Farhan Abdul Azis
 * Tanggal      : 27 Februari 2026
 */

public class Garis {
    /********************ATRIBUT**********************/
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;

    /********************METHOD**********************/
    Garis() {
        this.titikAwal = new Titik();
        this.titikAkhir = new Titik(1, 1);
        counterGaris++;
    }

    Garis(Titik awal, Titik akhir) {
        this.titikAwal = awal;
        this.titikAkhir = akhir;
        counterGaris++;
    }

    //mengembalikan titik awal
    Titik getTitikAwal() {
        return titikAwal;
    }

    //mengeset titik awal
    void setTitikAwal(Titik titikAwal) {
        this.titikAwal = titikAwal;
    }

    //mengembalikan titik akhir
    Titik getTitikAkhir() {
        return titikAkhir;
    }

    //mengeset titik akhir
    void setTitikAkhir(Titik titikAkhir) {
        this.titikAkhir = titikAkhir;
    }

    //mengembalikan counter garis
    static int getCounterGaris() {
        return counterGaris;
    }

    //menghitung dan mengembalikan panjang garis
    double getPanjang() {
        double dx = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double dy = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        return Math.sqrt(dx * dx + dy * dy);
    }

    //menghitung dan mengembalikan gradien garis
    double getGradien() {
        double dx = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double dy = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        return dy / dx; 
    }

    //menghitung dan mengembalikan titik tengah garis
    Titik getTitikTengah() {
        double midX = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
        double midY = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;
        return new Titik(midX, midY);
    }

    //mengecek apakah garis sejajar dengan garis lain
    boolean isSejajar(Garis G) {
        return this.getGradien() == G.getGradien();
    }

    //mengecek apakah garis tegak lurus dengan garis lain
    boolean isTegakLurus(Garis G) {
        return (this.getGradien() * G.getGradien()) == -1;
    }

    //mencetak titik awal dan titik akhir
    void printGaris() {
        System.out.println("Titik Awal: (" + titikAwal.getAbsis() + ", " + titikAwal.getOrdinat() + ")");
        System.out.println("Titik Akhir: (" + titikAkhir.getAbsis() + ", " + titikAkhir.getOrdinat() + ")");
    }

    //mencetak persamaan garis dalam bentuk y = mx + c
    void printPersamaanGaris() {
        double m = getGradien();
        double c = titikAwal.getOrdinat() - (m * titikAwal.getAbsis());
        
        System.out.println("Persamaan Garis: y = " + m + "x + " + c);
    }

} //end class Garis