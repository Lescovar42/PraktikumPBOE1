/* Nama File    : Garis.java
 * Deskripsi    : berisi atribut dan method dalam class Garis dengan access modifier
 * Pembuat      : Muhammad Farhan Abdul Azis
 * Tanggal      : 06 Maret 2026
 */

public class Garis {
    /********************ATRIBUT**********************/
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;

    /********************METHOD**********************/
    // Konstruktor tanpa parameter yang menginisialisasi titik awal dengan (0,0) dan titik akhir dengan (1,1)
    public Garis() {
        this.titikAwal = new Titik();
        this.titikAkhir = new Titik(1, 1);
        counterGaris++;
    }

    // Konstruktor dengan parameter masukan titik awal dan titik akhir
    public Garis(Titik awal, Titik akhir) {
        this.titikAwal = awal;
        this.titikAkhir = akhir;
        counterGaris++;
    }

    // Selektor (getter) untuk titik awal
    public Titik getTitikAwal() {
        return titikAwal;
    }

    // Mutator (setter) untuk titik awal
    public void setTitikAwal(Titik titikAwal) {
        this.titikAwal = titikAwal;
    }

    // Selektor (getter) untuk titik akhir
    public Titik getTitikAkhir() {
        return titikAkhir;
    }

    // Mutator (setter) untuk titik akhir
    public void setTitikAkhir(Titik titikAkhir) {
        this.titikAkhir = titikAkhir;
    }

    // Selektor untuk mendapatkan atribut static counterGaris
    public static int getCounterGaris() {
        return counterGaris;
    }

    // Method untuk mendapatkan panjang sebuah garis
    public double getPanjang() {
        return titikAwal.getJarak(titikAkhir);
    }

    // Method untuk mendapatkan gradien dari sebuah garis
    public double getGradien() {
        double x1 = titikAwal.getAbsis();
        double y1 = titikAwal.getOrdinat();
        double x2 = titikAkhir.getAbsis();
        double y2 = titikAkhir.getOrdinat();
        return (y2 - y1) / (x2 - x1);
    }

    // Method untuk mendapatkan titik tengah dari sebuah garis
    public Titik getTitikTengah() {
        double midX = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
        double midY = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;
        return new Titik(midX, midY);
    }

    // Method untuk mengecek apakah garis tersebut sejajar dengan sebuah garis lainnya
    public boolean isSejajar(Garis g) {
        return this.getGradien() == g.getGradien();
    }

    // Method untuk mengecek apakah garis tersebut tegak lurus dengan sebuah garis lainnya
    public boolean isTegakLurus(Garis g) {
        return (this.getGradien() * g.getGradien()) == -1;
    }

    // Method untuk menampilkan ke layar titik awal dan titik akhir garis
    public void displayGaris() {
        System.out.println("Garis dari (" + titikAwal.getAbsis() + ", " + titikAwal.getOrdinat() + ") ke (" + titikAkhir.getAbsis() + ", " + titikAkhir.getOrdinat() + ")");
    }

    // Method untuk menampilkan persamaan garis dalam bentuk string y = mx + c
    public String getPersamaanGaris() {
        double m = getGradien();
        double c = titikAwal.getOrdinat() - (m * titikAwal.getAbsis());
        return "y = " + m + "x + " + c;
    }

} //end class Garis
