/* Nama File    : MTitik.java
 * Deskripsi    : main class untuk menguji class Titik
 * Pembuat      : Muhammad Farhan Abdul Azis
 * Tanggal      : 06 Maret 2026
 */

public class MTitik {
    public static void main(String[] args) {
        // Membuat objek Titik
        Titik t1 = new Titik(3, 4);
        
        // Memanggil method public
        System.out.println("--- Informasi Titik t1 ---");
        t1.printTitik();
        System.out.println("Absis (melalui getter): " + t1.getAbsis());
        System.out.println("Ordinat (melalui getter): " + t1.getOrdinat());
        
        // Mengubah nilai atribut melalui mutator
        t1.setAbsis(5);
        t1.setOrdinat(12);
        System.out.println("\n--- Setelah Mutator ---");
        t1.printTitik();
        
        // Memanggil method lainnya
        System.out.println("Kuadran: " + t1.getKuadran());
        System.out.println("Jarak Pusat: " + t1.getJarakPusat());
        
        // Memanggil static getter
        System.out.println("\nJumlah objek Titik yang dibuat: " + Titik.getCounterTitik());
        
        /* 
         * Eksperimen: Jika kita mencoba mengakses 't1.absis' secara langsung, 
         * maka akan terjadi compile error karena atribut tersebut bersifat private.
         * Contoh: System.out.println(t1.absis); // Error: absis has private access in Titik
         */
    }
}
