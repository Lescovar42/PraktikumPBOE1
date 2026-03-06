/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik dengan access modifier
 * Pembuat      : Muhammad Farhan Abdul Azis
 * Tanggal      : 06 Maret 2026
 */

public class Titik {
    /********************ATRIBUT**********************/
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    /********************METHOD**********************/
    //konstruktor untuk membuat titik (0,0)
    public Titik() {
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    // konstruktor overloading :
    public Titik(double x, double y) {
        absis = x;
        ordinat = y;
        counterTitik++;
    }

    //mengembalikan nilai absis
    public double getAbsis() {
        return absis;
    }

    //mengembalikan nilai ordinat
    public double getOrdinat() {
        return ordinat;
    }

    //mengeset absis titik dengan nilai baru x
    public void setAbsis(double x) {
        absis = x;
    }

    //mengeset ordinat titik dengan nilai baru y
    public void setOrdinat(double y) {
        ordinat = y;
    }

    //mengembalikan counterTitik
    public static int getCounterTitik() {
        return counterTitik;
    }

    //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    public void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    //mencetak koordinat titik
    public void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    //mengembalikan kuadran titik (1,2,3,4) atau 0 jika berada di sumbu
    public int getKuadran() {
        if (absis > 0 && ordinat > 0) {
            return 1;
        } else if (absis < 0 && ordinat > 0) {
            return 2;
        } else if (absis < 0 && ordinat < 0) {
            return 3;
        } else if (absis > 0 && ordinat < 0) {
            return 4;
        } else {
            return 0; // pada salah satu sumbu
        }
    }

    //jarak titik ke pusat (0,0)
    public double getJarakPusat() {
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    //jarak antara dua titik
    public double getJarak(Titik t) {
        double dx = absis - t.getAbsis();
        double dy = ordinat - t.getOrdinat();
        return Math.sqrt(dx * dx + dy * dy);
    }

    //refleksi terhadap sumbu X (prosedur - mengubah titik ini)
    public void refleksiX() {
        ordinat = -ordinat;
    }

    //refleksi terhadap sumbu Y (prosedur - mengubah titik ini)
    public void refleksiY() {
        absis = -absis;
    }

    //refleksi terhadap sumbu X (fungsi - mengembalikan titik baru)
    public Titik getRefleksiX() {
        return new Titik(absis, -ordinat);
    }

    //refleksi terhadap sumbu Y (fungsi - mengembalikan titik baru)
    public Titik getRefleksiY() {
        return new Titik(-absis, ordinat);
    }

} //end class Titik
