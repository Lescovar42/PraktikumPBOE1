/**
 * File      : DiskonLambda.java
 * Nama      : Muhammad Farhan Abdul Azis
 * NIM       : 24060124140166
 * Deskripsi : Ekspresi lambda dasar, digunakan untuk menghitung diskon.
 */

interface IDiskon {
    public double hitungDiskon(int harga);
}

public class DiskonLambda {
    public static void main(String[] args) {

        // Tanpa lambda (menggunakan anonymous class)
        IDiskon diskonMerdeka = new IDiskon() {
            public double hitungDiskon(int harga) {
                return harga - (harga * 0.3);
            }
        };

        // Dengan lambda (ekspresi langsung)
        IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);

        // Dengan lambda menggunakan blok statement
        IDiskon diskonBiasa = (harga) -> {
            return harga - (harga * 0.1);
        };

        System.out.println("=== Praktikum 3.1 - Dasar Ekspresi Lambda ===");
        System.out.println("Harga awal: Rp 45.000");
        System.out.println("----------------------------------------------");
        System.out.println("Diskon Merdeka (30%): Rp " + diskonMerdeka.hitungDiskon(45000));
        System.out.println("Diskon Lebaran (40%): Rp " + diskonLebaran.hitungDiskon(45000));
        System.out.println("Diskon Biasa   (10%): Rp " + diskonBiasa.hitungDiskon(45000));
    }
}
