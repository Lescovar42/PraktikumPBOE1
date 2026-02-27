/* Nama File    : Garis.java
 * Deskripsi    : main class untuk menguji class Garis
 * Pembuat      : Muhammad Farhan Abdul Azis
 * Tanggal      : 27 Februari 2026
 */

public class MGaris {
    public static void main(String[] args) {
        Titik t1 = new Titik(-2, 0);
        Titik t2 = new Titik(0, 4);
        Titik t3 = new Titik();
        Titik t4 = new Titik(1, 1);
        
        Garis g1 = new Garis(t1, t2);
        Garis g2 = new Garis();
        Garis g3 = new Garis(t3, t4);

        g1.printGaris();
        
        System.out.println("\nPanjang g1 : " + g1.getPanjang());
        System.out.println("Gradien g1 : " + g1.getGradien());

        System.out.println("\n--- Titik Tengah g1 ---");
        Titik tengahG1 = g1.getTitikTengah();
        System.out.println("Titik Tengah: (" + tengahG1.getAbsis() + ", " + tengahG1.getOrdinat() + ")");
        
        System.out.println("\n--- Persamaan Garis ---");
        g1.printPersamaanGaris();
        
        System.out.println("\n--- Cek Sejajar & Tegak Lurus ---");
        System.out.println("Apakah g2 sejajar g3? " + g2.isSejajar(g3));
        System.out.println("Apakah g1 tegak lurus g2? " + g1.isTegakLurus(g2));
        
        System.out.println("\n--- Counter Garis ---");
        System.out.println("Jumlah objek garis yang dibuat: " + Garis.getCounterGaris());
    }
}