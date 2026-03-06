/* Nama File    : MGaris.java
 * Deskripsi    : main class untuk menguji class Garis
 * Pembuat      : Muhammad Farhan Abdul Azis
 * Tanggal      : 06 Maret 2026
 */

public class MGaris {
    public static void main(String[] args) {
        // Membuat titik-titik
        Titik t1 = new Titik(-2, 0);
        Titik t2 = new Titik(0, 4);
        Titik t3 = new Titik(0, 0);
        Titik t4 = new Titik(1, 1);
        
        // Menguji Konstruktor
        Garis g1 = new Garis(t1, t2); // Garis (-2,0) ke (0,4)
        Garis g2 = new Garis();       // Garis (0,0) ke (1,1)
        Garis g3 = new Garis(t3, t4); // Sama dengan g2
        
        System.out.println(" Data Garis 1 ");
        g1.displayGaris();
        System.out.println("Panjang: " + g1.getPanjang());
        System.out.println("Gradien: " + g1.getGradien());
        System.out.print("Titik Tengah: ");
        g1.getTitikTengah().printTitik();
        System.out.println("Persamaan Garis: " + g1.getPersamaanGaris());
        
        System.out.println("\n Data Garis 2 ");
        g2.displayGaris();
        System.out.println("Panjang: " + g2.getPanjang());
        System.out.println("Gradien: " + g2.getGradien());
        System.out.print("Titik Tengah: ");
        g2.getTitikTengah().printTitik();
        System.out.println("Persamaan Garis: " + g2.getPersamaanGaris());

        System.out.println("\n Cek Sejajar & Tegak Lurus ");
        System.out.println("Apakah g2 sejajar g3? " + g2.isSejajar(g3)); // Harusnya true
        
        Garis g4 = new Garis(new Titik(0, 1), new Titik(1, 0));
        System.out.println("Garis g4:");
        g4.displayGaris();
        System.out.println("Apakah g2 tegak lurus g4? " + g2.isTegakLurus(g4)); // Harusnya true

        System.out.println("\n Counter Garis ");
        System.out.println("Banyaknya objek garis yang telah dibuat: " + Garis.getCounterGaris());
    }
}
